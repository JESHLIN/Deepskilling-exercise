CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
   v_Balance NUMBER;
BEGIN
   -- Check for Withdrawal
   IF :NEW.TransactionType = 'Withdrawal' THEN
      SELECT Balance INTO v_Balance FROM Accounts WHERE AccountID = :NEW.AccountID;

      IF :NEW.Amount > v_Balance THEN
         RAISE_APPLICATION_ERROR(-20004, 'Withdrawal amount exceeds available balance.');
      END IF;

   ELSIF :NEW.TransactionType = 'Deposit' THEN
      IF :NEW.Amount <= 0 THEN
         RAISE_APPLICATION_ERROR(-20005, 'Deposit amount must be positive.');
      END IF;
   END IF;
END;
/

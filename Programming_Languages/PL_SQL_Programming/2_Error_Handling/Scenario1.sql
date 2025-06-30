CREATE OR REPLACE PROCEDURE SafeTransferFunds (
   p_FromAccountID IN NUMBER,
   p_ToAccountID IN NUMBER,
   p_Amount IN NUMBER
) AS
   v_FromBalance NUMBER;
BEGIN
   -- Check sufficient balance
   SELECT Balance INTO v_FromBalance FROM Accounts WHERE AccountID = p_FromAccountID;

   IF v_FromBalance < p_Amount THEN
      RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
   END IF;

   -- Perform Transfer
   UPDATE Accounts SET Balance = Balance - p_Amount WHERE AccountID = p_FromAccountID;
   UPDATE Accounts SET Balance = Balance + p_Amount WHERE AccountID = p_ToAccountID;

   COMMIT;

EXCEPTION
   WHEN OTHERS THEN
      ROLLBACK;
      INSERT INTO Error_Log (ErrorTime, ErrorMessage)
      VALUES (SYSDATE, 'Error in SafeTransferFunds: ' || SQLERRM);
END;
/

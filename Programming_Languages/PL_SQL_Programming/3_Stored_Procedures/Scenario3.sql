CREATE OR REPLACE PROCEDURE TransferFunds (
   p_FromAccountID IN NUMBER,
   p_ToAccountID IN NUMBER,
   p_Amount IN NUMBER
) AS
   v_FromBalance NUMBER;
BEGIN
   -- Check available balance
   SELECT Balance INTO v_FromBalance FROM Accounts WHERE AccountID = p_FromAccountID;

   IF v_FromBalance < p_Amount THEN
      RAISE_APPLICATION_ERROR(-20003, 'Insufficient funds in source account.');
   END IF;

   -- Deduct from source
   UPDATE Accounts
   SET Balance = Balance - p_Amount
   WHERE AccountID = p_FromAccountID;

   -- Add to destination
   UPDATE Accounts
   SET Balance = Balance + p_Amount
   WHERE AccountID = p_ToAccountID;

   COMMIT;

EXCEPTION
   WHEN NO_DATA_FOUND THEN
      ROLLBACK;
      DBMS_OUTPUT.PUT_LINE('Invalid Account ID. Please check account numbers.');
   WHEN OTHERS THEN
      ROLLBACK;
      DBMS_OUTPUT.PUT_LINE('Error in TransferFunds: ' || SQLERRM);
END;
/

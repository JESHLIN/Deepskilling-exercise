CREATE OR REPLACE PROCEDURE AddNewCustomer (
   p_CustomerID IN NUMBER,
   p_CustomerName IN VARCHAR2,
   p_Age IN NUMBER
) AS
BEGIN
   INSERT INTO Customers (CustomerID, CustomerName, Age)
   VALUES (p_CustomerID, p_CustomerName, p_Age);

   COMMIT;

EXCEPTION
   WHEN DUP_VAL_ON_INDEX THEN
      ROLLBACK;
      INSERT INTO Error_Log (ErrorTime, ErrorMessage)
      VALUES (SYSDATE, 'Duplicate Customer ID: ' || p_CustomerID);

   WHEN OTHERS THEN
      ROLLBACK;
      INSERT INTO Error_Log (ErrorTime, ErrorMessage)
      VALUES (SYSDATE, 'Error in AddNewCustomer: ' || SQLERRM);
END;
/

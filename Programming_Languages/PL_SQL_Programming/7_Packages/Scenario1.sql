CREATE OR REPLACE PACKAGE CustomerManagement AS
   PROCEDURE AddCustomer(p_CustomerID NUMBER, p_CustomerName VARCHAR2, p_Age NUMBER);
   PROCEDURE UpdateCustomerDetails(p_CustomerID NUMBER, p_CustomerName VARCHAR2, p_Age NUMBER);
   FUNCTION GetCustomerBalance(p_CustomerID NUMBER) RETURN NUMBER;
END CustomerManagement;
/
CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

   PROCEDURE AddCustomer(p_CustomerID NUMBER, p_CustomerName VARCHAR2, p_Age NUMBER) IS
   BEGIN
      INSERT INTO Customers (CustomerID, CustomerName, Age)
      VALUES (p_CustomerID, p_CustomerName, p_Age);
      COMMIT;
   END AddCustomer;

   PROCEDURE UpdateCustomerDetails(p_CustomerID NUMBER, p_CustomerName VARCHAR2, p_Age NUMBER) IS
   BEGIN
      UPDATE Customers
      SET CustomerName = p_CustomerName, Age = p_Age
      WHERE CustomerID = p_CustomerID;
      COMMIT;
   END UpdateCustomerDetails;

   FUNCTION GetCustomerBalance(p_CustomerID NUMBER) RETURN NUMBER IS
      v_TotalBalance NUMBER;
   BEGIN
      SELECT SUM(Balance) INTO v_TotalBalance FROM Accounts WHERE CustomerID = p_CustomerID;
      RETURN NVL(v_TotalBalance, 0);
   END GetCustomerBalance;

END CustomerManagement;
/

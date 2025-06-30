CREATE OR REPLACE PACKAGE EmployeeManagement AS
   PROCEDURE HireEmployee(p_EmployeeID NUMBER, p_Name VARCHAR2, p_DepartmentID NUMBER, p_Salary NUMBER);
   PROCEDURE UpdateEmployeeDetails(p_EmployeeID NUMBER, p_Name VARCHAR2, p_DepartmentID NUMBER, p_Salary NUMBER);
   FUNCTION CalculateAnnualSalary(p_EmployeeID NUMBER) RETURN NUMBER;
END EmployeeManagement;
/
CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

   PROCEDURE HireEmployee(p_EmployeeID NUMBER, p_Name VARCHAR2, p_DepartmentID NUMBER, p_Salary NUMBER) IS
   BEGIN
      INSERT INTO Employees (EmployeeID, EmployeeName, DepartmentID, Salary)
      VALUES (p_EmployeeID, p_Name, p_DepartmentID, p_Salary);
      COMMIT;
   END HireEmployee;

   PROCEDURE UpdateEmployeeDetails(p_EmployeeID NUMBER, p_Name VARCHAR2, p_DepartmentID NUMBER, p_Salary NUMBER) IS
   BEGIN
      UPDATE Employees
      SET EmployeeName = p_Name, DepartmentID = p_DepartmentID, Salary = p_Salary
      WHERE EmployeeID = p_EmployeeID;
      COMMIT;
   END UpdateEmployeeDetails;

   FUNCTION CalculateAnnualSalary(p_EmployeeID NUMBER) RETURN NUMBER IS
      v_Salary NUMBER;
   BEGIN
      SELECT Salary INTO v_Salary FROM Employees WHERE EmployeeID = p_EmployeeID;
      RETURN v_Salary * 12;
   END CalculateAnnualSalary;

END EmployeeManagement;
/

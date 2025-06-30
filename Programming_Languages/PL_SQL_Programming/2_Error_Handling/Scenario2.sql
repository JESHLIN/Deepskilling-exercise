CREATE OR REPLACE PROCEDURE UpdateSalary (
   p_EmployeeID IN NUMBER,
   p_Percent IN NUMBER
) AS
BEGIN
   -- Try to update salary
   UPDATE Employees
   SET Salary = Salary + (Salary * p_Percent / 100)
   WHERE EmployeeID = p_EmployeeID;

   IF SQL%ROWCOUNT = 0 THEN
      RAISE_APPLICATION_ERROR(-20002, 'Employee ID does not exist.');
   END IF;

   COMMIT;

EXCEPTION
   WHEN OTHERS THEN
      ROLLBACK;
      INSERT INTO Error_Log (ErrorTime, ErrorMessage)
      VALUES (SYSDATE, 'Error in UpdateSalary: ' || SQLERRM);
END;
/

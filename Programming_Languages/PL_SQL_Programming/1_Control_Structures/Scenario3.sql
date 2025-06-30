DECLARE
   CURSOR due_loans IS
      SELECT l.LoanID, l.CustomerID, c.CustomerName, l.DueDate
      FROM Loans l
      JOIN Customers c ON l.CustomerID = c.CustomerID
      WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
   FOR rec IN due_loans LOOP
      DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || rec.CustomerName || 
                           ', your loan (Loan ID: ' || rec.LoanID || 
                           ') is due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY') || '.');
   END LOOP;
END;
/

DECLARE
   CURSOR monthly_transactions IS
      SELECT t.CustomerID, c.CustomerName, t.TransactionID, t.Amount, t.TransactionDate, t.TransactionType
      FROM Transactions t
      JOIN Customers c ON t.CustomerID = c.CustomerID
      WHERE EXTRACT(MONTH FROM t.TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
        AND EXTRACT(YEAR FROM t.TransactionDate) = EXTRACT(YEAR FROM SYSDATE);

BEGIN
   FOR rec IN monthly_transactions LOOP
      DBMS_OUTPUT.PUT_LINE('Customer: ' || rec.CustomerName || 
                           ', Transaction ID: ' || rec.TransactionID || 
                           ', Type: ' || rec.TransactionType || 
                           ', Amount: ' || rec.Amount || 
                           ', Date: ' || TO_CHAR(rec.TransactionDate, 'DD-MON-YYYY'));
   END LOOP;
END;
/

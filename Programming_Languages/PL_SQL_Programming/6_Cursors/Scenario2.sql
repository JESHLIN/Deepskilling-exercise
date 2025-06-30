DECLARE
   CURSOR account_cursor IS
      SELECT AccountID, Balance FROM Accounts;

BEGIN
   FOR rec IN account_cursor LOOP
      UPDATE Accounts
      SET Balance = Balance - 100
      WHERE AccountID = rec.AccountID;
   END LOOP;

   COMMIT;
END;
/

DECLARE
   CURSOR loan_cursor IS
      SELECT LoanID, InterestRate FROM Loans;

BEGIN
   FOR rec IN loan_cursor LOOP
      IF rec.InterestRate < 5 THEN
         UPDATE Loans
         SET InterestRate = rec.InterestRate + 0.5
         WHERE LoanID = rec.LoanID;
      ELSE
         UPDATE Loans
         SET InterestRate = rec.InterestRate + 0.25
         WHERE LoanID = rec.LoanID;
      END IF;
   END LOOP;

   COMMIT;
END;
/

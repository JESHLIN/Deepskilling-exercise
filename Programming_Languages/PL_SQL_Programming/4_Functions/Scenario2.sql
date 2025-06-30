CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
   p_LoanAmount IN NUMBER,
   p_AnnualInterestRate IN NUMBER,
   p_Years IN NUMBER
) RETURN NUMBER IS
   v_MonthlyInterestRate NUMBER;
   v_TotalMonths NUMBER;
   v_Installment NUMBER;
BEGIN
   v_MonthlyInterestRate := p_AnnualInterestRate / (12 * 100);
   v_TotalMonths := p_Years * 12;

   IF v_MonthlyInterestRate = 0 THEN
      v_Installment := p_LoanAmount / v_TotalMonths;
   ELSE
      v_Installment := p_LoanAmount * v_MonthlyInterestRate / 
                       (1 - POWER(1 + v_MonthlyInterestRate, -v_TotalMonths));
   END IF;

   RETURN ROUND(v_Installment, 2);
END;
/

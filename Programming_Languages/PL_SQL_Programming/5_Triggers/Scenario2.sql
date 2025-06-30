CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
   INSERT INTO AuditLog (LogID, TransactionID, Action, LogTime)
   VALUES (AuditLog_seq.NEXTVAL, :NEW.TransactionID, 'INSERT', SYSDATE);
END;
/

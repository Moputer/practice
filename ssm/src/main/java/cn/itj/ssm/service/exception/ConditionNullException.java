package cn.itj.ssm.service.exception;

public class ConditionNullException extends ServiceException{
    public ConditionNullException() {
    }

    public ConditionNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ConditionNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConditionNullException(String message) {
        super(message);
    }

    public ConditionNullException(Throwable cause) {
        super(cause);
    }
}

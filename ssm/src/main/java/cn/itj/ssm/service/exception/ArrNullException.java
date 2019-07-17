package cn.itj.ssm.service.exception;

public class ArrNullException extends ServiceException {
    public ArrNullException() {
    }

    public ArrNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ArrNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrNullException(String message) {
        super(message);
    }

    public ArrNullException(Throwable cause) {
        super(cause);
    }
}

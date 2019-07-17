package cn.itj.ssm.service.exception;

public class UserNullException extends ServiceException {
    public UserNullException() {
    }

    public UserNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UserNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNullException(String message) {
        super(message);
    }

    public UserNullException(Throwable cause) {
        super(cause);
    }
}

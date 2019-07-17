package cn.itj.ssm.service.exception;

public class UsernameOrPasswordException extends ServiceException {
    public UsernameOrPasswordException() {
    }

    public UsernameOrPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UsernameOrPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameOrPasswordException(String message) {
        super(message);
    }

    public UsernameOrPasswordException(Throwable cause) {
        super(cause);
    }
}

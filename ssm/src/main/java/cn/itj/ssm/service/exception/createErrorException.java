package cn.itj.ssm.service.exception;

public class createErrorException extends ServiceException {
    public createErrorException() {
    }

    public createErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public createErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public createErrorException(String message) {
        super(message);
    }

    public createErrorException(Throwable cause) {
        super(cause);
    }
}

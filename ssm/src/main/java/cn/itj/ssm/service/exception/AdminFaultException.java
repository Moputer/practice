package cn.itj.ssm.service.exception;

public class AdminFaultException extends ServiceException {
    public AdminFaultException() {
    }

    public AdminFaultException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AdminFaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdminFaultException(String message) {
        super(message);
    }

    public AdminFaultException(Throwable cause) {
        super(cause);
    }
}

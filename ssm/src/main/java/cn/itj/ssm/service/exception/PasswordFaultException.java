package cn.itj.ssm.service.exception;

/**
 * 密码错误异常
 */
public class PasswordFaultException extends ServiceException{
    public PasswordFaultException() {
    }

    public PasswordFaultException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public PasswordFaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordFaultException(String message) {
        super(message);
    }

    public PasswordFaultException(Throwable cause) {
        super(cause);
    }
}

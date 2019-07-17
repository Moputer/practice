package cn.itj.ssm.service.exception;

public class StudentRepeatException extends ServiceException{
    public StudentRepeatException() {
    }

    public StudentRepeatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public StudentRepeatException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentRepeatException(String message) {
        super(message);
    }

    public StudentRepeatException(Throwable cause) {
        super(cause);
    }
}

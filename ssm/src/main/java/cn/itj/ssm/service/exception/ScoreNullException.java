package cn.itj.ssm.service.exception;

public class ScoreNullException extends ServiceException {
    public ScoreNullException() {
    }

    public ScoreNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ScoreNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScoreNullException(String message) {
        super(message);
    }

    public ScoreNullException(Throwable cause) {
        super(cause);
    }
}

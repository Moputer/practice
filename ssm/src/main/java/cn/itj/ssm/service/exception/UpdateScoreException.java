package cn.itj.ssm.service.exception;

public class UpdateScoreException extends ServiceException{
    public UpdateScoreException() {
    }

    public UpdateScoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UpdateScoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateScoreException(String message) {
        super(message);
    }

    public UpdateScoreException(Throwable cause) {
        super(cause);
    }
}

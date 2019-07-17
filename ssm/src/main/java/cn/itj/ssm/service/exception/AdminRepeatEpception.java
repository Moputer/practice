package cn.itj.ssm.service.exception;

public class AdminRepeatEpception extends ServiceException {
    public AdminRepeatEpception() {
    }

    public AdminRepeatEpception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AdminRepeatEpception(String message, Throwable cause) {
        super(message, cause);
    }

    public AdminRepeatEpception(String message) {
        super(message);
    }

    public AdminRepeatEpception(Throwable cause) {
        super(cause);
    }
}

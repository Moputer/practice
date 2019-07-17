package cn.itj.ssm.service.exception;

public class AddErrorEpception extends ServiceException {
    public AddErrorEpception() {
    }

    public AddErrorEpception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AddErrorEpception(String message, Throwable cause) {
        super(message, cause);
    }

    public AddErrorEpception(String message) {
        super(message);
    }

    public AddErrorEpception(Throwable cause) {
        super(cause);
    }
}

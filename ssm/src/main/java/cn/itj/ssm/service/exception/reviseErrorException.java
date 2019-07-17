package cn.itj.ssm.service.exception;

//修改学生
public class reviseErrorException extends ServiceException{
    public reviseErrorException() {
    }

    public reviseErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public reviseErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public reviseErrorException(String message) {
        super(message);
    }

    public reviseErrorException(Throwable cause) {
        super(cause);
    }
}

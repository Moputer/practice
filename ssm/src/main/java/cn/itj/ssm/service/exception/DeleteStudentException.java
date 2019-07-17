package cn.itj.ssm.service.exception;

/**
 * 删除学生失败异常
 */
public class DeleteStudentException extends ServiceException {
    public DeleteStudentException() {
    }

    public DeleteStudentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DeleteStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteStudentException(String message) {
        super(message);
    }

    public DeleteStudentException(Throwable cause) {
        super(cause);
    }
}

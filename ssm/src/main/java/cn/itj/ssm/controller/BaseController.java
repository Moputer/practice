package cn.itj.ssm.controller;

import javax.servlet.http.HttpSession;

import cn.itj.ssm.service.exception.*;
import cn.itj.ssm.util.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;



//控制器类的基类


public class BaseController {

//处理请求时，用于表示操作正确的代码


    public static final int SUCCESS = 200;

    @ExceptionHandler({ServiceException.class})
    public ResponseResult<Void>
    handleException(Exception e) {
        // 声明返回对象
        ResponseResult<Void> rr = new ResponseResult<Void>();
        // 在返回对象封装错误提示的文字
        rr.setMessage(e.getMessage());
        // 根据异常的不同，返回的错误代码也不同
        if (e instanceof AdminRepeatEpception) {
            // 400-用户名冲突
            rr.setState(400);
        } else if (e instanceof AddErrorEpception) {
            // 401
            rr.setState(401);
        }else if (e instanceof PasswordFaultException) {
            // 402 密码错误
            rr.setState(402);
        }else if (e instanceof AdminFaultException) {
            // 401 用户名错误
            rr.setState(403);
        }else if (e instanceof createErrorException){
            // 404 添加学生失败
            rr.setState(404);
        }
        // 返回
        return rr;
    }

}








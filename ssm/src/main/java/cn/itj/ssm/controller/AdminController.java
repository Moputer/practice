package cn.itj.ssm.controller;


import cn.itj.ssm.dao.Admin;
import cn.itj.ssm.dao.ScoreVO;
import cn.itj.ssm.dao.User;
import cn.itj.ssm.service.IAdminService;
import cn.itj.ssm.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AdminController extends BaseController {

    @Autowired
    private IAdminService iAdminService;

    @PostMapping("/reg")
    public ResponseResult<Void> register(Admin admin){
        iAdminService.reg(admin);
        return new ResponseResult<Void>(SUCCESS);
    }

    @PostMapping("/login")
    public ResponseResult<Void> login(String username,String password){

        iAdminService.login(username,password);
        return new ResponseResult<Void>(SUCCESS);
    }

    @GetMapping("/index")
    public ResponseResult<List<User>> index(User user){
        List<User> users=iAdminService.index(user);
        return new ResponseResult<>(SUCCESS,users);
    }
    @GetMapping("/num")
    public ResponseResult<Integer> num(User user){
        return new ResponseResult<>(SUCCESS,iAdminService.num(user));
    }
    @GetMapping("/add")
    public ResponseResult<Void> add(ScoreVO scoreVO){
        iAdminService.add(scoreVO);
        return new ResponseResult<Void>(SUCCESS);
    }

    @GetMapping("/delstudent")
    public ResponseResult<Void> delStudent(Integer studentId){

        iAdminService.delStudent(studentId);

        return new ResponseResult<>(SUCCESS);
    }

    /**
     *
     */
    @GetMapping("/revise")
    public ResponseResult<Void> revise(User user){
        iAdminService.reviseStudent(user);
        return new ResponseResult<Void>(SUCCESS);
    }

    @GetMapping("/reviseloading")
    public ResponseResult<User> reviseloading(Integer studentId){
        User user=iAdminService.reviseloading(studentId);
        return new ResponseResult<User>(SUCCESS,user);
    }

    @GetMapping("/details")
    public ResponseResult<ScoreVO> detailsLoading(Integer studentId){
        ScoreVO scoreVO=iAdminService.detailsLoading(studentId);
        return new ResponseResult<ScoreVO>(SUCCESS,scoreVO);
    }
    //批量删除
    @PostMapping("/delsome")
    public ResponseResult<Void> delsome(@RequestParam(value = "arr[]")Integer arr[]){
        iAdminService.delsome(arr);
        return new ResponseResult<>(SUCCESS);
    }

    //详情页修改成绩
    @GetMapping("/updatecouese")
    public ResponseResult<Void> updatecouese(ScoreVO scoreVO){
        iAdminService.updateCourse(scoreVO);
        return new ResponseResult<Void>(SUCCESS);
    }
}

package cn.itj.ssm.service;


import cn.itj.ssm.dao.Admin;
import cn.itj.ssm.dao.ScoreVO;
import cn.itj.ssm.dao.User;

import java.util.List;

public interface IAdminService {


    void login(String username, String password);

    List<User> index(User user);

    void add(ScoreVO scoreVO);

    void delStudent(Integer studentId);

    void reviseStudent(User user);

    User reviseloading(Integer studentId);



    ScoreVO detailsLoading(Integer studentId);

    void delsome(Integer[] arr);

    void updateCourse(ScoreVO scoreVO);

    //List<User> select

    public Integer num(User user);

    void reg(Admin admin);
}

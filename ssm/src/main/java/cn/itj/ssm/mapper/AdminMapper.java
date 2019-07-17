package cn.itj.ssm.mapper;

import cn.itj.ssm.dao.Admin;
import cn.itj.ssm.dao.ScoreVO;
import cn.itj.ssm.dao.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    Admin findByUsername(String username);
    //加载学生列表
    List<User> findAll(User user);
    //查询学生数据条数
    Integer findNumber(User user);
    //添加学生
    Integer createStudent(ScoreVO scoreVO);
    //添加学生成绩
    Integer createScore(ScoreVO scoreVO);
    //通过studentId查询
    Integer findByStudentId(Integer studentId);

    //删除学生
    Integer delByStudentId(Integer studentId);
    //修改学生
    Integer reviseStudent(User user);

    User findForLoading(Integer studentId);

    ScoreVO detailsLoading(Integer studentId);

    Integer delScore(Integer studentId);

    Integer updateScore(ScoreVO scoreVO);

    Integer addAdmin(Admin admin);
}

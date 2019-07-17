package cn.itj.ssm.service.impl;

import cn.itj.ssm.dao.Admin;
import cn.itj.ssm.dao.ScoreVO;
import cn.itj.ssm.dao.User;
import cn.itj.ssm.mapper.AdminMapper;
import cn.itj.ssm.service.IAdminService;
import cn.itj.ssm.service.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminImpl implements IAdminService {
    @Autowired
    private AdminMapper adminMapper;

    public void reg(Admin admin) throws AddErrorEpception,AdminRepeatEpception{
        //查询数据库是否已经有添加的用户
        if (admin.getUsername()==null||admin.getUsername()==""||
                admin.getPassword()==null||admin.getPassword()==""||
                admin.getPhone()==null||admin.getPhone()==""||
                admin.getIdnumber()==null||admin.getIdnumber()=="")
            throw new UsernameOrPasswordException("输入数据有误不合法");
        Admin findAdmin = adminMapper.findByUsername(admin.getUsername());
        if (admin.getUsername()==null||admin.getPassword()==null)throw new UsernameOrPasswordException("用户名或尼玛不合法");
        if (admin==null){
            //1.是:抛出异常,用户名重复
            throw new AdminRepeatEpception("数据有误");
        }else {
            //2.否:执行添加
            Integer rows = adminMapper.addAdmin(admin);
            //添加返回行数不为1
            if (rows!=1)throw new AddErrorEpception("添加错误请重试");
        }
    }

    /**
     *
     * @param username
     * @param password
     */
    @Override
    public void login(String username, String password) {
        //查找用户名是否存在
        if (username==null||username==""||
                password==null||password=="")
            throw new UsernameOrPasswordException("用户名或尼玛不合法");
        Admin admin=adminMapper.findByUsername(username);
         if (admin!=null){
            if(admin.getUsername().equals(username)){
                if (!admin.getPassword().equals(password)){
                    throw new PasswordFaultException("密码错误");
                }
            }else {
                throw new AdminFaultException("用户名错误");
            }
        }else {
            throw new AdminFaultException("用户名错误");
        }
    }

    //查询所有学生
    public List<User> index(User user) {
        if (user==null)throw new ConditionNullException("未查询到你需要的数据");
        user.setCurrentPage((user.getCurrentPage()-1)*5);
        List<User> users=adminMapper.findAll(user);
        return users;
    }
    //查询学生记录条数
    public Integer num(User user){
        Integer num=adminMapper.findNumber(user);
        num=num%5==0?num/5:num/5+1;
        return num;
    }

    /**
     * 添加学生
     * @param scoreVO
     */
@Transactional
    public void add(ScoreVO scoreVO){
        if (scoreVO ==null)throw new UserNullException("请完整输入添加数据");
        if (scoreVO.getStudentId()==null||
                scoreVO.getName()==null|| scoreVO.getAge()==null|| scoreVO.getMajor()==null||
                scoreVO.getGender()==null)throw new UserNullException("请完整输入添加数据");

        Integer studentId = adminMapper.findByStudentId(scoreVO.getStudentId());
        if (studentId!=null)throw new StudentRepeatException("学号重复");

        Integer rows=adminMapper.createStudent(scoreVO);
        adminMapper.createScore(scoreVO);
        if (rows!=1) throw new createErrorException("添加失败");
    }

    @Transactional
    public void delStudent(Integer studentId) {
        Integer rows=adminMapper.delByStudentId(studentId);
        Integer rows1=adminMapper.delScore(studentId);

        if (rows!=1||rows1!=1){
            throw new DeleteStudentException("删除失败,请重试");
        }
    }

    /**
     * 修改学生
     * @param user
     */
    @Override
    public void reviseStudent(User user) {
        if (user==null)throw new UsernameOrPasswordException("请完整填入数据");
        if (user.getStudentId()==null||user.getName()==""||
                user.getName()==null|| user.getAge()==null|| user.getMajor()==null||
                user.getGender()==null)throw new UserNullException("请完整输入添加数据");

        Integer rows=adminMapper.reviseStudent(user);

        //if (rows!=1)throw new reviseErrorException("修改失败");
    }
    //修改时加载
    @Override
    public User reviseloading(Integer studentId) {
        User user=adminMapper.findForLoading(studentId);
        return user;
    }


    /**
     * 学生详情加载页面
     * @param studentId
     * @return
     */
    @Override
    public ScoreVO detailsLoading(Integer studentId) {
        ScoreVO score=adminMapper.detailsLoading(studentId);
        return score;
    }
    @Transactional
    public void delsome(Integer[] arr) {
        if (arr==null)throw new ArrNullException("请选择学生");
        for (int i = 0; i < arr.length; i++) {
            Integer rows=adminMapper.delByStudentId(arr[i]);
            Integer rows1=adminMapper.delScore(arr[i]);
            if (rows!=1||rows1!=1){
                throw new DeleteStudentException("批量删除失败,删除"+arr[i]+"时出错");
            }
        }

    }

    @Override
    public void updateCourse(ScoreVO scoreVO) {
        if (scoreVO==null)throw new ScoreNullException("填数据合法数据");
        if (scoreVO.getMission()==null||scoreVO.getDance()==null||scoreVO.getDrawing()==null||
                scoreVO.getEducation()==null||scoreVO.getMusic()==null||scoreVO.getMentality()==null
                )throw new ScoreNullException("填数据合法数据");
        Integer rows=adminMapper.updateScore(scoreVO);
        if (rows!=1){
            throw new UpdateScoreException("更新成绩失败");
        }
    }
}

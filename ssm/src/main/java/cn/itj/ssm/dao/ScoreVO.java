package cn.itj.ssm.dao;


public class ScoreVO {
    private Integer id;
    private String phone;
    private Integer music;
    private Integer drawing;
    private Integer mission;
    private Integer dance;
    private Integer mentality;
    private Integer education;
    private Integer studentId;//学号
    private String name;//学生姓名
    private String gender;//性别
    private Integer age;//年龄
    private String major;//专业

    @Override
    public String toString() {
        return "ScoreVO{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", music=" + music +
                ", drawing=" + drawing +
                ", mission=" + mission +
                ", dance=" + dance +
                ", mentality=" + mentality +
                ", education=" + education +
                ", studentId=" + studentId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getMusic() {
        return music;
    }

    public void setMusic(Integer music) {
        this.music = music;
    }

    public Integer getDrawing() {
        return drawing;
    }

    public void setDrawing(Integer drawing) {
        this.drawing = drawing;
    }

    public Integer getMission() {
        return mission;
    }

    public void setMission(Integer mission) {
        this.mission = mission;
    }

    public Integer getDance() {
        return dance;
    }

    public void setDance(Integer dance) {
        this.dance = dance;
    }

    public Integer getMentality() {
        return mentality;
    }

    public void setMentality(Integer mentality) {
        this.mentality = mentality;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

package entity;


import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zhao
 * @since 2021-06-18
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学号
     */
    private String studentNo;

    /**
     * 姓名
     */
    private String studentName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生年月
     */
    private String birthday;

    /**
     * 班级编号
     */
    private String classNo;


    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Student(String studentNo, String studentName, String sex, String birthday, String classNo) {
        super();
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.sex = sex;
        this.birthday = birthday;
        this.classNo = classNo;
    }


    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", studentName=" + studentName +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", classNo=" + classNo +
                "}";
    }
}

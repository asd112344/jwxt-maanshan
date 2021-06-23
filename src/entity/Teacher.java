package entity;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author lian
 * @since 2021-06-18
 */
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教师编号
     */
    private String teacherNo;

    /**
     * 教师姓名
     */

    private String teacherName;

    /**
     * 职称
     */
    private String professional;

    /**
     * 院系编号
     */
    private String deptNo;


    public Teacher() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Teacher(String teacherNo, String teacherName, String professional, String deptNo) {
        super();
        this.teacherNo = teacherNo;
        this.teacherName = teacherName;
        this.professional = professional;
        this.deptNo = deptNo;
    }


    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherNo=" + teacherNo +
                ", teacherName=" + teacherName +
                ", professional=" + professional +
                ", deptNo=" + deptNo +
                "}";
    }
}

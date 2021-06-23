package entity;

import java.io.Serializable;
import java.time.Year;

/**
 * <p>
 *
 * </p>
 *
 * @author zhao
 * @since 2021-06-18
 */
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 年级
     */
    private Year grade;

    /**
     * 班级代码
     */
    private String classNo;

    /**
     * 班级名称
     */

    private String className;

    /**
     * 学历层次
     */

    private String classLevel;

    /**
     * 学生类别
     */

    private String stuType;

    /**
     * 所属专业
     */

    private String majorNo;


    public Class() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Class(Year grade, String classNo, String className, String classLevel, String stuType, String majorNo) {
        super();
        this.grade = grade;
        this.classNo = classNo;
        this.className = className;
        this.classLevel = classLevel;
        this.stuType = stuType;
        this.majorNo = majorNo;
    }

    public Year getGrade() {
        return grade;
    }

    public void setGrade(Year grade) {
        this.grade = grade;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }

    public String getStuType() {
        return stuType;
    }

    public void setStuType(String stuType) {
        this.stuType = stuType;
    }

    public String getMajorNo() {
        return majorNo;
    }

    public void setMajorNo(String majorNo) {
        this.majorNo = majorNo;
    }

    @Override
    public String toString() {
        return "Class{" +
                "grade=" + grade +
                ", classNo=" + classNo +
                ", className=" + className +
                ", classLevel=" + classLevel +
                ", stuType=" + stuType +
                ", majorNo=" + majorNo +
                "}";
    }
}

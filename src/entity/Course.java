package entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author zhao
 * @since 2021-06-18
 */
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类编号
     */

    private Integer courseTypeNo;

    /**
     * 课程代码
     */

    private String courseNo;

    /**
     * 课程名称
     */

    private String courseName;

    /**
     * 学分
     */
    private BigDecimal credit;

    /**
     * 学时
     */
    private Integer ctime;

    /**
     * 修读学期
     */

    private String openTeam;


    private String isRequire;

    /**
     * 开课院系
     */
    private String deptNo;

    /**
     * 备注
     */
    private String remark;


    public Course() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Course(Integer courseTypeNo, String courseNo, String courseName, BigDecimal credit, Integer ctime,
                  String openTeam, String isRequire, String deptNo, String remark) {
        super();
        this.courseTypeNo = courseTypeNo;
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.credit = credit;
        this.ctime = ctime;
        this.openTeam = openTeam;
        this.isRequire = isRequire;
        this.deptNo = deptNo;
        this.remark = remark;
    }


    public Integer getCourseTypeNo() {
        return courseTypeNo;
    }

    public void setCourseTypeNo(Integer courseTypeNo) {
        this.courseTypeNo = courseTypeNo;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public String getOpenTeam() {
        return openTeam;
    }

    public void setOpenTeam(String openTeam) {
        this.openTeam = openTeam;
    }

    public String getIsRequire() {
        return isRequire;
    }

    public void setIsRequire(String isRequire) {
        this.isRequire = isRequire;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseTypeNo=" + courseTypeNo +
                ", courseNo=" + courseNo +
                ", courseName=" + courseName +
                ", credit=" + credit +
                ", ctime=" + ctime +
                ", openTeam=" + openTeam +
                ", isRequire=" + isRequire +
                ", deptNo=" + deptNo +
                ", remark=" + remark +
                "}";
    }
}

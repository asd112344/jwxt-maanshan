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
public class Coursetype implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类编号
     */

    private Integer courseTypeNo;

    /**
     * 课程分类名
     */

    private String courseTypeName;


    public Coursetype() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Coursetype(Integer courseTypeNo, String courseTypeName) {
        super();
        this.courseTypeNo = courseTypeNo;
        this.courseTypeName = courseTypeName;
    }

    public Integer getCourseTypeNo() {
        return courseTypeNo;
    }

    public void setCourseTypeNo(Integer courseTypeNo) {
        this.courseTypeNo = courseTypeNo;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName;
    }

    @Override
    public String toString() {
        return "Coursetype{" +
                "courseTypeNo=" + courseTypeNo +
                ", courseTypeName=" + courseTypeName +
                "}";
    }
}

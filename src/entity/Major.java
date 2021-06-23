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
public class Major implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 专业代码
     */

    private String majorNo;

    /**
     * 专业名称
     */

    private String majorName;

    /**
     * 院系代码
     */
    private String deptNo;


    public Major() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Major(String majorNo, String majorName, String deptNo) {
        super();
        this.majorNo = majorNo;
        this.majorName = majorName;
        this.deptNo = deptNo;
    }


    public String getMajorNo() {
        return majorNo;
    }

    public void setMajorNo(String majorNo) {
        this.majorNo = majorNo;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Major{" +
                "majorNo=" + majorNo +
                ", majorName=" + majorName +
                ", deptNo=" + deptNo +
                "}";
    }
}

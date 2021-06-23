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
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 院系代码
     */
    private String deptNo;

    /**
     * 院系名称
     */
    private String deptName;


    public Dept() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Dept(String deptNo, String deptName) {
        super();
        this.deptNo = deptNo;
        this.deptName = deptName;
    }


    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", deptName=" + deptName +
                "}";
    }
}

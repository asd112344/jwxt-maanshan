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
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学期编号
     */

    private Integer teamNo;

    /**
     * 学年度
     */

    private String teamYear;

    /**
     * 学期
     */
    private String team;


    public Team() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Team(Integer teamNo, String teamYear, String team) {
        super();
        this.teamNo = teamNo;
        this.teamYear = teamYear;
        this.team = team;
    }


    public Integer getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(Integer teamNo) {
        this.teamNo = teamNo;
    }

    public String getTeamYear() {
        return teamYear;
    }

    public void setTeamYear(String teamYear) {
        this.teamYear = teamYear;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamNo=" + teamNo +
                ", teamYear=" + teamYear +
                ", team=" + team +
                "}";
    }
}

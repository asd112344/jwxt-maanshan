package dao.impl;

import dao.TeamDao;
import entity.Team;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TeamDaoImpl implements TeamDao {

	private QueryRunner runner = new QueryRunner();

	public static void main(String[] args) {
		TeamDaoImpl teamDaoImpl = new TeamDaoImpl();

//		Team team = new Team(3,"2021","上学期");
//		teamDaoImpl.insert(team);

//		Team team = new Team(3,"2021","下学期");
//		teamDaoImpl.update(team);

		teamDaoImpl.delete(3);

		List<Team> allTeam = teamDaoImpl.getAllTeam();

		allTeam.forEach(System.out::println);
	}

	@Override
	public List<Team> getAllTeam() {
		String sql = "select * FROM team";
		Connection conn = null;

		try {
			conn = JDBCUtils.getConnection();
			List<Team> allTeam = runner.query(conn, sql, new BeanListHandler<Team>(Team.class));
			return allTeam;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return null;
	}

	@Override
	public int insert(Team term) {
		String sql = "Insert into team(teamNo,teamYear,team) values(?,?,?)";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, term.getTeamNo(), term.getTeamYear(), term.getTeam());
			return update;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}

		return 0;
	}

	@Override
	public int update(Team term) {
		String sql = "UPDATE team SET teamYear = ?,team = ? WHERE teamNo = ?";
		Connection conn = null;

		conn = JDBCUtils.getConnection();
		try {
			int update = runner.update(conn, sql, term.getTeamYear(), term.getTeam(), term.getTeamNo());
			return update;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return 0;
	}

	@Override
	public int delete(Integer termNo) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM team WHERE teamNo = ?";
		Connection conn = null;

		conn = JDBCUtils.getConnection();
		try {
			int delete = runner.update(conn, sql, termNo);
			return delete;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return 0;
	}

}

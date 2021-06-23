package dao.impl;

import dao.MajorDao;
import entity.Major;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MajorDaoImpl implements MajorDao {
	private QueryRunner runner = new QueryRunner();

	@Override
	public List<Major> getAllMajor() {
		// TODO Auto-generated method stub
		String sql = "select * from major";
		Connection conn = null;
		try {
			//获取数据库连接
			conn = JDBCUtils.getConnection();
			//执行sql 结果封装为List集合
			List<Major> allMajor = runner.query(conn, sql, new BeanListHandler<Major>(Major.class));
			return allMajor;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public int insert(Major major) {
		// TODO Auto-generated method stub
		String sql = "insert into major(majorNo,majorName,deptNo) values(?,?,?)";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, major.getMajorNo(), major.getMajorName(), major.getDeptNo());
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
	public int update(Major major) {
		// TODO Auto-generated method stub
		String sql = "update major set majorName = ?,deptNo = ?  where majorNo = ? ";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, major.getMajorName(), major.getDeptNo(), major.getMajorNo());
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
	public int delete(String majorNo) {
		// TODO Auto-generated method stub
		String sql = "delete from major where majorNo= ?";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, majorNo);
			return update;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return 0;
	}

}

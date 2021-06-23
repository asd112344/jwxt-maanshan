package dao.impl;

import dao.DeptDao;
import entity.Dept;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DeptDaoImpl implements DeptDao {
	private QueryRunner runner = new QueryRunner();

	@Override
	public List<Dept> getAllDept() {
		// TODO Auto-generated method stub
		String sql = "select * from dept";
		Connection conn = null;
		try {
			//获取数据库连接
			conn = JDBCUtils.getConnection();
			//执行sql 结果封装为List集合
			List<Dept> allDept = runner.query(conn, sql, new BeanListHandler<Dept>(Dept.class));
			return allDept;
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
	public int insert(Dept dept) {
		// TODO Auto-generated method stub
		String sql = "insert into dept(deptNo,deptName) values(?,?)";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, dept.getDeptNo(), dept.getDeptName());
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
	public int update(Dept dept) {
		// TODO Auto-generated method stub
		String sql = "update  dept set deptName =? where deptNo = ?";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, dept.getDeptName(), dept.getDeptNo());
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
	public int delete(String deptno) {
		// TODO Auto-generated method stub
		String sql = "delete from dept where deptno = ?";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, deptno);
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

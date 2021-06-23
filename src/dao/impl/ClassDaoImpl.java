package dao.impl;

import dao.ClassDao;
import entity.Class;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClassDaoImpl implements ClassDao {
	private QueryRunner runner = new QueryRunner();

	@Override
	public List<Class> getAllClass() {
		String sql = "select * from class";
		Connection conn = null;

		try {
			conn = JDBCUtils.getConnection();
			List<Class> allClass = runner.query(conn, sql, new BeanListHandler<Class>(Class.class));
			return allClass;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}

		return null;
	}

	@Override
	public int insert(Class clazz) {
		String sql = "Insert into class(grade,classNo,className,classLevel,stuType,majorNo) values(?,?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, clazz.getGrade(), clazz.getClassNo(), clazz.getClassName(),
					clazz.getClassLevel(), clazz.getStuType(), clazz.getMajorNo());
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
	public int update(Class clazz) {
		String sql = "update class set grade=?,className=?,classLevel=?,stuType=?,majorNo=? where classNo=?";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, clazz.getGrade(), clazz.getClassName(),
					clazz.getClassLevel(), clazz.getStuType(), clazz.getMajorNo(), clazz.getClassNo());
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
	public int delete(String classNo) {
		String sql = "delete from class where classNo = ?";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, classNo);
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

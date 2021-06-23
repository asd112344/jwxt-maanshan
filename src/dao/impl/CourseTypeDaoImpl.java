package dao.impl;

import dao.CourseTypeDao;
import entity.Coursetype;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CourseTypeDaoImpl implements CourseTypeDao {
	private QueryRunner runner = new QueryRunner();

	public static void main(String[] args) {
		List<Coursetype> allCourseType = new CourseTypeDaoImpl().getAllCourseType();
		for (Coursetype coursetype : allCourseType) {
			System.out.println(coursetype);
		}
	}

	@Override
	public List<Coursetype> getAllCourseType() {
		// TODO Auto-generated method stub
		String sql = "select * from coursetype";
		Connection conn = null;
		try {
			//获取数据库连接
			conn = JDBCUtils.getConnection();
			//执行sql 结果封装为List集合
			List<Coursetype> query = runner.query(conn, sql, new BeanListHandler<Coursetype>(Coursetype.class));
			return query;
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
	public int insert(Coursetype coursetype) {
		// TODO Auto-generated method stub
		String sql = "Insert into coursetype(courseTypeNo,courseTypeName) values(?,?)";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, coursetype.getCourseTypeNo(), coursetype.getCourseTypeName());
			return update;
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


		return 0;
	}

	@Override
	public int update(Coursetype coursetype) {
		// TODO Auto-generated method stub
		String sql = "Update coursetype set courseTypeName = ? where courseTypeNo = ?";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, coursetype.getCourseTypeName(), coursetype.getCourseTypeNo());
			return update;
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


		return 0;
	}

	@Override
	public int delete(int courseTypeNo) {
		// TODO Auto-generated method stub
		String sql = "delete from coursetype where courseTypeNo = ?";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, courseTypeNo);
			return update;
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

		return 0;
	}

}

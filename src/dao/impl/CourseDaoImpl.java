package dao.impl;

import dao.CourseDao;
import entity.Course;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CourseDaoImpl implements CourseDao {
	private QueryRunner runner = new QueryRunner();

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		String sql = "select * from course";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			List<Course> allCourse = runner.query(conn, sql, new BeanListHandler<Course>(Course.class));
			return allCourse;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return null;
	}

	@Override
	public int insert(Course course) {
		// TODO Auto-generated method stub
		String sql = "insert into course(courseTypeNo,courseNo,courseName,credit,ctime,openTeam,isRequire,deptNo,remark) vlaues(?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, course.getCourseTypeNo(), course.getCourseNo(),
					course.getCourseName(), course.getCredit(), course.getCtime(), course.getOpenTeam(), course.getIsRequire(), course.getDeptNo(), course.getRemark());
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
	public int update(Course course) {
		// TODO Auto-generated method stub
		String sql = "update course set courseTypeNo = ?,courseName = ?,credit = ?,ctime = ?,openTeam = ?,isRequire = ?,deptNo = ?,remark = ? where courseNo = ?";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, course.getCourseTypeNo(), course.getCourseName(), course.getCredit(),
					course.getCtime(), course.getOpenTeam(), course.getIsRequire(), course.getDeptNo(), course.getRemark(), course.getCourseNo());
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
	public int delete(String courseNo) {
		// TODO Auto-generated method stub
		String sql = "delete from course where courseNo = ?";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, courseNo);
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

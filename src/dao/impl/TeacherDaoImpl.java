package dao.impl;

import dao.TeacherDao;
import entity.Teacher;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TeacherDaoImpl implements TeacherDao {
	private QueryRunner runner = new QueryRunner();

	@Override
	public List<Teacher> getAllTeacher() {
		String sql = "select * FROM teacher";
		Connection conn = null;

		try {
			conn = JDBCUtils.getConnection();
			List<Teacher> allTeacher = runner.query(conn, sql, new BeanListHandler<Teacher>(Teacher.class));
			return allTeacher;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return null;
	}

	@Override
	public int insert(Teacher teacher) {
		String sql = "Insert into teacher(teacherNo,teacherName,professional,deptNo) values(?,?,?,?)";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, teacher.getTeacherNo(), teacher.getTeacherName(), teacher.getProfessional(), teacher.getDeptNo());
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
	public int update(Teacher teacher) {
		String sql = "UPDATE teacher SET teacherName = ?,professional = ?,deptNo = ?   WHERE teacherNo = ?";
		Connection conn = null;

		conn = JDBCUtils.getConnection();
		try {
			int update = runner.update(conn, sql, teacher.getTeacherName(), teacher.getProfessional(), teacher.getDeptNo(), teacher.getTeacherNo());
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
	public int delete(String teacherNo) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM teacher WHERE teacherNo = ?";
		Connection conn = null;

		conn = JDBCUtils.getConnection();
		try {
			int delete = runner.update(conn, sql, teacherNo);
			return delete;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return 0;
	}

//	public static void main(String[] args) {
//		TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
//		
//		
////		Teacher teacher = new Teacher("th003","孟老师","平民","yx02");
////		teacherDaoImpl.insert(teacher);
//		
////		Teacher teacher1 = new Teacher("th003","赵老师","平民","yx02");
////		teacherDaoImpl.update(teacher1);
//		
//		teacherDaoImpl.delete("th003");
//		
//
//		List<Teacher> allTeacher = teacherDaoImpl.getAllTeacher();
//		allTeacher.forEach(System.out::println);
//	}

}

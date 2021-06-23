package dao.impl;

import dao.StudentDao;
import entity.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	private QueryRunner runner = new QueryRunner();

	/**
	 * 测试
	 *
	 * @param args
	 */

	public static void main(String[] args) {

//		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();

//		List<Student> allStudent = studentDaoImpl.getAllStudent();
//		allStudent.forEach(System.out::println);


//		Student student = new Student("1002", "zhangsan", "男", "20001010", "bj001");
//		int insert = studentDaoImpl.insert(student);
//		if(insert>0) {
//			System.out.println("insert successful");
//		}


//		Student student = new Student("1002", "lisi", "男", "20001010", "bj002");
//
//		int update = studentDaoImpl.update(student);
//		if(update>0) {
//			System.out.println("update successful");
//		}

//		int delete = studentDaoImpl.delete("1002");
//		if(delete>0) {
//		System.out.println("delete successful");
//		}
	}

	@Override
	public List<Student> getAllStudent() {
		String sql = "select * FROM student";
		Connection conn = null;

		try {
			conn = JDBCUtils.getConnection();
			List<Student> allStudent = runner.query(conn, sql, new BeanListHandler<Student>(Student.class));
			return allStudent;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return null;
	}

	@Override
	public int insert(Student student) {
		String sql = "Insert into student(studentNo,studentName,sex,birthday,classNo) values(?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, student.getStudentNo(), student.getStudentName(), student.getSex(), student.getBirthday(), student.getClassNo());
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
	public int update(Student student) {
		String sql = "UPDATE student SET studentName = ?,sex = ?,birthday = ?,classNo = ?   WHERE studentNo = ?";
		Connection conn = null;

		conn = JDBCUtils.getConnection();
		try {
			int update = runner.update(conn, sql, student.getStudentName(), student.getSex(), student.getBirthday(), student.getClassNo(), student.getStudentNo());
			return update;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(String studentNo) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM student WHERE studentNo = ?";
		Connection conn = null;

		conn = JDBCUtils.getConnection();
		try {
			int delete = runner.update(conn, sql, studentNo);
			return delete;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public Student queryStudentByNo(String studentNo) {

		String sql = "select * FROM student where studentNo = ? ";
		Connection conn = null;

		try {
			conn = JDBCUtils.getConnection();
			Student student = runner.query(conn, sql, new BeanHandler<Student>(Student.class), studentNo);
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return null;
	}
}

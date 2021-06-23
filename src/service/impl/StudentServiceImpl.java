package service.impl;

import dao.impl.StudentDaoImpl;
import entity.Student;
import service.StudentService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lian
 * @since 2021-06-18
 */
public class StudentServiceImpl implements StudentService {

	StudentDaoImpl studentDaoImpl = new StudentDaoImpl();

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDaoImpl.getAllStudent();
	}

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		return studentDaoImpl.insert(student);
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return studentDaoImpl.update(student);
	}

	@Override
	public int delete(String studentNo) {
		// TODO Auto-generated method stub
		return studentDaoImpl.delete(studentNo);
	}

	@Override
	public Student queryStudentByNo(String studentNo) {
		return studentDaoImpl.queryStudentByNo(studentNo);
	}


}

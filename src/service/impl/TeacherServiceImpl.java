package service.impl;

import dao.impl.TeacherDaoImpl;
import entity.Teacher;
import service.TeacherService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lian
 * @since 2021-06-18
 */
public class TeacherServiceImpl implements TeacherService {

	TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();

	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return teacherDaoImpl.getAllTeacher();
	}

	@Override
	public int insert(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherDaoImpl.insert(teacher);
	}

	@Override
	public int update(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherDaoImpl.update(teacher);
	}

	@Override
	public int delete(String teacherNo) {
		// TODO Auto-generated method stub
		return teacherDaoImpl.delete(teacherNo);
	}

}

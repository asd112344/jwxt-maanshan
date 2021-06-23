package service.impl;

import dao.impl.CourseDaoImpl;
import entity.Course;
import service.CourseService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lian
 * @since 2021-06-18
 */
public class CourseServiceImpl implements CourseService {

	CourseDaoImpl courseDaoImpl = new CourseDaoImpl();

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseDaoImpl.getAllCourse();
	}

	@Override
	public int insert(Course course) {
		// TODO Auto-generated method stub
		return courseDaoImpl.insert(course);
	}

	@Override
	public int update(Course course) {
		// TODO Auto-generated method stub
		return courseDaoImpl.update(course);
	}

	@Override
	public int delete(String courseNo) {
		// TODO Auto-generated method stub
		return courseDaoImpl.delete(courseNo);
	}

}

package service.impl;

import dao.impl.CourseTypeDaoImpl;
import entity.Coursetype;
import service.CourseTypeService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lian
 * @since 2021-06-18
 */
public class CoursetypeServiceImpl implements CourseTypeService {

	CourseTypeDaoImpl courseTypeDaoImpl = new CourseTypeDaoImpl();

	@Override
	public List<Coursetype> getAllCourseType() {
		// TODO Auto-generated method stub
		return courseTypeDaoImpl.getAllCourseType();
	}

	@Override
	public int insert(Coursetype coursetype) {
		// TODO Auto-generated method stub
		return courseTypeDaoImpl.insert(coursetype);
	}

	@Override
	public int update(Coursetype coursetype) {
		// TODO Auto-generated method stub
		return courseTypeDaoImpl.update(coursetype);
	}

	@Override
	public int delete(int courseTypeNo) {
		// TODO Auto-generated method stub
		return courseTypeDaoImpl.delete(courseTypeNo);
	}

}

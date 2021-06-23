package service;

import entity.Course;

import java.util.List;

public interface CourseService {
	/**
	 * 查询所有Course信息
	 *
	 * @return
	 */
	public List<Course> getAllCourse();


	/**
	 * 插入数据
	 *
	 * @param coursetype
	 * @return
	 */
	public int insert(Course course);

	/**
	 * 更新操作
	 *
	 * @param coursetype
	 * @return
	 */
	public int update(Course course);

	/**
	 * 删除操作
	 *
	 * @return
	 */
	public int delete(String courseNo);
}

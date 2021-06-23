package dao;

import entity.Coursetype;

import java.util.List;

public interface CourseTypeDao {
	/**
	 * 查询所有CourseType信息
	 *
	 * @return
	 */
	public List<Coursetype> getAllCourseType();

	/**
	 * 插入数据
	 *
	 * @param coursetype
	 * @return
	 */
	public int insert(Coursetype coursetype);

	/**
	 * 更新操作
	 *
	 * @param coursetype
	 * @return
	 */
	public int update(Coursetype coursetype);

	/**
	 * 删除操作
	 *
	 * @return
	 */
	public int delete(int courseTypeNo);
}

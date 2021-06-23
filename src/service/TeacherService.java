package service;

import entity.Teacher;

import java.util.List;

public interface TeacherService {
	/**
	 * 查询所有Teacher对象
	 *
	 * @return
	 */
	public List<Teacher> getAllTeacher();


	/**
	 * 插入数据
	 *
	 * @param teacher
	 * @return
	 */
	public int insert(Teacher teacher);

	/**
	 * 更新操作
	 *
	 * @param teacher
	 * @return
	 */
	public int update(Teacher teacher);

	/**
	 * 删除操作
	 *
	 * @return
	 */
	public int delete(String teacherNo);
}

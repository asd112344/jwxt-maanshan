package service;

import entity.Class;

import java.util.List;

public interface ClassService {
	/**
	 * 查询所有Class对象
	 *
	 * @return
	 */
	public List<Class> getAllClass();


	/**
	 * 插入数据
	 *
	 * @param coursetype
	 * @return
	 */
	public int insert(Class clazz);

	/**
	 * 更新操作
	 *
	 * @param coursetype
	 * @return
	 */
	public int update(Class clazz);

	/**
	 * 删除操作
	 *
	 * @return
	 */
	public int delete(String classNo);
}

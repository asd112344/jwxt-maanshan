package service;

import entity.Dept;

import java.util.List;

public interface DeptService {
	/**
	 * 查询所有Dept信息
	 *
	 * @return
	 */
	public List<Dept> getAllDept();

	/**
	 * 插入数据
	 *
	 * @param coursetype
	 * @return
	 */
	public int insert(Dept dept);

	/**
	 * 更新操作
	 *
	 * @param coursetype
	 * @return
	 */
	public int update(Dept dept);

	/**
	 * 删除操作
	 *
	 * @return
	 */
	public int delete(String deptno);
}

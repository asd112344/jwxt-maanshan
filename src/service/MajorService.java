package service;

import entity.Major;

import java.util.List;

public interface MajorService {
	/**
	 * 查询所有Major信息
	 *
	 * @return
	 */
	public List<Major> getAllMajor();

	/**
	 * 插入数据
	 *
	 * @param coursetype
	 * @return
	 */
	public int insert(Major major);

	/**
	 * 更新操作
	 *
	 * @param coursetype
	 * @return
	 */
	public int update(Major major);

	/**
	 * 删除操作
	 *
	 * @return
	 */
	public int delete(String majorNo);
}

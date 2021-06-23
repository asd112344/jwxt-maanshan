package dao;

import entity.User;

import java.util.List;


public interface UserDao {

	/**
	 * 查询所有User对象
	 *
	 * @return
	 */
	public List<User> getAllUser();

	/**
	 * 插入数据
	 *
	 * @param user
	 * @return
	 */
	public int insert(User user);

	/**
	 * 更新操作
	 *
	 * @param user
	 * @return
	 */
	public int update(User user);

	/**
	 * 删除操作
	 *
	 * @return
	 */
	public int delete(Integer uid);
}

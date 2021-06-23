package service;

import entity.Team;

import java.util.List;

public interface TermService {
	/**
	 * 查询所有Term对象
	 *
	 * @return
	 */
	public List<Team> getAllTeam();


	/**
	 * 插入数据
	 *
	 * @param term
	 * @return
	 */
	public int insert(Team term);

	/**
	 * 更新操作
	 *
	 * @param term
	 * @return
	 */
	public int update(Team term);

	/**
	 * 删除操作
	 *
	 * @return
	 */
	public int delete(Integer termNo);
}

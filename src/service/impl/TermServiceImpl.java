package service.impl;

import dao.impl.TeamDaoImpl;
import entity.Team;
import service.TermService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lian
 * @since 2021-06-18
 */
public class TermServiceImpl implements TermService {

	TeamDaoImpl termDaoImpl = new TeamDaoImpl();

	@Override
	public List<Team> getAllTeam() {
		// TODO Auto-generated method stub
		return termDaoImpl.getAllTeam();
	}

	@Override
	public int insert(Team term) {
		// TODO Auto-generated method stub
		return termDaoImpl.insert(term);
	}

	@Override
	public int update(Team term) {
		// TODO Auto-generated method stub
		return termDaoImpl.update(term);
	}

	@Override
	public int delete(Integer termNo) {
		// TODO Auto-generated method stub
		return termDaoImpl.delete(termNo);
	}

}

package service.impl;

import dao.impl.MajorDaoImpl;
import entity.Major;
import service.MajorService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lian
 * @since 2021-06-18
 */
public class MajorServiceImpl implements MajorService {

	MajorDaoImpl majorDaoImpl = new MajorDaoImpl();

	@Override
	public List<Major> getAllMajor() {
		// TODO Auto-generated method stub
		return majorDaoImpl.getAllMajor();
	}

	@Override
	public int insert(Major major) {
		// TODO Auto-generated method stub
		return majorDaoImpl.insert(major);
	}

	@Override
	public int update(Major major) {
		// TODO Auto-generated method stub
		return majorDaoImpl.update(major);
	}

	@Override
	public int delete(String majorNo) {
		// TODO Auto-generated method stub
		return majorDaoImpl.delete(majorNo);
	}

}

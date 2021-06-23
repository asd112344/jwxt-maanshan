package service.impl;

import dao.impl.DeptDaoImpl;
import entity.Dept;
import service.DeptService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhao
 * @since 2021-06-18
 */
public class DeptServiceImpl implements DeptService {
	DeptDaoImpl deptDaoImpl = new DeptDaoImpl();

	@Override
	public List<Dept> getAllDept() {
		// TODO Auto-generated method stub
		return deptDaoImpl.getAllDept();
	}

	@Override
	public int insert(Dept dept) {
		// TODO Auto-generated method stub
		return deptDaoImpl.insert(dept);
	}

	@Override
	public int update(Dept dept) {
		// TODO Auto-generated method stub
		return deptDaoImpl.update(dept);
	}

	@Override
	public int delete(String deptno) {
		// TODO Auto-generated method stub
		return deptDaoImpl.delete(deptno);
	}

}

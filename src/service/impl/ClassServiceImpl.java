package service.impl;

import dao.impl.ClassDaoImpl;
import entity.Class;
import service.ClassService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhao
 * @since 2021-06-18
 */
public class ClassServiceImpl implements ClassService {

	ClassDaoImpl classDaoImpl = new ClassDaoImpl();

	@Override
	public List<Class> getAllClass() {
		// TODO Auto-generated method stub
		return classDaoImpl.getAllClass();
	}

	@Override
	public int insert(Class clazz) {
		// TODO Auto-generated method stub
		return classDaoImpl.insert(clazz);
	}

	@Override
	public int update(Class clazz) {
		// TODO Auto-generated method stub
		return classDaoImpl.update(clazz);
	}

	@Override
	public int delete(String classNo) {
		// TODO Auto-generated method stub
		return classDaoImpl.delete(classNo);
	}

}

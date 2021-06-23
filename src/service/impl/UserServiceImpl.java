package service.impl;

import dao.impl.UserDaoImpl;
import entity.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

	UserDaoImpl userDaoImpl = new UserDaoImpl();

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDaoImpl.getAllUser();
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.insert(user);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.update(user);
	}

	@Override
	public int delete(Integer uid) {
		// TODO Auto-generated method stub
		return userDaoImpl.delete(uid);
	}

}

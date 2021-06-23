package dao.impl;

import dao.UserDao;
import entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
	private QueryRunner runner = new QueryRunner();

	public static void main(String[] args) {
		UserDaoImpl userDaoImpl = new UserDaoImpl();

//		userDaoImpl.insert(new User("dev1","111111"));
//		userDaoImpl.update(new User(3,"dev","000000"));
		userDaoImpl.delete(3);

		List<User> allUser = userDaoImpl.getAllUser();
		allUser.forEach(System.out::println);
	}

	@Override
	public List<User> getAllUser() {
		String sql = "select * FROM user";
		Connection conn = null;

		try {
			conn = JDBCUtils.getConnection();
			List<User> allUser = runner.query(conn, sql, new BeanListHandler<User>(User.class));
			return allUser;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return null;
	}

	@Override
	public int insert(User user) {
		String sql = "Insert into user(username,password) values(?,?)";
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			int update = runner.update(conn, sql, user.getUsername(), user.getPassword());
			return update;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}

		return 0;
	}

	@Override
	public int update(User user) {
		String sql = "UPDATE user SET username = ?,password = ?   WHERE uid = ?";
		Connection conn = null;

		conn = JDBCUtils.getConnection();
		try {
			int update = runner.update(conn, sql, user.getUsername(), user.getPassword(), user.getUid());
			return update;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return 0;
	}

	@Override
	public int delete(Integer uid) {
		String sql = "DELETE FROM user WHERE uid = ?";
		Connection conn = null;

		conn = JDBCUtils.getConnection();
		try {
			int delete = runner.update(conn, sql, uid);
			return delete;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn);
		}
		return 0;
	}

}

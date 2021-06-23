package dao;

import entity.Student;

import java.util.List;

public interface StudentDao {
	/**
	 * 查询所有Student对象
	 *
	 * @return
	 */
	public List<Student> getAllStudent();


	/**
	 * 插入数据
	 *
	 * @param student
	 * @return
	 */
	public int insert(Student student);

	/**
	 * 更新操作
	 *
	 * @param student
	 * @return
	 */
	public int update(Student student);

	/**
	 * 删除操作
	 *
	 * @return
	 */
	public int delete(String studentNo);

	/**
	 * 根据id查询学生信息
	 */
	public Student queryStudentByNo(String studentNo);
}

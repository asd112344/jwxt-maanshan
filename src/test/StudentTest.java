package test;

import entity.Student;
import org.junit.Test;
import service.impl.StudentServiceImpl;

import java.util.List;

public class StudentTest {

    StudentServiceImpl studentService = new StudentServiceImpl();

    @Test
    public void allStudent() {
        List<Student> allStudent = studentService.getAllStudent();
        allStudent.forEach(System.out::println);
    }

    @Test
    public void addStudent() {
        Student student = new Student("1006", "zhangsan", "男", "20001010", "bj001");
        studentService.insert(student);
        allStudent();
    }

    @Test
    public void delStudent() {
        System.out.println("删除前");
        allStudent();
        studentService.delete("1006");
        System.out.println("删除后");
        allStudent();
    }

    @Test
    public void updateStudent() {
        Student student = studentService.queryStudentByNo("1006");
        System.out.println("修改前");
        System.out.println(student);
        //修改出生年月 为 19990101
        Student stu = new Student("1006", "zhangsan", "男", "19990101", "bj001");
        studentService.update(stu);
        Student student1 = studentService.queryStudentByNo("1006");
        System.out.println("修改后");
        System.out.println(student1);
    }
}

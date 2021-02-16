package top.fjy8018.mapstruct;

import junit.framework.TestCase;

public class StudentMapperTest extends TestCase {

    public void testStudentToStudentVO() {
        Student student = new Student();
        student.setUsername("stu1");
        student.setAge(10);
        student.setSex("man");
        student.setAddress("Guangzhou");
        student.setGrade("6");

        StudentVO studentVO = StudentMapper.INSTANCE.studentToStudentVO(student);
        System.out.println(studentVO);
        System.out.println(studentVO.getUsername());
    }
}
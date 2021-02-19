package top.fjy8018.mapstruct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentMapperTest {
    @Test
    public void testStudentToStudentVO() {
        Student student = new Student();
        student.setUsername("stu1");
        student.setAge(10);
        student.setSex("man");
        student.setAddress("Guangzhou");
        student.setGrade("6");

        StudentVO studentVO = StudentMapper.INSTANCE.studentToStudentVO(student);
        assertNotNull(studentVO);
        assertEquals("stu1", studentVO.getUsername());
        assertEquals("man", studentVO.getSex());
        assertEquals("Guangzhou", studentVO.getAddress());
        assertEquals("6", studentVO.getGrade());
        assertEquals(10, studentVO.getAge());
    }
}
package top.fjy8018.mapstruct;

import junit.framework.TestCase;

public class CompanyMapperTest extends TestCase {

    public void testStudentToPersonVO() {
        Student student = new Student();
        student.setUsername("stu1");
        student.setAge(10);
        student.setSex("man");
        student.setAddress("Guangzhou");
        student.setGrade("6");
        Company<Student> studentCompany = new Company<>();
        studentCompany.setName("studentCompany");
        studentCompany.setEmployee(student);

        Company<Person> personCompany = CompanyMapper.INSTANCE.studentToPersonVO(studentCompany);

        System.out.println(personCompany.getName());
        System.out.println(personCompany.getEmployee());
    }
}
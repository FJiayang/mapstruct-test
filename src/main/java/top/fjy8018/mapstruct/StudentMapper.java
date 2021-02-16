package top.fjy8018.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author F嘉阳
 * @date 2021-02-16 9:28
 */
@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentVO studentToStudentVO(Student student);
}

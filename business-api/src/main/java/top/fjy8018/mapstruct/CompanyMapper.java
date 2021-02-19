package top.fjy8018.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author F嘉阳
 * @date 2021-02-16 21:27
 */
@Mapper
public interface CompanyMapper {


    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    Company<Person> studentToPersonVO(Company<Student> company);
}

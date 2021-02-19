package top.fjy8018.mapstruct.map;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import top.fjy8018.mapstruct.dto.OssDTO;
import top.fjy8018.mapstruct.entity.Oss;
import top.fjy8018.mapstruct.vo.OssVO;

/**
 * @author F嘉阳
 * @date 2021/2/18 16:06
 */
@Mapper
public interface OssEntityMapper {

    OssEntityMapper INSTANCE = Mappers.getMapper(OssEntityMapper.class);

    OssVO ossToOssVO(Oss oss);

    OssDTO ossToOssDto(Oss oss);
}

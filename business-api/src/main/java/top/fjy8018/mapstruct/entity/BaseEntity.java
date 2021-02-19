package top.fjy8018.mapstruct.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author F嘉阳
 * @date 2021/2/19 9:47
 */
@Data
public class BaseEntity implements Serializable {


    private Long createUser;

    private Date createTime;

    private Long updateUser;

    private Date updateTime;

    private Integer status;

    private Integer isDeleted;
}

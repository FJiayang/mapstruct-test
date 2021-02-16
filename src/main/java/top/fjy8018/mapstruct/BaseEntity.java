package top.fjy8018.mapstruct;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author F嘉阳
 * @date 2021-02-16 9:26
 */
@Data
@ToString
public class BaseEntity implements Serializable {

    private String username;

    private Integer age;
}

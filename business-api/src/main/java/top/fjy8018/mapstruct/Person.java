package top.fjy8018.mapstruct;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author F嘉阳
 * @date 2021-02-16 9:26
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity {

    private String sex;

    private String address;
}

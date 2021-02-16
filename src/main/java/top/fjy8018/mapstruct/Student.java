package top.fjy8018.mapstruct;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author F嘉阳
 * @date 2021-02-16 9:27
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Student extends Person {

    private String grade;
}

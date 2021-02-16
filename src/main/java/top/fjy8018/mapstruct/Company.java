package top.fjy8018.mapstruct;

import lombok.Data;
import lombok.ToString;

/**
 * @author F嘉阳
 * @date 2021-02-16 21:26
 */
@Data
@ToString(callSuper = true)
public class Company<T> {

    private String name;

    private T employee;
}

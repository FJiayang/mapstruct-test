package top.fjy8018.mapstruct;

import lombok.Data;

/**
 * @author F嘉阳
 * @date 2021-02-16 21:26
 */
@Data
public class Company<T> {

    private String name;

    private T employee;
}

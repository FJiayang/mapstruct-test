package top.fjy8018.mapstruct.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author F嘉阳
 * @date 2021/2/19 9:47
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TenantEntity extends BaseEntity {

    private String tenantId;
}

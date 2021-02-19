/**
 * Copyright (c) 2018-2028, Chill Zhuang 庄骞 (smallchill@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package top.fjy8018.mapstruct.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * OSS存储表实体类
 *
 * @author Blade
 * @since 2021-02-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Oss extends TenantEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 文件地址
     */
    private String link;
    /**
     * 原始文件名
     */
    private String originalName;

    /**
     * 文件名
     */
    private String fileName;
    /**
     * OSS类型，1：七牛云，2：阿里云
     */
    private String ossType;
    /**
     * 备注
     */
    private String remark;


}

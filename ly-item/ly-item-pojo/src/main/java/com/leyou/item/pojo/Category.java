package com.leyou.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wangzibeng
 * Date: 2019/4/26 0026
 * Time: 9:57
 */

@Table(name = "tb_category")
@Data
public class Category {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    /**
     * 类目名称
     */
    private String name;
    /**
     * 父类目id,顶级类目填0
     */
    private Long parentId;
    /**
     * 是否为父节点，0为否，1为是
     */
    private Boolean isParent;
    /**
     * 排序指数，越小越靠前
     */
    private Integer sort;
}
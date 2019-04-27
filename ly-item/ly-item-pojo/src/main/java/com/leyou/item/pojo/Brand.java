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
 * Time: 20:12
 */

@Table(name = "tb_brand")
@Data
public class Brand {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    /**
     * 品牌名称
     */
    private String name;
    /**
     * 品牌图片地址
     */
    private String image;
    /**
     * 品牌的首字母
     */
    private Character letter;
}
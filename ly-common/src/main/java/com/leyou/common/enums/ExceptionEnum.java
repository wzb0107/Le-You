package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wangzibeng
 * Date: 2019/4/24 0024
 * Time: 10:39
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    /**
     * 价格不能为空
     */
    PRICE_CANNOT_BE_NULL(400, "price is not null"),
    DATA_TRANSFER_ERROR(),
    /**
     * 商品分类没找到哦
     *
     */
    CATEGORY_NOT_FOUND(404, "category not found");

    /**
     * 状态码
     */
    private int code;
    /**
     * 异常信息
     */
    private String msg;
}

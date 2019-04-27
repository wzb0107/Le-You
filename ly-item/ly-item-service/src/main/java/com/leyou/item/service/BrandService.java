package com.leyou.item.service;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wangzibeng
 * Date: 2019/4/26 0026
 * Time: 20:16
 */

public interface BrandService {
    /**
     * 品牌查询 及分页 排序
     *
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @param key
     * @return
     */
    PageResult<Brand> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key);
}

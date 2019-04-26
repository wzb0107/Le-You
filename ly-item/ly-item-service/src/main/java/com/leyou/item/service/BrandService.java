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
    PageResult<Brand> queryBrandByPageAndSort(int page, int rows, String sortBy, Boolean desc, String key);
}

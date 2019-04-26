package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wangzibeng
 * Date: 2019/4/26 0026
 * Time: 10:09
 */


public interface CategoryService {
    /**
     * 根据ID查询category
     *
     * @param pid
     * @return
     */
    List<Category> queryCategoryListById(long pid);
}

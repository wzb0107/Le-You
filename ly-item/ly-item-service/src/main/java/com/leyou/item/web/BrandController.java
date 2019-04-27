package com.leyou.item.web;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wangzibeng
 * Date: 2019/4/26 0026
 * Time: 20:17
 */

@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;


    /**
     * @param page   当前页
     * @param rows   每页大小
     * @param sortBy 排序字段
     * @param desc   是否为降序
     * @param key    搜索关键词
     * @return
     */
    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPageAndSort(@RequestParam(value = "page", defaultValue = "1") int page,
                                                                     @RequestParam(value = "rows", defaultValue = "5") int rows,
                                                                     @RequestParam(value = "sortBy", required = false) String sortBy,
                                                                     @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
                                                                     @RequestParam(value = "key", required = false) String key) {
        PageResult<Brand> result = brandService.queryBrandByPageAndSort(page, rows, sortBy, desc, key);
        if (result == null || result.getItems().size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }
}

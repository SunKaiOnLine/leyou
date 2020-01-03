package com.leyou.item.api;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.Spu;
import com.leyou.item.pojo.SpuDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface GoodsApi {


    /**
     * 分页查询spu
     *
     * @param key
     * @param saleable
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("spu/page")
      PageResult<Spu> querySpuByPage(@RequestParam(value = "key", required = false) String key,
                                          @RequestParam(value = "saleable", required = false) Boolean saleable,
                                          @RequestParam(value = "page", defaultValue = "1") Integer page,
                                          @RequestParam(value = "rows", defaultValue = "5") Integer rows);
    /**
     * 根据spu的ID 查询 detail
     *
     * @param id
     * @return
     */
    @GetMapping("/spu/detail/{id}")
      SpuDetail querySpuDetailById(@PathVariable("id") Long id);


    /**
     * 根据spu 查询sku
     * @param id
     * @return
     */
    @GetMapping("sku/list")
      List<Sku> querySkuBySpuId(@RequestParam("id")Long id) ;

    /**
     * 根据spu的id查询spu
     * @param id
     * @return
     */
    @GetMapping("spu/{id}")
    public Spu querySpuById(@PathVariable("id") Long id);
}

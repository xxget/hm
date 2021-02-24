package com.zdh.hm.fthfldev.controller;

import com.zdh.hm.fthfldev.entity.Fthfldev;
import com.zdh.hm.fthfldev.service.FthfldevService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Fthfldev)表户信息表控制层
 *
 * @author xxg
 * @since 2021-02-24 11:24:58
 */
@RestController
@RequestMapping("fthfldev")
public class FthfldevController {
    /**
     * 服务对象
     */
    @Resource
    private FthfldevService fthfldevService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Fthfldev selectOne(Integer id) {
        return this.fthfldevService.queryById(id);
    }

}

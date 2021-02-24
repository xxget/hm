package com.zdh.hm.fthfldtl.controller;

import com.zdh.hm.fthfldtl.entity.Fthfldtl;
import com.zdh.hm.fthfldtl.service.FthfldtlService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * (Fthfldtl)设备信息报文流水表控制层
 *
 * @author xxg
 * @since 2021-02-23 11:14:12
 */
@RestController
@RequestMapping("/fthfldtl")
public class FthfldtlController {
    /**
     * 服务对象
     */
    @Resource
    private FthfldtlService fthfldtlService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Fthfldtl selectOne(Date id) {
        return this.fthfldtlService.queryById(id);
    }

}

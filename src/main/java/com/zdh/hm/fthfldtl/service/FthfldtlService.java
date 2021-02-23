package com.zdh.hm.fthfldtl.service;

import com.zdh.hm.fthfldtl.entity.Fthfldtl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * (Fthfldtl)表服务接口
 *
 * @author xxg
 * @since 2021-02-23 11:14:12
 */
@Service
public interface FthfldtlService {

    /**
     * 通过ID查询单条数据
     *
     * @param colltime 主键
     * @return 实例对象
     */
    Fthfldtl queryById(Date colltime);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Fthfldtl> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param fthfldtl 实例对象
     * @return 实例对象
     */
    Fthfldtl insert(Fthfldtl fthfldtl);

    /**
     * 修改数据
     *
     * @param fthfldtl 实例对象
     * @return 实例对象
     */
    Fthfldtl update(Fthfldtl fthfldtl);

    /**
     * 通过主键删除数据
     *
     * @param colltime 主键
     * @return 是否成功
     */
    boolean deleteById(Date colltime);

}

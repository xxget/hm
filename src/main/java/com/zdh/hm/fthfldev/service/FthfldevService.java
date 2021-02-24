package com.zdh.hm.fthfldev.service;

import com.zdh.hm.fthfldev.entity.Fthfldev;

import java.util.List;

/**
 * (Fthfldev)表服务接口
 *
 * @author xxg
 * @since 2021-02-24 11:24:57
 */
public interface FthfldevService {

    /**
     * 通过ID查询单条数据
     *
     * @param devaddr 主键
     * @return 实例对象
     */
    Fthfldev queryById(Integer devaddr);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Fthfldev> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param fthfldev 实例对象
     * @return 实例对象
     */
    Fthfldev insert(Fthfldev fthfldev);

    /**
     * 修改数据
     *
     * @param fthfldev 实例对象
     * @return 实例对象
     */
    Fthfldev update(Fthfldev fthfldev);

    /**
     * 通过主键删除数据
     *
     * @param devaddr 主键
     * @return 是否成功
     */
    boolean deleteById(Integer devaddr);

}

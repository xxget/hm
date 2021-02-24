package com.zdh.hm.fthfldev.service.impl;

import com.zdh.hm.fthfldev.entity.Fthfldev;
import com.zdh.hm.fthfldev.dao.FthfldevDao;
import com.zdh.hm.fthfldev.service.FthfldevService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Fthfldev)表服务实现类
 *
 * @author xxg
 * @since 2021-02-24 11:24:58
 */
@Service("fthfldevService")
public class FthfldevServiceImpl implements FthfldevService {
    @Resource
    private FthfldevDao fthfldevDao;

    /**
     * 通过ID查询单条数据
     *
     * @param devaddr 主键
     * @return 实例对象
     */
    @Override
    public Fthfldev queryById(Integer devaddr) {
        return this.fthfldevDao.queryById(devaddr);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Fthfldev> queryAllByLimit(int offset, int limit) {
        return this.fthfldevDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fthfldev 实例对象
     * @return 实例对象
     */
    @Override
    public Fthfldev insert(Fthfldev fthfldev) {
        this.fthfldevDao.insert(fthfldev);
        return fthfldev;
    }

    /**
     * 修改数据
     *
     * @param fthfldev 实例对象
     * @return 实例对象
     */
    @Override
    public Fthfldev update(Fthfldev fthfldev) {
        this.fthfldevDao.update(fthfldev);
        return this.queryById(fthfldev.getDevaddr());
    }

    /**
     * 通过主键删除数据
     *
     * @param devaddr 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer devaddr) {
        return this.fthfldevDao.deleteById(devaddr) > 0;
    }
}

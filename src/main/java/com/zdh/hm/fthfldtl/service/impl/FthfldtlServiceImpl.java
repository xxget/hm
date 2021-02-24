package com.zdh.hm.fthfldtl.service.impl;

import com.zdh.hm.fthfldtl.entity.Fthfldtl;
import com.zdh.hm.fthfldtl.dao.FthfldtlDao;
import com.zdh.hm.fthfldtl.service.FthfldtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (Fthfldtl)表服务实现类
 *
 * @author xxg
 * @since 2021-02-23 11:14:12
 */
@Service("fthfldtlService")
public class FthfldtlServiceImpl implements FthfldtlService {

    @Resource
    private FthfldtlDao fthfldtlDao;

    /**
     * 通过ID查询单条数据
     *
     * @param colltime 主键
     * @return 实例对象
     */
    @Override
    public Fthfldtl queryById(Date colltime) {
        return this.fthfldtlDao.queryById(colltime);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Fthfldtl> queryAllByLimit(int offset, int limit) {
        return this.fthfldtlDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fthfldtl 实例对象
     * @return 实例对象
     */
    @Override
    public Fthfldtl insert(Fthfldtl fthfldtl) {
        this.fthfldtlDao.insert(fthfldtl);
        return fthfldtl;
    }

    /**
     * 修改数据
     *
     * @param fthfldtl 实例对象
     * @return 实例对象
     */
    @Override
    public Fthfldtl update(Fthfldtl fthfldtl) {
        this.fthfldtlDao.update(fthfldtl);
        return this.queryById(fthfldtl.getColltime());
    }

    /**
     * 通过主键删除数据
     *
     * @param colltime 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Date colltime) {
        return this.fthfldtlDao.deleteById(colltime) > 0;
    }
}

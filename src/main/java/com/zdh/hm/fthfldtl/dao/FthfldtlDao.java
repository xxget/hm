package com.zdh.hm.fthfldtl.dao;

import com.zdh.hm.fthfldtl.entity.Fthfldtl;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * (Fthfldtl)表数据库访问层
 *
 * @author xxg
 * @since 2021-02-23 11:14:11
 */
public interface FthfldtlDao {

    /**
     * 通过ID查询单条数据
     *
     * @param colltime 主键
     * @return 实例对象
     */
    Fthfldtl queryById(Date colltime);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Fthfldtl> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param fthfldtl 实例对象
     * @return 对象列表
     */
    List<Fthfldtl> queryAll(Fthfldtl fthfldtl);

    /**
     * 新增数据
     *
     * @param fthfldtl 实例对象
     * @return 影响行数
     */
    int insert(Fthfldtl fthfldtl);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Fthfldtl> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Fthfldtl> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Fthfldtl> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Fthfldtl> entities);

    /**
     * 修改数据
     *
     * @param fthfldtl 实例对象
     * @return 影响行数
     */
    int update(Fthfldtl fthfldtl);

    /**
     * 通过主键删除数据
     *
     * @param colltime 主键
     * @return 影响行数
     */
    int deleteById(Date colltime);

}


package com.zdh.hm.fthfldev.dao;

import com.zdh.hm.fthfldev.entity.Fthfldev;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Fthfldev)表数据库访问层
 *
 * @author xxg
 * @since 2021-02-24 11:24:57
 */
@Mapper
public interface FthfldevDao {

    /**
     * 通过ID查询单条数据
     *
     * @param devaddr 主键
     * @return 实例对象
     */
    Fthfldev queryById(Integer devaddr);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Fthfldev> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param fthfldev 实例对象
     * @return 对象列表
     */
    List<Fthfldev> queryAll(Fthfldev fthfldev);

    /**
     * 新增数据
     *
     * @param fthfldev 实例对象
     * @return 影响行数
     */
    int insert(Fthfldev fthfldev);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Fthfldev> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Fthfldev> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Fthfldev> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Fthfldev> entities);

    /**
     * 修改数据
     *
     * @param fthfldev 实例对象
     * @return 影响行数
     */
    int update(Fthfldev fthfldev);

    /**
     * 通过主键删除数据
     *
     * @param devaddr 主键
     * @return 影响行数
     */
    int deleteById(Integer devaddr);

}


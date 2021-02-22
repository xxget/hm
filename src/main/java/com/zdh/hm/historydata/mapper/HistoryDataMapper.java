package com.zdh.hm.historydata.mapper;

import com.zdh.hm.historydata.domain.HistoryData;
import com.zdh.hm.historydata.domain.HistoryDataExample;

public interface HistoryDataMapper {
    long countByExample(HistoryDataExample example);

    int insert(HistoryData record);

    int insertSelective(HistoryData record);
}
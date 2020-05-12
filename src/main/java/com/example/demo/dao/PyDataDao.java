package com.example.demo.dao;

import com.example.demo.entity.PyData;
import com.example.demo.entity.PyResData;

import java.util.List;
import java.util.Map;

public interface PyDataDao {
    List<PyData> selectUsers();

    /**
     * 日期查所有数据
     * @param map
     * @return
     */
    List<PyData> selectAllDateByDate(Map<String, Object> map);

    /**
     * 差所有matchID
     * @param map
     * @return
     */
    List<PyData> selectAllMatchId(Map<String, Object> map);

    /**
     * 插比赛数据等于mtachId
     * @param map
     * @return
     */
    List<PyData> selectAllDateByMatchId(Map<String, Object> map);


    /**
     * 新增数据
     * @param pyData
     */
    void addPydateSuccess(PyData pyData);

    /**
     * 比赛70分钟后数据 
     * @param map
     * @return
     */
    List<PyData> findMatchByTime(Map<String, Object> map);

    void add(PyData pyData);

    List<PyData> selectRestulData(Map<String,Object> map);

    /**
     * 获取没派彩的数据
     * @return
     */
    List<PyResData> selectRestulDataByStatus();

    /**
     * 根据matchid查赛果
     * @param  map
     * @return
     */
    List<PyData> findResByMatchId(Map<String, Object> map);

    /**
     * 更新下单，算钱
     * @param map
     */
    void updataResData(Map<String, Object> map);

    /**
     * 更新用户信息
     * @param map
     */
    void adduserRest(PyData pyData);
}

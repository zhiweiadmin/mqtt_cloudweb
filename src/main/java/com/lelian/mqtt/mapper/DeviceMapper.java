package com.lelian.mqtt.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Mapper
public interface DeviceMapper {

    int insert(Map<String, Object> map);

    int checkConflict(Map<String, Object> map);

    void updateByKey(Map<String, Object> map);

}
package cn.com.chenkuo.standardframe.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.com.chenkuo.standardframe.pojo.SystemConfig;

@Mapper
public interface SystemConfigMapper {
	public List<SystemConfig> getConfigByType(@Param("type")String type);

	public int deleteConfig(@Param("id")int id);

	public int insertConfig(@Param("config")SystemConfig config);

	public int updateConfig(@Param("config")SystemConfig config);
}

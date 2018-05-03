package cn.com.chenkuo.standardframe.service.intf;

import com.github.pagehelper.PageInfo;

import cn.com.chenkuo.standardframe.pojo.SystemConfig;

public interface ConfigService {
	public PageInfo<SystemConfig> getConfigByType(String type);

	public int deleteConfig(int id);

	public int insertConfig(SystemConfig config);

	public int updateConfig(SystemConfig config);
}

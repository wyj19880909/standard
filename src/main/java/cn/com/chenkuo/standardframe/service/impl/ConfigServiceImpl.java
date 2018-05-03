package cn.com.chenkuo.standardframe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.com.chenkuo.standardframe.dao.SystemConfigMapper;
import cn.com.chenkuo.standardframe.pojo.SystemConfig;
import cn.com.chenkuo.standardframe.service.intf.ConfigService;

@Service
public class ConfigServiceImpl implements ConfigService {

	@Autowired
	private SystemConfigMapper systemConfigMapper;

	@Override
	public PageInfo<SystemConfig> getConfigByType(String type) {
		PageHelper.startPage(1, 2);
		List<SystemConfig> result = systemConfigMapper.getConfigByType(type);
		PageInfo<SystemConfig> appsPageInfo = new PageInfo<>(result);
		return appsPageInfo;

		/*Page<SystemConfig> appsPageInfo = PageHelper.startPage(1, 2).doSelectPage(new ISelect() {
			@Override
			public void doSelect() {
				systemConfigMapper.getConfigByType(type);
			}
		});*/
	}

	@Override
	public int deleteConfig(int id) {
		return systemConfigMapper.deleteConfig(id);
	}

	@Override
	public int insertConfig(SystemConfig config) {
		return systemConfigMapper.insertConfig(config);
	}

	@Override
	public int updateConfig(SystemConfig config) {
		return systemConfigMapper.updateConfig(config);
	}

}

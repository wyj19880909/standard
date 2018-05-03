package cn.com.chenkuo.standardframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.com.chenkuo.standardframe.pojo.SystemConfig;
import cn.com.chenkuo.standardframe.service.intf.ConfigService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private ConfigService configService;

	@RequestMapping("/config")
	@ResponseBody
	public PageInfo<SystemConfig> getConfig(){
		return configService.getConfigByType("A");
	}

	@RequestMapping("/hello")
	@ResponseBody
	public String home() {
		return "Hello ,spring boot!";
	}
}

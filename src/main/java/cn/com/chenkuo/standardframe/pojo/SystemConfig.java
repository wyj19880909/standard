package cn.com.chenkuo.standardframe.pojo;

import java.io.Serializable;

public class SystemConfig implements Serializable {

	private static final long serialVersionUID = 464676539887706402L;

	private int id;

	private String type;

	private String sysKey;

	private String sysValue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSysKey() {
		return sysKey;
	}

	public void setSysKey(String sysKey) {
		this.sysKey = sysKey;
	}

	public String getSysValue() {
		return sysValue;
	}

	public void setSysValue(String sysValue) {
		this.sysValue = sysValue;
	}
}

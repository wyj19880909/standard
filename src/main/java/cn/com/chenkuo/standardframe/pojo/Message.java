package cn.com.chenkuo.standardframe.pojo;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = -7586056004145534902L;

	private byte type;
	
	private String result;

	private String currentTime;

	public byte getType() {
		return type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public Message(byte type, String result, String currentTime) {
		this.type = type;
		this.result = result;
		this.currentTime = currentTime;
	}
}

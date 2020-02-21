package cn.com.chenkuo.pojo;

import java.io.Serializable;

public class BasicProtocol implements Serializable {

	private static final long serialVersionUID = -2085590980967888692L;
	
	private byte type;
	
	private byte[] body;

	public byte getType() {
		return type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public byte[] getBody() {
		return body;
	}

	public void setBody(byte[] body) {
		this.body = body;
	}
	
	public BasicProtocol(byte type, byte[] body) {
		this.type = type;
		this.body = body;
	}
}

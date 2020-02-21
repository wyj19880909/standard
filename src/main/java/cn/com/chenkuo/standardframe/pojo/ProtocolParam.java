package cn.com.chenkuo.pojo;

public enum ProtocolParam {
	/**
	 * 消息类型长度
	 */
	TYPE_LEN("TYPE_LEN", 1),

	/*
	 * 消息长度的数值的长度
	 */
	LENGTH_LEN("LENGTH_LEN", 4);


	private final String key;
	private final int value;

	ProtocolParam(String key, int value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public int getValue() {
		return value;
	}

	public static ProtocolParam getProtocolParam(String key) {
		for(ProtocolParam protocolParam : ProtocolParam.values()) {
			if(protocolParam.getKey().equals(key)) 
				return protocolParam;
		}
		return null;
	}
}

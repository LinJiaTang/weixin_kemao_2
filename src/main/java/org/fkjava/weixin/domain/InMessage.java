package org.fkjava.weixin.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


public abstract class InMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Xml开头的注解都是JAXB的
	@JsonProperty("ToUserName")
	private String toUserName;

	@JsonProperty("FromUserName")
	private String fromUserName;
	
	@JsonProperty("CreateTime")
	private long createTime;
	
	@JsonProperty("MsgType")
	private String msgType;
	
	@JsonProperty("MsgId")
	private String msgId;
	
	@JsonProperty("Event")
	private String event;

	public String getTouUserName() {
		return toUserName;
	}

	public void setTouUserName(String touUserName) {
		this.toUserName = touUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getMsqType() {
		return msgType;
	}

	public void setMsqType(String msqType) {
		this.msgType = msqType;
	}

	public String getMysId() {
		return msgId;
	}

	public void setMysId(String mysId) {
		this.msgId = mysId;
	}
	
	abstract public String toString();
	

}

package org.fkjava.weixin.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)//从字段获取配置信息
public abstract class InMessage implements Serializable {
	

	private static final long seriaVersionUID = 1L;
	
	
	//Xml开头的注解都是JAXB的
	@XmlElement(name="ToUserName")
	@JsonProperty("ToUserName")
	private String toUserName;

	@XmlElement(name="FromUserName")
	@JsonProperty("FromUserName")
	private String fromUserName;
	
	@XmlElement(name="CreateTime")
	@JsonProperty("CreateTime")
	private long createTime;
	
	@XmlElement(name="MsgType")
	@JsonProperty("MsgType")
	private String msgType;
	
	@XmlElement(name="MsgId")
	@JsonProperty("MsgId")
	private String msgId;

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

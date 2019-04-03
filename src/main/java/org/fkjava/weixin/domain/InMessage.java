package org.fkjava.weixin.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)//从字段获取配置信息
public abstract class InMessage implements Serializable {
	

	private static final long seriaVersionUID = 1L;
	
	
	//Xml开头的注解都是JAXB的
	@XmlElement(name="TouUserName")
	private String touUserName;

	@XmlElement(name="FromUserName")
	private String fromUserName;
	
	@XmlElement(name="CreateTime")
	private long createTime;
	
	@XmlElement(name="MsqType")
	private String msqType;
	
	@XmlElement(name="MsId")
	private String mysId;

	public String getTouUserName() {
		return touUserName;
	}

	public void setTouUserName(String touUserName) {
		this.touUserName = touUserName;
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
		return msqType;
	}

	public void setMsqType(String msqType) {
		this.msqType = msqType;
	}

	public String getMysId() {
		return mysId;
	}

	public void setMysId(String mysId) {
		this.mysId = mysId;
	}
	
	

}

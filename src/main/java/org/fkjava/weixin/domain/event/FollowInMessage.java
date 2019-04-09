package org.fkjava.weixin.domain.event;

import javax.xml.bind.annotation.XmlElement;

import org.fkjava.weixin.domain.InMessage;

public class FollowInMessage extends InMessage{

	private static final long seriaVersionUID = 1L;
	
	@XmlElement(name="Event")
	private String event;

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "FollowMessage [event=" + event + ", getTouUserName()=" + getTouUserName() + ", getFromUserName()="
				+ getFromUserName() + ", getCreateTime()=" + getCreateTime() + ", getMsqType()=" + getMsqType()
				+ ", getMysId()=" + getMysId() + "]";
	}
}

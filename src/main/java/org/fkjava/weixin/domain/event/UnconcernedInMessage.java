package org.fkjava.weixin.domain.event;

import javax.xml.bind.annotation.XmlElement;

import org.fkjava.weixin.domain.InMessage;

public class UnconcernedInMessage extends InMessage {
	
	private static final long seriaVersionUID = 1L;
	
	@XmlElement(name="Event")
	private String event;
	
	@XmlElement(name="EventKey")
	private String eventKey;

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	@Override
	public String toString() {
		return "UnconcernedMessage [event=" + event + ", eventKey=" + eventKey + ", getTouUserName()="
				+ getTouUserName() + ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsqType()=" + getMsqType() + ", getMysId()=" + getMysId() + "]";
	}

}

package org.fkjava.weixin.domain.event;

import org.fkjava.weixin.domain.InMessage;

public class FollowInMessage extends InMessage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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

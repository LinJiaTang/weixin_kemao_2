package org.fkjava.weixin.domain.video;

import javax.xml.bind.annotation.XmlElement;

import org.fkjava.weixin.domain.InMessage;

public class VideoInMessage extends InMessage {

	private static final long seriaVersionUID = 1L;
	
	private String thumbMediaId;

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	@Override
	public String toString() {
		return "VideoMessage [thumbMediaId=" + thumbMediaId + ", getTouUserName()=" + getTouUserName()
				+ ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsqType()=" + getMsqType() + ", getMysId()=" + getMysId() + "]";
	}
}

package org.fkjava.weixin.domain.shortVideo;

import javax.xml.bind.annotation.XmlElement;

import org.fkjava.weixin.domain.InMessage;

public class ShortVideo extends InMessage{
	private static final long seriaVersionUID = 1L;
	
	@XmlElement(name="ThumbMediaId")
	private String thumbMediaId;

	@Override
	public String toString() {
		return "ShortVideo [thumbMediaId=" + thumbMediaId + ", getTouUserName()=" + getTouUserName()
				+ ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsqType()=" + getMsqType() + ", getMysId()=" + getMysId() + "]";
	}
	
}

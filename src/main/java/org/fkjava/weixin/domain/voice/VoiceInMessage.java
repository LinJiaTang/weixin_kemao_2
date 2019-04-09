package org.fkjava.weixin.domain.voice;

import javax.xml.bind.annotation.XmlElement;

import org.fkjava.weixin.domain.InMessage;

public class VoiceInMessage extends InMessage{

	private static final long seriaVersionUID = 1L;
	
	@XmlElement(name="PicUrl")
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	@Override
	public String toString() {
		return "VoiceMessage [PicUrl=" + PicUrl + ", getTouUserName()=" + getTouUserName() + ", getFromUserName()="
				+ getFromUserName() + ", getCreateTime()=" + getCreateTime() + ", getMsqType()=" + getMsqType()
				+ ", getMysId()=" + getMysId() + "]";
	}
}

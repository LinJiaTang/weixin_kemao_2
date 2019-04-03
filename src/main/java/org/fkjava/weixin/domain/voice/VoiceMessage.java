package org.fkjava.weixin.domain.voice;

import javax.xml.bind.annotation.XmlElement;

import org.fkjava.weixin.domain.InMessage;

public class VoiceMessage extends InMessage{

	private static final long seriaVersionUID = 1L;
	
	@XmlElement(name="PicUrl")
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
}

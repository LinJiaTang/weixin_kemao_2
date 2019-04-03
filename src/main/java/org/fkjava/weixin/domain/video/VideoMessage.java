package org.fkjava.weixin.domain.video;

import javax.xml.bind.annotation.XmlElement;

import org.fkjava.weixin.domain.InMessage;

public class VideoMessage extends InMessage {

	private static final long seriaVersionUID = 1L;
	
	@XmlElement(name="ThumbMediaId")
	private String thumbMediaId;

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
}

package org.fkjava.weixin.domain.shortVideo;

import javax.xml.bind.annotation.XmlElement;

import org.fkjava.weixin.domain.InMessage;

public class ShortVideo extends InMessage{
	private static final long seriaVersionUID = 1L;
	
	@XmlElement(name="ThumbMediaId")
	private String thumbMediaId;
	
}

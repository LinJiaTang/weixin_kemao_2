package org.fkjava.weixin.domain.image;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.fkjava.weixin.domain.InMessage;
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)//从字段获取配置信息

	
public class ImageInMessage extends InMessage{
	
	private static final long seriaVersionUID = 1L;
	
	@XmlElement(name="PicUrl")
	private String imagUrl;
	
	@XmlElement(name="MediaId")
	private String mediaId;

	public String getImagUrl() {
		return imagUrl;
	}

	public void setImagUrl(String imagUrl) {
		this.imagUrl = imagUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	
	

}

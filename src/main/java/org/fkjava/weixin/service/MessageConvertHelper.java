package org.fkjava.weixin.service;

import java.io.StringReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.bind.JAXB;

import org.fkjava.weixin.domain.InMessage;
import org.fkjava.weixin.domain.event.FollowInMessage;
import org.fkjava.weixin.domain.image.ImageInMessage;
import org.fkjava.weixin.domain.link.LinkInMessage;
import org.fkjava.weixin.domain.location.LocationInMessage;
import org.fkjava.weixin.domain.shortVideo.ShortVideoInMessage;
import org.fkjava.weixin.domain.text.TextInMessage;
import org.fkjava.weixin.domain.video.VideoInMessage;
import org.fkjava.weixin.domain.voice.VoiceInMessage;

public class MessageConvertHelper {

	//1.使用一个Map来记录消息类型和Java类型的关系
	private static final Map<String, Class<? extends InMessage>> typeMap =new ConcurrentHashMap<>();
	static {
		typeMap.put("text", TextInMessage.class);
		typeMap.put("image", ImageInMessage.class);
		
		//其余的类型也是使用相同的方式关联起来
		typeMap.put("voice", VoiceInMessage.class);
		typeMap.put("video", VideoInMessage.class);
		typeMap.put("location", LocationInMessage.class);
		
		typeMap.put("link", LinkInMessage.class);
		typeMap.put("shortVideo", ShortVideoInMessage.class);
		typeMap.put("event", FollowInMessage.class);

	}
	
	public static Class<? extends InMessage> getClass(String xml) {
		
		//获取类型
		String type = xml.substring(xml.indexOf("<MsgType><![CDATA[")+18);
		type = type.substring(0, type.indexOf("]"));
				
		//获取Java类
		Class<? extends InMessage> c = typeMap.get(type);
		
		return c;
	}
	
	//2.提供一个静态的方法，可以闯入XML转换为Java对象
	public static <T extends InMessage> T convert (String xml) {
		//获取类型
		String type = xml.substring(xml.indexOf("<MsgType><![CDATA[")+18);
		type = type.substring(8, type.indexOf("]"));
		
		
		//获取Java类
		Class<? extends InMessage> c = getClass(xml);
		
		if( c== null ) {
			return null;
		}
		
		//使用JAXB转换
		@SuppressWarnings("unchecked")
		T msg = (T) JAXB.unmarshal(new StringReader(xml),c);
;		
		return msg;
	}
}

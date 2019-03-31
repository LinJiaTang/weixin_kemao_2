package org.fkjava.weixin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kemao_2/message/receiver")
public class MessageReceiverController {

	public String echo(
			
			String signature,
			String timestamp,
			String nonce,
			String echostr
			   ) {
		return echostr;
		} 
}

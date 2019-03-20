package org.fkjava.wexin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
@RequestMapping("kemao_2/message/receiver")
public class MessageReceiverController {

	
	@GetMapping
	public String echo(//
		
		  String signature, //
		  String timestamp, //
		  String nonce, //
		  String echostr//
		  
		//
	){
		return echostr;
	}
}

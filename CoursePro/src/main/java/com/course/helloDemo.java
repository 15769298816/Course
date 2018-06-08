/**
 * 
 */
package com.course;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author  hujuhui
 * @version 2018年5月23日 下午4:16:37
 */
@RestController
public class helloDemo {
	
	@Value("${server.port}")
	private String port;
	
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	String hello(){
		return port;
	}
}

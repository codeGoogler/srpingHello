package com.yuer.sbo.contorller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能描述：</br>
 *  SpringBoot HelloWorld
 * @author 于亚豪
 * @version 1.0 </p> 修改时间：</br> 修改备注：</br>
 */
@Controller
@RestController
public class HellowWord {
	
	@RequestMapping("/helloSb")
	@ResponseBody
	public Map<String, Object> showHelloWorld(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "Hello,SpringBoot");
		map.put("info","  Spring Boot 《一》开发一个“HelloWorld”的 web 应用");
		return map;
	}
}
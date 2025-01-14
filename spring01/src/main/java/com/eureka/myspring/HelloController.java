package com.eureka.myspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


// 반드시 해줘야하는 기능 , 웹용 어플리케이션 
@Controller
public class HelloController {
	
	private int count = 0;
	
	// 클라이언트에 요청 Get 방식, ResponseBody => 브라우저에 출력 ( 없으면 파일명으로 출력 )  
	@GetMapping("/hello")
	@ResponseBody
	public String myHello() {
		return "Hello Spring " + count++;
	}
	
}

package com.eureka.myspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class NumberGuessController {
	
	private int com_num = 0; // 난수 저장 변수 ( 1 ~ 100 )
	
	int newRandomNumber() {
		return (int)(Math.floor(Math.random()*100)+1);
	}
	
	@GetMapping("/check_num_guess")
	@ResponseBody
	public String check_num(@RequestParam(value="num_input") int num) {
		if (com_num==0) {
			com_num = newRandomNumber();
		}
		if (com_num == num) {
			com_num = newRandomNumber();
			return "정답";
		} else if (com_num < num) {
			return "낮춰주세요";
		} else {
			return "높여주세요";
		}
	}
	
}

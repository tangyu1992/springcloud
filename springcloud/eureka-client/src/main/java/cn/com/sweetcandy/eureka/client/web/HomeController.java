package cn.com.sweetcandy.eureka.client.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/****
 * 
 * @author tangyu
 * @date 2017年11月10日 下午2:53:24
 */
@Controller
@RequestMapping("/test")
public class HomeController {
	@GetMapping(produces="application/json")
	@ResponseBody
	public Object index(String name) {
		return "hello!" + name;
	}
}

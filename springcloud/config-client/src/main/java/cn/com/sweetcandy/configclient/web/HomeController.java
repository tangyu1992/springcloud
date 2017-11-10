/**
 * 
 */
package cn.com.sweetcandy.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangyu
 * @date 2017年11月10日 下午6:06:36
 */
@RestController
@RequestMapping("/")
public class HomeController {
	@Value("${foo}")
	String foo;

	@GetMapping
	public String index() {
		return "the config is:" + foo;
	}
}

/**
 * 
 */
package cn.com.sweetcandy.feign.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sweetcandy.feign.netservice.SchedualService;

/**
 * @author tangyu
 * @date 2017年11月10日 下午3:16:42
 */
@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	private SchedualService schedualService;

	@GetMapping
	public Object index(String name) {
		return schedualService.getResult(name);
	}
}

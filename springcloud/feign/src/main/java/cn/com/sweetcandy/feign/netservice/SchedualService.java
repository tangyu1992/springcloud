/**
 * 
 */
package cn.com.sweetcandy.feign.netservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.com.sweetcandy.feign.hystrix.ErrorHiHystric;

/**
 * @author tangyu
 * @date 2017年11月10日 下午3:18:00
 */
@FeignClient(value = "SERVICE-PROVIDER", fallback = ErrorHiHystric.class)
public interface SchedualService {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	String getResult(@RequestParam("name") String name);
}

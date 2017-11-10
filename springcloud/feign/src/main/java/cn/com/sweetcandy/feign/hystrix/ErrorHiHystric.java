/**
 * 
 */
package cn.com.sweetcandy.feign.hystrix;

import org.springframework.stereotype.Component;

import cn.com.sweetcandy.feign.netservice.SchedualService;

/**
 * 熔断器的错误处理方法，需要实现feign的api接口，并且在该接口指定fallback参数为该类的class
 * 
 * @author tangyu
 * @date 2017年11月10日 下午3:41:16
 */
@Component
public class ErrorHiHystric implements SchedualService {

	public String getResult(String name) {
		return "sorry," + name;
	}

}

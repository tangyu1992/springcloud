package cn.com.sweetcandy.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/****
 * 注意：config-client的配置文件不再是application.properties，而需要替换成.properties
 * 
 * @author tangyu
 * @date 2017年11月10日 下午6:02:50
 */
@SpringBootApplication
public class ConfigClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}

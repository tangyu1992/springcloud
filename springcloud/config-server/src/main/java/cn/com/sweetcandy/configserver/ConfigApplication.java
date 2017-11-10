package cn.com.sweetcandy.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/****
 * 
 * http请求地址和资源文件映射如下:
 * 
 * /{application}/{profile}[/{label}] /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 * 
 * @author tangyu
 * @date 2017年11月10日 下午5:36:49
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}

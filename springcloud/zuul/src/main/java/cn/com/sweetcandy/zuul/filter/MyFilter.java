/**
 * 
 */
package cn.com.sweetcandy.zuul.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * zuul过滤器，在这里可以实现安全验证过滤等等一系列的需求
 * 
 * @author tangyu
 * @date 2017年11月10日 下午4:03:26
 */
@Component
public class MyFilter extends ZuulFilter {
	/****
	 * run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问
	 */
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();// 拿到request了，就根据业务处理去
		final String name = request.getParameter("name");
		if (StringUtils.isBlank(name)) {
			System.out.println("name is null!");
			try {
				ctx.setSendZuulResponse(false);
	            ctx.setResponseStatusCode(401);
				ctx.getResponse().getWriter().write("can you give me your name?");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/****
	 * shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤
	 */
	public boolean shouldFilter() {
		return true;
	}

	/****
	 * filterOrder：过滤的顺序
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

	/****
	 * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下： pre：路由之前
	 * routing：路由之时 post： 路由之后 error：发送错误调用
	 * 
	 * 
	 */
	@Override
	public String filterType() {
		return "pre";
	}

}

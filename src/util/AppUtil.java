package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class AppUtil {
	/**
	 * 获取与当前线程绑定的httpServletRequest
	 * @return
	 */
	public static HttpServletRequest getRequest(){
		RequestAttributes attributes=RequestContextHolder.getRequestAttributes();
		return ((ServletRequestAttributes)attributes).getRequest();
	}
	
	/**
	 * 获取当前的session
	 * @return
	 */
	public static HttpSession getSession(){
		
		return getRequest().getSession();
		
		
	}
}

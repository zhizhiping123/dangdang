package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public abstract class BaseController {

	/**
	 * 获取与当前线程绑定的httpServletRequest
	 * @return
	 */
	protected HttpServletRequest getRequest(){
		RequestAttributes attributes=RequestContextHolder.getRequestAttributes();
		return ((ServletRequestAttributes)attributes).getRequest();
	}
	
	/**
	 * 获取当前的session
	 * @return
	 */
	protected HttpSession getSession(){
		
		return getRequest().getSession();
		
		
	}
}

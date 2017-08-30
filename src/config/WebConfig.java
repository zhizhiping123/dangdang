package config;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc //启用spring MVC注解
@ComponentScan(basePackages="web.controller")
@PropertySource(value={"classpath:email.properties"})
public class WebConfig extends WebMvcConfigurerAdapter{

	@Autowired
	private RequestMappingHandlerAdapter requestMappingHandlerAdapter;
	@Autowired
	private RequestMappingHandlerMapping requestMappingHandlerMapping;
	@PostConstruct
	public void init(){
		requestMappingHandlerAdapter.setIgnoreDefaultModelOnRedirect(true);
	}
	/**
	 * 配置视图解析器
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver in=new InternalResourceViewResolver();
		in.setPrefix("/");
		in.setSuffix(".jsp");
		in.setExposeContextBeansAsAttributes(true);
		return in;
	}
	/* 对静态资源放行
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		configurer.enable();
	}
	@Bean
	public CommonsMultipartResolver commonsMultipartResolver(){
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver();
		return multipartResolver;
	}
	

	
}

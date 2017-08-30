package config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[]{WebConfig.class};
	}

	@Override
	protected Filter[] getServletFilters() {
		Filter[] filters=new Filter[]{new CharacterEncodingFilter("UTF-8", true)};
		return filters;
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[]{"*.do"};
	}

}

package config;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import service.EmailActiveService;
import service.impl.EmailActiceServiceImpl;
import util.Base64Util;
@Configuration
@PropertySource(value={"classpath:email.properties"})
public class EmailConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public JavaMailSender mailSender() throws UnsupportedEncodingException{
		JavaMailSenderImpl javaMailSenderImpl=new JavaMailSenderImpl();
		javaMailSenderImpl.setHost(env.getProperty("mail.host"));
		System.out.println(env.getProperty("mail.host"));
		javaMailSenderImpl.setUsername(env.getProperty("mail.username"));
		javaMailSenderImpl.setPassword(env.getProperty("mail.password"));
		javaMailSenderImpl.setPort(Integer.parseInt(env.getProperty("mail.smtp.port")));
		Properties javaMailProperties=new Properties();
		javaMailProperties.setProperty("mail.smtp.starttls.enable", env.getProperty("mail.smtp.starttls.enable"));
		javaMailProperties.setProperty("mail.smtp.timeout", env.getProperty("mail.smtp.timeout"));
		javaMailSenderImpl.setJavaMailProperties(javaMailProperties);
		return javaMailSenderImpl;
	}
	@Bean
	public EmailActiveService emailService(){
		return new EmailActiceServiceImpl();
	}
}

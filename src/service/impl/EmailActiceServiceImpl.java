package service.impl;

import javax.annotation.Resource;

import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import service.EmailActiveService;
import util.RandomUtil;

public class EmailActiceServiceImpl implements EmailActiveService{
	@Resource
	private JavaMailSender javaMailSender;
	@Resource
	private Environment env;


	public String validateEmail(String email){
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setFrom(env.getProperty("mail.username"));
		mailMessage.setBcc(email);
		mailMessage.setSubject("邮箱激活码");
		String randomString = RandomUtil.getRandomString(6);
		mailMessage.setText("验证码:"+randomString+",5分钟内有效");//获取6位验证码
		javaMailSender.send(mailMessage);
		return randomString;
	}
		
}

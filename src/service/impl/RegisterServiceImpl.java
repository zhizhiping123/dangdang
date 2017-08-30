package service.impl;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.security.NoSuchAlgorithmException;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DDUserMapper;
import entity.DDUser;
import entity.dto.RegisterDto;
import service.RegisterService;
import util.AppUtil;
import util.MD5Util;
@Service
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	private DDUserMapper ddUserDao;

	@Override
	public Boolean register(RegisterDto registerDto) {
		System.out.println(ddUserDao);
		DDUser ddUser=new DDUser();
		ddUser.setEmail(registerDto.getEmail());
		ddUser.setIsEmailVerify(1);
		ddUser.setLastLoginTime(System.currentTimeMillis());
		try {
			ddUser.setPassword(MD5Util.getMD5String(registerDto.getPassword()));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ddUser.setLastLoginIp(AppUtil.getRequest().getRemoteAddr());
		ddUser.setNickname(registerDto.getNickName());
		int num=0;
		try {
			 num = ddUserDao.insert(ddUser);
		} catch (Exception e) {
		e.printStackTrace();
			return false;
			
		}
		if(num==1){
			return true;
		}
		return false;
	}

}

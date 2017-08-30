package service.impl;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DDUserMapper;
import entity.DDUser;
import entity.DDUserCriteria;
import entity.DDUserCriteria.Criteria;
import service.LoginService;
import util.AppUtil;
import util.MD5Util;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	public DDUserMapper ddUserMapper;

	@Override
	public Boolean login(String name, String password) {
		DDUserCriteria ddUserCriteria=new DDUserCriteria();
		String MD5Password = null;
		try {
			MD5Password = MD5Util.getMD5String(password);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		Criteria criteria = ddUserCriteria.createCriteria().andEmailEqualTo(name)
				.andPasswordEqualTo(MD5Password);
		
		List<DDUser> selectByExample = ddUserMapper.selectByExample(ddUserCriteria);
		if (selectByExample!=null) {
			AppUtil.getSession().setAttribute("nickName", selectByExample.get(0).getNickname());
			return true;
		}
		return false;
	}

}

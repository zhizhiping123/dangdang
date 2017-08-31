package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.LoginService;

@Controller
@RequestMapping("/user")
public class LoginController extends BaseController{
@Autowired
private LoginService loginService;
@RequestMapping("/login.do")
public String login(String name,String password){
	
	Boolean loginResult=loginService.login(name,password);
	if (loginResult) {
	getSession().setAttribute("email", name);
		getSession().setAttribute("currentPage", 1);
		return "redirect:/list/book/page/1.do";
	}
	else {
		return "redirect:/user/login_form.jsp";
	}
}
@RequestMapping("/logout.do")
public String logout(){
	getSession().removeAttribute("nickName");
	return "redirect:/main/login_form.jsp";
}

}






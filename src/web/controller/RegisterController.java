package web.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.DDUserMapper;
import entity.DDUserCriteria;
import entity.dto.RegisterDto;
import service.EmailActiveService;
import service.RegisterService;

@Controller
@RequestMapping("/user/register/")
public class RegisterController extends BaseController{
@Autowired
private	EmailActiveService emailActiceService;
@Autowired
private RegisterService registerService;
@Autowired
private DDUserMapper ddUserMapper;
@RequestMapping("/verify_form.do")
public String getRegisterForm(@Valid RegisterDto registerForm,Errors errors,Model model){
		
	if (getSession().getAttribute("exist_error")!=null) {
		getSession().removeAttribute("exist_error");
	}
	DDUserCriteria criteria=new DDUserCriteria();
			criteria.createCriteria().andEmailEqualTo(registerForm.getEmail());
	if (ddUserMapper.selectByExample(criteria)==null) {
		getSession().setAttribute("exist_error", "该邮箱已被注册");
		 return "redirect:/user/register_form.jsp";
	}
	
	if (getSession().getAttribute("error")!=null) {
		getSession().removeAttribute("error");
	}
	if (getSession().getAttribute("pwd_error")!=null) {
		getSession().removeAttribute("pwd_error");
	}
	System.out.println(registerForm);
	if (errors.hasErrors()) {
		getSession().setAttribute("error", "输入参数不符合");
		return "redirect:/user/register_form.jsp";
	}
	
	if(registerForm.getPassword().equals(registerForm.getPassword1())==false){
		getSession().setAttribute("pwd_error", "前后密码不一致");
			return "redirect:/user/register_form.jsp";
		
	}
	//获取验证码
	//String valiCode=(String) getSession().getAttribute("vili_code");
	//if(registerForm.getNumber().equals(valiCode)==false)
	//model.addAttribute("code_error", "验证码错误");
	
	//return null;
	getSession().setAttribute("register_email", registerForm.getEmail());
	String validateEmailCode=emailActiceService.validateEmail(registerForm.getEmail());
	if (validateEmailCode!=null) {
		getSession().setAttribute("valiEmailCode", validateEmailCode);
	}
	getSession().setAttribute("registerForm", registerForm);
	return "redirect:/user/verify_form.jsp";
}
	@RequestMapping("/vali_email.do")
	public String valiEmail(@RequestParam("code") String code,Model model){
	
		if (code==null) {
			getSession().setAttribute("errorMsg", "验证码不能为空");
			return "redirect:/user/verify_form.jsp";
		}
		String code1 = (String) getSession().getAttribute("valiEmailCode");
		System.out.println(code1);
		if (code.equals(code1)) {
			Boolean registerResult=registerService.register((RegisterDto)getSession().getAttribute("registerForm"));
			if(registerResult){
			return "redirect:/user/register_ok.jsp";
			}
			return "redirect:/user/register_form.jsp";
		}
	getSession().setAttribute("errorMsg", "验证码错误");
		return "redirect:/user/verify_form.jsp";		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

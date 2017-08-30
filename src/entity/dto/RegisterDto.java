package entity.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class RegisterDto {
@NotEmpty
private String email;
@NotEmpty
@Size(min=4,max=20)
private String nickName;
@NotEmpty
@Size(min=6,max=20)
private String password;
@NotEmpty
@Size(min=6,max=20)
private String password1;
private String number;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNickName() {
	return nickName;
}
public void setNickName(String nickName) {
	this.nickName = nickName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPassword1() {
	return password1;
}
public void setPassword1(String password1) {
	this.password1 = password1;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
@Override
public String toString() {
	return "RegisterDto [email=" + email + ", nickName=" + nickName + ", password=" + password + ", password1="
			+ password1 + ", number=" + number + "]";
}
}

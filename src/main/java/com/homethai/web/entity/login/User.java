package com.homethai.web.entity.login;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * Spring Security는 사용자 정보를 UserDetails라는 인터페이스 구현체로 사용한다. 즉, UserDetails는 사용자 정보 VO라고 생각하면 된다.
 * */

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class User{
	private String userId;
	private String userName; 
	private String LoginID;
	private String password; 
	private String email;
	private String jumin_no;
	private String address_no;
	private String address_detail;
	private String sex;
	private String note;
	private String mod_date;
	private String create_date;
	private String auth;
	
	public User(String userId, String userName, String loginID, String password, String email, String jumin_no,
				String address_no, String address_detail, String sex, String note, String mod_date, String create_date, String auth) 
	{
		super();
		this.userId = userId;
		this.userName = userName;
		LoginID = loginID;
		this.password = password;
		this.email = email;
		this.jumin_no = jumin_no;
		this.address_no = address_no;
		this.address_detail = address_detail;
		this.sex = sex;
		this.note = note;
		this.mod_date = mod_date;
		this.create_date = create_date;
		this.auth = auth;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginID() {
		return LoginID;
	}

	public void setLoginID(String loginID) {
		LoginID = loginID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJumin_no() {
		return jumin_no;
	}

	public void setJumin_no(String jumin_no) {
		this.jumin_no = jumin_no;
	}

	public String getAddress_no() {
		return address_no;
	}

	public void setAddress_no(String address_no) {
		this.address_no = address_no;
	}

	public String getAddress_detail() {
		return address_detail;
	}

	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getMod_date() {
		return mod_date;
	}

	public void setMod_date(String mod_date) {
		this.mod_date = mod_date;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getPassword() {
		return password;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}

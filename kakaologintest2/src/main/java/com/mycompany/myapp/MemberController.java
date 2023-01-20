package com.mycompany.myapp;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//http://localhost:8090/myapp/loginpage.do
//http://localhost:8090/myapp/kakaologintest.do

@Controller
public class MemberController {

	String app_admin_key = "1523ddf58b60db26e3a923a721489295";
	
	@Autowired
	private MemberService ms;
	
	public void setMs(MemberService ms) {
		this.ms = ms;
	}
	
	@RequestMapping(value="/loginpage.do", method=RequestMethod.GET)
	public String loginPage() {
		return "loginformtest";
	}
	
	@RequestMapping(value="/kakaologintest.do", method=RequestMethod.GET)
	public String kakaologin(@RequestParam(value="code", required= false, defaultValue = "") String code) {
		HashMap<String, String> token = ms.getToken(code);
		String access_token = token.get("access_token");
		String refresh_token = token.get("refresh_token");
		System.out.println("###access_token : " + access_token);
		System.out.println("###refresh_token : " + refresh_token);
		String response = ms.getTokenPayload(code);
		return "login";
	}

}
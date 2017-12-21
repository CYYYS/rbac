package cn.com.taiji.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
public class LoginController {

	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String toLogin() {
		
		return "login";
	}
	
	//@RequestMapping("/")
	@RequestMapping("/home")
	public String login(String username,String password) {
		System.out.println(username+"--"+password);
		//return "userList";
		//return "roleShow";
		//return "menuShow";
		return "departtree";
	}
	
}

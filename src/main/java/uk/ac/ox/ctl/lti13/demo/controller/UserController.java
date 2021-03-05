
package uk.ac.ox.ctl.lti13.demo.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/signUp")
	public String signUp() {
		return "user/signUp.html";
	}
	
	@RequestMapping("/signIn")
	public String signIn() {
		return "user/signIn.html";
	}
}

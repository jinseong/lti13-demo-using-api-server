package uk.ac.ox.ctl.lti13.demo.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private final Logger log = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/index2")
	public String index2(HttpServletRequest request, Model model) {

		log.info("log start");
		HttpSession session = request.getSession(false);
		Enumeration<String> enum_session = session.getAttributeNames();

		while(enum_session.hasMoreElements()) {
			String key = enum_session.nextElement();
			log.info("key --> " + key);
		}
		
		log.info("SPRING_SECURITY_CONTEXT : " + session.getAttribute("SPRING_SECURITY_CONTEXT"));
		
		return "index2.html";
	}
}

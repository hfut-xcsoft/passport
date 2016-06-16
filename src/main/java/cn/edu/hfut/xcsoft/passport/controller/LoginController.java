package cn.edu.hfut.xcsoft.passport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.hfut.xcsoft.passport.dao.UserDAO;
import cn.edu.hfut.xcsoft.passport.model.User;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value="", method=RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	@ResponseBody
	public String valid(String account, String password) {
		User user = userDAO.validUser(account, password);
		if (user != null) {
			return String.valueOf(user.getId());
		}
		return "Error!";
	}
}

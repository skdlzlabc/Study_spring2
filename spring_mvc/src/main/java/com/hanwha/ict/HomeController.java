package com.hanwha.ict;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hanwha.ict.dto.IStudentService;

/**
 * Handles requests for the application home page.
 */
@Controller("home")		//@Component : 컨테이너 올라갈때 bean이 됨
@RequestMapping(value="/home")	//이컨트롤러는 /home으로 시작 됩니다.
public class HomeController {
//public class HomeController implements org.springframework.web.servlet.mvc.Controller{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired		
	private IStudentService iStudentService;	
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)	//GET방식으로만 받아서 처리하겠다.
	@RequestMapping(value = "/home")	//어떤상황에 불려서 어떻게 동작을 할까
	public String home(Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.getDefault());
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("studentService", iStudentService.printAll("woohyung"));
		return "home";
	}
	
	@RequestMapping(value = "/index")	//어떤상황에 불려서 어떻게 동작을 할까
	public String index(Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.getDefault());
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home/index";
	}

//	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//		return null;
//	}
	
}

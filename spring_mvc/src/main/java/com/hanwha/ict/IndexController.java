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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hanwha.ict.dto.HanwhaGroup;

/**
 * Handles requests for the application home page.
 */
@Controller("index")
@RequestMapping(value="/init")	//이컨트롤러는 /home으로 시작 됩니다.1
public class IndexController {
//	
//	@Autowired
//	private HanwhaGroup hanwhagroup;
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
//	private HanwhaGroup hanwhaGroup;
	
//	public void setHanwhaGroup(HanwhaGroup hanwhaGroup) {
//		this.hanwhaGroup = hanwhaGroup;
//	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/index")
	public String home(Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.getDefault());
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home/hanwha";
	}
}

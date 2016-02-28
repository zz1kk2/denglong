package com.control.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Administrator Œƒ’¬¿‡–Õ
 */
@Controller
@RequestMapping("/admin")
public class articleTypeC {

	/**
	 * 
	  * @Title: articleType
	  * @Description: TODO
	  * @param @param request
	  * @param @param model
	  * @param @return    
	  * @return String    
	  * @throws
	 */
	@RequestMapping("/articleType")
	    public String articleType(HttpServletRequest request, Model model) {
	        return "/admin/articleType/articleType";
    }
	  
    @RequestMapping("/articleType/add")
    public String articleType_add(HttpServletRequest request, Model model) {
        return "/admin/articleType/articleType";
    }
    
}

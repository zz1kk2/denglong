package com.control.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Administrator ��̨�û���¼
 */
@Controller
@RequestMapping("/admin")
public class Article {

    @RequestMapping("/article")
    public String ArticleIndex(HttpServletRequest request, Model model) {
        return "/admin/article/index";
    }
    
   
    
}

package com.control.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Administrator 后台用户登录
 */
@Controller
@RequestMapping("/admin")
public class LoginC {

    @RequestMapping("/login")
    public String LoginIndex(HttpServletRequest request, Model model) {
        return "/admin/login";
    }
    
    @RequestMapping("/index")
    public String adminIndex(HttpServletRequest request, Model model) {
        return "/admin/frame/index";
    }
    
}

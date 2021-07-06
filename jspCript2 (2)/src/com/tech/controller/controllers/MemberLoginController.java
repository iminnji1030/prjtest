package com.tech.controller.controllers;

import javax.servlet.http.HttpSeervletRequset;
import javax.servlet.http.HttpServletResponse;

public class MemberLoginController implements Controller{
	
	@Override
	public void execute(HttpServletRequset requset,
			HttpServletResponse response) throws Exception {
		System.out.println("MemberLoginController");
		response.sendRedirect("Loginform.jsp");
	}

}

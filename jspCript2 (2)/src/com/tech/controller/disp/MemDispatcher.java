package com.tech.controller.disp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemDispatcher extends HttpServlet{
	
	private void doService(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("do�떊�샇諛쏆쓬");
		String uri=request.getRequestURI();
		String conPath=request.getContextPath();
		String com=uri.substring(conPath.length());
		
		
		System.out.println("uri : "+uri);
		System.out.println("conPath : "+conPath);
		System.out.println("com : "+com);
	}
	
	
	
	
	
	Controller controller=null;
	
	try {
		if (com.equals("/join/memberjoin.do")) {
			contrller=new MEmberJoinController();
		}else if (com.equals("/join/memberjoinproc.do"))                             {
			=
		}
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	

}

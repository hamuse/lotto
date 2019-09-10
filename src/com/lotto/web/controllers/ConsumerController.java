package com.lotto.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lotto.web.pool.Constants;
import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.services.ConsumerService;
import com.lotto.web.servicesImpl.ConsumerServiceImpl;


@WebServlet("/consumer.do")
public class ConsumerController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
//		String action = request.getParameter("action");
//		String dest = request.getParameter("dest");
//		RequestDispatcher rd =request.getRequestDispatcher("WEB-INF/views/customer/join.jsp");
	String action = request.getParameter("action");
		System.out.println("액션 나오냐?"+action);
		switch(request.getParameter("action")) {
		
		case "move": 
//			request.getParameter("dest");
			request.getRequestDispatcher
				(String.format(Constants.VIEW_PATH,"consumer", request.getParameter("dest"))).forward(request, response);
			break;
		case  "join":
			String cid = request.getParameter("cid");
			String pw = request.getParameter("pw");
			ConsumerBean param = new ConsumerBean();
			param.setCid(cid);
			param.setPw(pw);
			System.out.println("doGet"+param.toString());
			ConsumerService service = new ConsumerServiceImpl();
//			service.registerConsumer(param);
			request.getRequestDispatcher
			(String.format(Constants.VIEW_PATH,"consumer",request.getParameter("dest"))).forward(request, response);
			break;
		case "login" : 
			break;
		default :
			break;
		}
//		String cid = request.getParameter("cid");
//		String pw = request.getParameter("pw");
//		ConsumerBean param = new ConsumerBean();
//		param.setCid(cid);
//		param.setPw(pw);
//		System.out.println("doGet"+param.toString());
//		ConsumerService service = new ConsumerServiceImpl();
//		service.registerConsumer(param);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

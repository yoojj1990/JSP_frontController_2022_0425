package com.yjj.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class frontCon
 */
@WebServlet("*.do") // 확장자 패턴으로 맵핑
public class frontCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public frontCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String url = request.getRequestURI();
		System.out.println("url : " + url);
		String conPath = request.getContextPath();
		System.out.println("context : " + conPath);
		String command = url.substring(conPath.length());
		System.out.println("command : " + command);
		
		if(command.equals("/insert.do")) {
			System.out.println("insert.do 요청처리");
		} else if(command.equals("/delete.do")) {
			System.out.println("delete.do 요청처리");
		}
		
		
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

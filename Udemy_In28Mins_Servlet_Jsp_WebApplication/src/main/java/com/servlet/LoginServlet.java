package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "To handle login requests and responses in application", urlPatterns = { "/login.do" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserValidationService service = new UserValidationService();
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//request.setAttribute("name", request.getParameter("name"));
		//request.setAttribute("password", request.getParameter("password"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		boolean isUserValid = service.isUserValid(name, password);

		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));

		if(isUserValid){
			/*request.setAttribute("todos",todoService.getTodoList());
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);*/
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/todo.do");
		}else {
			request.setAttribute("errorMessage", "Invalid Credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}

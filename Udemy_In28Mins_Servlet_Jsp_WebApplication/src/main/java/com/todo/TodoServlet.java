package com.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.TodoService;

/**
 * Servlet implementation class TodoServlet
 */
@WebServlet(description = "To handle todo requests and responses in application", urlPatterns = { "/todo.do" })
public class TodoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private TodoService todoService = new TodoService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TodoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("todos",todoService.getTodoList());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	}

}

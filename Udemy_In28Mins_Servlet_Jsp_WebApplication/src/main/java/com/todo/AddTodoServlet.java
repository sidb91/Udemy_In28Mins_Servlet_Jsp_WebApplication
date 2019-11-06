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
@WebServlet(description = "To handle add todo requests and responses in application",
urlPatterns = { "/add-todo.do" })
public class AddTodoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private TodoService todoService = new TodoService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddTodoServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(
				request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String newTodo = request.getParameter("todo");
		String category = request.getParameter("category");
		todoService.addTodo(new Todo(newTodo, category));
		response.sendRedirect("/list-todo.do");
	}

}

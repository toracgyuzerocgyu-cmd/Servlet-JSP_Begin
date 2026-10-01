package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex62
 */
@WebServlet("/ex62")
public class Ex62 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = (int)(Math.random() * 10);
		
		if(num % 2 == 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("forwarded.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("http://localhost:8080/ex/redirected.jsp");
		}
	}

}
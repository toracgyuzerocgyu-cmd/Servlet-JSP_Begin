package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gym.UseCache;
import gym.UseCacheLogic;


@WebServlet("/RequestCheck")
public class RequestCache extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/gymrequest.html");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String district = request.getParameter("area");
		String[] opt = request.getParameterValues("option");
		
		
		UseCache price = new UseCache(name, district, opt, 2000);
		
		UseCacheLogic usecachelogic = new UseCacheLogic();
		usecachelogic.execute(price);
		
		request.setAttribute("price", price);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/gymrequest.jsp");
		dispatcher.forward(request, response);
	}

}

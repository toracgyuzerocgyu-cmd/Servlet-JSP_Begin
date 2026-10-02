package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Human;

/**
 * Servlet implementation class Code07_02Servlet
 */
@WebServlet("/Code07_02Servlet")
public class Code07_02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストスコープに存在するインスタンスの生成
		Human human = new Human("湊 雄輔", 23);
		
		// リクエストスコープにインスタンスを保存
		request.setAttribute("human", human);
		
		// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("code07_03.jsp");
		dispatcher.forward(request, response);
		
		// リクエストスコープからインスタンスを取得
		Human h = (Human)request.getAttribute("human");
		
		System.out.println("===ここからリクエストスコープのデータ取得===");
		System.out.println("Humanインスタンスの中身を表示");
		System.out.println(h.getName() + "は" + h.getAge() + "歳です");
	}

}

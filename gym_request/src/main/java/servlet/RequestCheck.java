package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Gym;
import model.GymRequestLogic;


/**
 * Servlet implementation class RequestCheck
 */
@WebServlet("/RequestCheck")
public class RequestCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 処理受付
	    // フォワード
	    RequestDispatcher dispatcher =
	        request.getRequestDispatcher
	            ("WEB-INF/ex2/gymrequest.jsp");
	    dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータの文字コードを指定
	    request.setCharacterEncoding("UTF-8");
	    // リクエストパラメータを取得
	    String name = request.getParameter("name"); // 名前
	    String area = request.getParameter("area"); // 利用地区
	    String[] option = request.getParameterValues("option"); // オプション　同名を複数持って配列で渡すパターン

	    // 入力値をプロパティに設定
	    Gym gym = new Gym(name,area,option);

	    GymRequestLogic gymRequestLogic = new GymRequestLogic();
	    gymRequestLogic.execute(gym);

	    // リクエストスコープに保存
	    request.setAttribute("gym", gym);

	    // フォワード
	    RequestDispatcher dispatcher =
	        request.getRequestDispatcher
	            ("WEB-INF/ex2/gymrequestResult.jsp");
	    dispatcher.forward(request, response);
	}

}

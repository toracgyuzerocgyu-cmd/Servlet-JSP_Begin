package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Gym2;
import model.GymRequestLogic2;


/**
 * Servlet implementation class RequestCheck
 */
@WebServlet("/RequestCheck2")
public class RequestCheck2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 処理受付
	    // フォワード
	    RequestDispatcher dispatcher =
	        request.getRequestDispatcher
	            ("WEB-INF/ex2/gymrequest2.jsp");
	    dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータの文字コードを指定
	    request.setCharacterEncoding("UTF-8");
	    // リクエストパラメータを取得
	    String name = request.getParameter("name"); // 名前
	    String area = request.getParameter("area"); // 利用地区
	    String[] setParams = {"option01","option02","option03"}; // オプション
	    String[] option = new String[3]; // オプション
	    int i = 0;
	    for(String setPara:setParams) {
	    	option[i] = request.getParameter(setPara); // オプション
	    	if(option[i] != null) {
	    		i++;
	    	}
	    }

	    // 入力値をプロパティに設定
	    Gym2 gym = new Gym2(name,area,option);

	    GymRequestLogic2 gymRequestLogic = new GymRequestLogic2();
	    gymRequestLogic.execute(gym);

	    // リクエストスコープに保存
	    request.setAttribute("gym", gym);

	    // フォワード
	    RequestDispatcher dispatcher =
	        request.getRequestDispatcher
	            ("WEB-INF/ex2/gymrequestResult2.jsp");
	    dispatcher.forward(request, response);
	}

}

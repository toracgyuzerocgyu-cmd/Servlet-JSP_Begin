package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Human;

/**
 * Servlet implementation class code08_01Servlet
 */
@WebServlet("/code08_01Servlet")
public class code08_01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// セッションスコープに保存するインスタンスの作成
		Human human = new Human();
		human.setName("湊　雄輔");
		human.setAge(23);
		
		// HttpSessionインスタンスの取得
		HttpSession session = request.getSession();
		
		// セッションスコープにインスタンスを保存
		session.setAttribute("human", human);
		
		// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("code08_02.jsp");
		dispatcher.forward(request, response);
		
		// リダイレクト
		// response.sendRedirect("code08_02.jsp");
		
		// セッションスコープからインスタンスを取得
		Human h = (Human)session.getAttribute("human");
		
		// セッションスコープからインスタンスを削除
		session.removeAttribute("human");
		
		// セッションスコープのインスタンスの中身を表示
		System.out.println("=== セッションスコープからデータを取得 ===");
		System.out.println("=== 以下セッションスコープのインスタンス ===");
		System.out.println(h.getName() + "さんは" + h.getAge() + "歳です");
	}
}

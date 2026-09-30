package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex_52
 */
@WebServlet("/testenq")
public class Ex_52 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex_52() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String qtype = request.getParameter("qtype");
		String body = request.getParameter("body");
		
		String msg = "";
		
		if(name == null || name.length()==0 || qtype == null || qtype.length()==0 || body == null || body.length()==0) {
			msg = "未入力の箇所があります";
		} else {
			switch(qtype) {
				case "company":
					msg = name + " さんの " + "会社" + " についてのお問い合わせを受け付けました<br><br>◎内容<br><textarea>" + body + "</textarea>";
				break;
				case "product":
					msg = name + " さんの " + "製品" + " についてのお問い合わせを受け付けました<br><br>◎内容<br><textarea>" + body + "</textarea>";
				break;
				case "support":
					msg = name + " さんの " + "アフターサポート" + " についてのお問い合わせを受け付けました<br><br>◎内容<br><textarea>" + body + "</textarea>";
				break;
			}
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>ユーザー登録結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

}

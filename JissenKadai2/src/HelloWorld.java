import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* テストサーブレットクラス
*/
@WebServlet(description = "サーブレット テスト", urlPatterns = { "/HelloServlet" })
	public class HelloWorld extends HttpServlet {

	/**
	 * GETリクエスト処理
	 */
		protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				// レスポンスヘッダの設定
				response.setContentType("text/html; charset=UTF-8");
				// ページの描画
				PrintWriter writer = response.getWriter();
				writer.println("<html>");
				writer.println(" <head>");
				writer.println(" <title>HelloServlet</title>");
				writer.println(" </head>");
				writer.println(" <body>");
				writer.println(" <h1>Hello World</h1>");
				writer.println(" <p>Test!!!</p>");
				writer.println(" </body>");
				writer.println("</html>");
			}
	}
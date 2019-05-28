package date;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DateServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		Date date = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String data = dateFormat.format(date); 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+data+"</h1>");
		out.close();
	}
}

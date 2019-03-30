package mp.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginProcess
 */
public class loginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(uname.equals("professional") && pass.equals("vlift"))
	{
			response.sendRedirect("html/welcome.html");
			}
		else
		{
			response.sendRedirect("html/plogin.html");
		}
	}

}

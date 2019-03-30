package mp.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class profdetails
 */
public class profdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	String pname=request.getParameter("pname");
	String pphone=request.getParameter("pphone");
	
	HttpSession session = request.getSession();
	
	
	session.setAttribute("pname",pname);
	session.setAttribute("pphone",pphone);
	
	response.sendRedirect("html/website.html");
	}

}

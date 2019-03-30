package mp.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class details1Process
 */
public class details1Process extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	      
	String company=request.getParameter("company");
	String year=request.getParameter("year");
	String compliant=request.getParameter("compliant");
	
	HttpSession session = request.getSession();
	session.setAttribute("company",company);
	session.setAttribute("year",year);
	session.setAttribute("compliant",compliant);
	
	response.sendRedirect("html/details01.html");
	}

}

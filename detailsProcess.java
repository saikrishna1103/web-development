package mp.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class detailsProcess
 */
public class detailsProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
      String name=request.getParameter("name");
	  String add=request.getParameter("add");
	  String phone=request.getParameter("phone");
	  
	  HttpSession session = request.getSession();
	   
      
      session.setAttribute("name", name);
      session.setAttribute("add", add);
      session.setAttribute("phone",phone);
      
      response.sendRedirect("html/details1.html");
	}

}

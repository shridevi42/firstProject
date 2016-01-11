

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
String name = request.getParameter("userName");
String pwd = request.getParameter("psw");
try {
	try {
		if(LoginDao.validate(name, pwd))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/page1.html");
			rd.include(request, response);
			
			}
		else
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("/error.html");
			rd.include(request, response);
		}
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}

}

package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import users.User;

/**
 * A servlet that handles profile page.
 * 
 * @author Macky Dieng
 * @author Baptiste Vannesson
 */
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        
    	HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        
        if (user!=null) {
            this.getServletContext().getRequestDispatcher( "/views/profil.jsp" ).forward( req, resp );
        } else {
        	resp.sendRedirect(req.getContextPath());
        }
        
    }

}
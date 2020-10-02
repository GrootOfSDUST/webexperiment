import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(value = {"/register"})
public class Servlet1 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String school = req.getParameter("school");

        HttpSession session = req.getSession();
        session.setAttribute("name",name);

        Cookie cookie = new Cookie("age",age);

        ServletContext application= getServletContext();
        application.setAttribute("school",school);

        req.getRequestDispatcher("./reguser2.jsp");
    }
}

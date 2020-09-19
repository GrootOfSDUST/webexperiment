import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/servlet2")
public class servlet2 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setCharacterEncoding("utf-8");

        String age = (String) req.getAttribute("age");
        System.out.println(age);
        if (Integer.valueOf(age).intValue() < 20)
        {
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<meta charset='utf-8'>");
            printWriter.println("<title>结果页面</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<h1 style=\"text-align:center;\">欢迎你，少年！</h1>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
        else if (Integer.valueOf(age).intValue() > 40)
        {
            resp.sendRedirect("login.jsp");
        }
        else
        {
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<meta charset='utf-8'>");
            printWriter.println("<title>结果页面</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<h1 style=\"text-align:center;\">欢迎您！</h1>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        doGet(req,resp);
    }
}

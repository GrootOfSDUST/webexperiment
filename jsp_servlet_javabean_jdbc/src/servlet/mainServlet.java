package servlet;

import dao.loginDao;
import dao.loginDaoImpl;
import entity.User;
import utils.SqlSrvDBConn;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/main")
public class mainServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        loginDao loginDao = new loginDaoImpl();
        User user = null;
        try {
            user = loginDao.getUserByUserNameAndPassword(username, password, request.getSession());
            if (user == null)
            {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            else
            {
                request.getRequestDispatcher("main.jsp").forward(request, response);
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException{
        doGet(request,response);
    }
}

package dao;

import entity.User;
import utils.SqlSrvDBConn;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDaoImpl implements loginDao {
    @Override
    public User getUserByUserNameAndPassword(String username, String password, HttpSession session) throws SQLException {
        boolean validated = false;
        SqlSrvDBConn sqlSrvDBConn = new SqlSrvDBConn();
        User user = null;
        user = (User)session.getAttribute("user");
        if (user == null)
        {
            String sql = "SELECT * FROM usertable";
            ResultSet rs = sqlSrvDBConn.executeQuery(sql);
            try
            {
                while (rs.next())
                {
                    if ( (rs.getString("username").trim().compareTo(username) == 0) && (rs.getString("password").compareTo(password) == 0) )
                    {
                        user = new User();
                        user.setId(rs.getInt(1));
                        user.setUsername(rs.getString(2));
                        user.setPassword(rs.getString(3));
                        session.setAttribute("user",user);
                        validated = true;
                    }
                }
                rs.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            sqlSrvDBConn.closeStmt();
            sqlSrvDBConn.closeConn();
        }
        else
        {
            validated = true;
        }
        if (validated == true)
        {
            return user;
        }
        return null;
    }
}

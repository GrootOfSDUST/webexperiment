package dao;

import entity.User;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

public interface loginDao {
    public User getUserByUserNameAndPassword(String username, String password, HttpSession session) throws SQLException;
}

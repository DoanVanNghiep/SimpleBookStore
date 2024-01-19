package vnua.fita.bookstore.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import vnua.fita.bookstore.bean.User;

public class UserDao {
    
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bookshop";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "0945057018";
	
	
	private boolean validateLogin(String username, String password) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next(); // Nếu có kết quả, đăng nhập thành công
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}

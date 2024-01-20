package vnua.fita.bookstore.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vnua.fita.bookstore.bean.Book;

public class BookDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	private PreparedStatement preStatement;
	private ResultSet resultSet;
	private Statement statement;
	

	public BookDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	public List<Book> listAllBooks(){
		List<Book> books = new ArrayList<Book>();
		String sql = "SELECT * FROM book";
		jdbcConnection = DBConnection.createConnection(jdbcURL,jdbcUsername,jdbcPassword);
		try {
			statement = jdbcConnection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				int id = resultSet.getInt("book_id");
				String title = resultSet.getString("title");
				String  author = resultSet.getString("author");
				int price = resultSet.getInt("price");
				int quantityInStock = resultSet.getInt("quantity_in_stock");
				String detail = resultSet.getString("detail");
				String imagePath = resultSet.getString("image_path");
				Book book = new Book(id, title, author, price, quantityInStock);
				book.setDetail(detail);
				book.setImagePath(imagePath);
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		finally {
			DBConnection.closeResultSet(resultSet);
			DBConnection.closeStatement(statement);
			DBConnection.closeConnect(jdbcConnection);
		}
		return books;
	}
	
	public boolean deleteBook(int bookid) {
		boolean deleteResult = false;
		String sql = "DELETE FROM book WHERE book_id = ?";
		jdbcConnection = DBConnection.createConnection(jdbcURL,jdbcUsername,jdbcPassword);
		try {
			preStatement = jdbcConnection.prepareStatement(sql);
			preStatement.setInt(1, bookid);
			deleteResult = preStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBConnection.closePreparedStatement(preStatement);
			DBConnection.closeConnect(jdbcConnection);
		}
		return deleteResult;
	}
}

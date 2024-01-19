package vnua.fita.bookstore.servlet;

import java.util.ArrayList;
import java.util.List;

public class LoginForm{
	private static String userName;
    private static String password;
    
    
    public static String getUserName() {
		return userName;
	}

	public static void setUserName(String userName) {
		LoginForm.userName = userName;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		LoginForm.password = password;
	}
	
	public List<String> validate(){
		List<String> errors = new ArrayList<>();
		if(userName == null || userName.trim().isEmpty()) {
			errors.add("Nhap tai khoan.");
		}
		if(password == null || password.trim().isEmpty()) {
			errors.add("Nhap mat khau.");
		}
		return errors;
	}
	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    public LoginForm(String username,String password) {
        username = this.userName;
        password = this.password;
        // TODO Auto-generated constructor stub
    }
}

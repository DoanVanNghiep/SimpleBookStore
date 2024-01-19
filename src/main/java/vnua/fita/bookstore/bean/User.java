package vnua.fita.bookstore.bean;

public class User {
	private static String userName;
	private static String password;
	private static int role;
	private static String fullName;
	public static String getUserName() {
		return userName;
	}
	public static void setUserName(String userName) {
		User.userName = userName;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		User.password = password;
	}
	public static int getRole() {
		return role;
	}
	public static void setRole(int role) {
		User.role = role;
	}
	public static String getFullName() {
		return fullName;
	}
	public static void setFullName(String fullName) {
		User.fullName = fullName;
	}
	public User() {
		
	}
    public User(String username,String password,String fullName,int role) {
        username = this.userName;
        password = this.password;
        fullName = this.fullName;
        role = this.role;
        // TODO Auto-generated constructor stub
    }
	
}

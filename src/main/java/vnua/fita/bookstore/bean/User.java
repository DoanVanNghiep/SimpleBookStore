package vnua.fita.bookstore.bean;

public class User {
	private static String userName;
	private static String password;
	private static int role;
	private static String fullName;
	private static String email;
	private static String mobile;
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		User.email = email;
	}
	public static String getMobile() {
		return mobile;
	}
	public static void setMobile(String mobile) {
		User.mobile = mobile;
	}
	public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		User.address = address;
	}


	private static String address;
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
	
	public User(String username, String password, int role, String fullname, String email,
			String mobile, String address) {
		this.userName = username;
		this.password = password;
		this.role = role;
		this.fullName = fullname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	
	
    public User(String username,String password,String fullName,int role) {
        username = this.userName;
        password = this.password;
        fullName = this.fullName;
        role = this.role;
        // TODO Auto-generated constructor stub
    }
	
}

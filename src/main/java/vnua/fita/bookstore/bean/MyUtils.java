package vnua.fita.bookstore.bean;

import javax.servlet.http.HttpSession;

public class MyUtils {
	public static void storeLoginedUser(HttpSession session, User loginedUser) {
		session.setAttribute("loginedUser", loginedUser);
	}
}

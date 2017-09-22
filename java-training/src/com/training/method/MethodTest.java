package com.training.method;

/**
 * java传值传址
 * 
 * @author 14033159
 *
 */
public class MethodTest {

	public static void setName(User user) {
		user.setUserName("小明");
	}

	public static void changeUser(User user) {
		User u = new User();
		u.setUserName("小王");
		user = u;
	}

	public static void setVal(Integer v) {
		v = v + 10;
	}

	public static void main(String[] args) {
		User user = new User();
		setName(user);
		System.out.println(user.getUserName());
		changeUser(user);
		System.out.println(user.getUserName());

		Integer v = 10;
		setVal(v);
		System.out.println(v);
	}

}

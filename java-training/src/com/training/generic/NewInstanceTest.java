package com.training.generic;

/**
 * Class类 newInstanceTest方法
 * @author 14033159
 *
 */
public class NewInstanceTest {

	public static void main(String[] args) {
		try {
			//三种方式获取类实例
			Apple ap  =Apple.class.newInstance();
			ap.getName();
			Apple ap2 = ap.getClass().newInstance();
			ap2.getName();
			Apple ap3 = (Apple) Class.forName(ap.getClass().getName()).newInstance();
			ap3.getName();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.training.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.training.generic.Apple;

/**
 * 反射练习
 * 
 * @author 14033159
 *
 */
public class ReflectTest {

	public static void main(String[] args) {

		// 返回类的public域
		Field[] fields = Apple.class.getFields();

		// 返回所有域
		Field[] allFields = Apple.class.getDeclaredFields();

		for (Field field : fields) {
			System.out.println(field.getName());
		}

		for (Field field : allFields) {
			System.out.println(field.getName());
		}

		Method[] publicMethods = Apple.class.getMethods();
		
		Method[] allMethods = Apple.class.getDeclaredMethods();

		for (Method method : publicMethods) {
			System.out.println(method.getName());
		}
		
		for (Method method : allMethods) {
			System.out.println(method.getName());
		}
		
		try {
			System.out.println("断点");
			Apple.class.getMethod("getAge").invoke(new Apple());
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

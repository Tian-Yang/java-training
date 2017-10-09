package com.training.innerclass;

/**
 * 内部类Test
 * 
 * @author 14033159
 *
 */
public class InnerClassTest {

	public static void main(String[] args) {

		EatChicken jcc = new EatChicken("M4", "枪托");

		EatChicken hl = new EatChicken("Mini", "枪口补偿器");

		// new 内部类
		EatChicken.Gun xd = jcc.new Gun();
		

		jcc.pickUpGun();

		jcc.pickUpBullet("4.56毫米子弹");
		
		jcc.shoot(jcc.new Gun());

		hl.pickUpGun();

		hl.pickUpBullet("7.26毫米子弹");

		xd.getGun();
	}
}

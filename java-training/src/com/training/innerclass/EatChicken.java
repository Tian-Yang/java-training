package com.training.innerclass;

/**
 * 大吉大利,今晚吃鸡
 * 
 * @author 14033159
 *
 */
public class EatChicken {

	private String gunName;

	private static String fitting;

	private static String bullet;

	public EatChicken(String gunName, String f) {
		this.gunName = gunName;
		fitting = f;
	}

	public void pickUpGun() {
		Gun g = new Gun();
		g.getGun();
	}

	public void pickUpBullet(String b) {
		Gun g = new Gun();
		g.getBullet(b);
	}

	/**
	 * 局部内部类
	 * 
	 * @param gun
	 */
	public void shoot(Gun gun) {

		class Fight extends EatChickenFight {
			@Override
			public void shootLyb() {
				gun.getGun();
				System.out.println(" 射死一个老阴B ");
			}

		}
		Fight f = new Fight();
		f.shootLyb();

	}

	public void bomb() {
		Gun gun = new Gun() {
			public void blitz() {
				this.dropABomb();
			}
		};
	}

	public class Gun {

		public void getBullet(String b) {
			bullet = b;
			System.out.println("get a " + bullet);
		}

		public void getGun() {
			System.out.println("I get a " + gunName + " with " + fitting);
		}

		public void dropABomb() {
			System.out.println("帝国投弹手 投弹");
		}
	}
}

package com.zhuani21.review.other;

public class Test {

	public static void main(String[] args) {
		int money = 14000;

		double total = 0;

		int year = 40;

		float rating = 0.18f;

		for (int i = 0; i <41; i++) {
			System.out.println("year" + i + " : "  +  calc(money, i, rating));
			total += calc(money, i, rating);
			System.out.println("total: " + total);
		}
		
	}

	private static double calc(float money, int i, float rating) {
		
		for (int j = 0; j < i; j++) {
			money = money * (1 + rating);
		}
		return money;
	}

}

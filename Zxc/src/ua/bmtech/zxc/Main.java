package ua.bmtech.zxc;

public class Main {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "бутылок (бутылки)";
		System.out.println(beerNum + " " + word + " на стене");
		while (beerNum > 0){
			if (beerNum == 1){
				word = "бутылкa";
			}
			System.out.println("Возьми одну.");
			System.out.println("Пусти по кругу!");
			beerNum = beerNum - 1;
			if (beerNum >0){
				System.out.println(beerNum + " " + word + "пива на стене");
			} else {
				System.out.println("Нет бутылок пива на стене");
					}
				}
			}
		}

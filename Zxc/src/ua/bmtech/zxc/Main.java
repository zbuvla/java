package ua.bmtech.zxc;

public class Main {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "������� (�������)";
		System.out.println(beerNum + " " + word + " �� �����");
		while (beerNum > 0){
			if (beerNum == 1){
				word = "������a";
			}
			System.out.println("������ ����.");
			System.out.println("����� �� �����!");
			beerNum = beerNum - 1;
			if (beerNum >0){
				System.out.println(beerNum + " " + word + "���� �� �����");
			} else {
				System.out.println("��� ������� ���� �� �����");
					}
				}
			}
		}

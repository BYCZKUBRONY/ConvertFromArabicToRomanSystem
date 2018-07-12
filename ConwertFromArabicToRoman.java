package de.ConwertFromArabicToRoman;

import java.util.Scanner;

public class ConwertFromArabicToRoman {

	public static String policz(int number) {
		StringBuilder sb=new StringBuilder();
		if(number>=3000&&number<=3999) {
			sb.append("MMM");
			number-=3000;
		}
		if(number>=2000&&number<=2999) {
			sb.append("MM");
			number-=2000;
		}
		if(number>=1000&&number<=1999) {
			sb.append("M");
			number-=1000;
		}
		if(number>=900&&number<=999) {
			sb.append("CM");
			number-=900;
		}
		if(number>=500&&number<=899) {
			sb.append("D");
			number-=500;
		}
		if(number>=400&&number<=499) {
			sb.append("CD");
			number-=400;
		}
		if(number>=300&&number<=399) {
			sb.append("CCC");
			number-=300;
		}
		if(number>=200&&number<=299) {
			sb.append("CC");
			number-=200;
		}
		if(number>=100&&number<=199) {
			sb.append("C");
			number-=100;
		}
		if(number>=90&&number<=99) {
			sb.append("XC");
			number-=90;
		}
		if(number>=50&&number<=89) {
			sb.append("L");
			number-=50;
		}
		if(number>=40&&number<=49) {
			sb.append("XL");
			number-=40;
		}
		if(number>=30&&number<=39) {
			sb.append("XXX");
			number-=30;
		}
		if(number>=20&&number<=29) {
			sb.append("XX");
			number-=20;
		}
		if(number>=10&&number<=19) {
			sb.append("X");
			number-=10;
		}
		if(number==9) {
			sb.append("IX");
			number-=9;
		}
		if(number>=5&number<=8) {
			sb.append("V");
			number-=5;
		}
		if(number==4) {
			sb.append("IV");
			number-=4;
		}
		if(number==3) {
			sb.append("III");
			number-=3;
		}
		if(number==2) {
			sb.append("II");
			number-=2;
		}
		if(number==1) {
			sb.append("I");
			number-=1;
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number from 1 to 3999:");
		String number=scan.nextLine();
		int numberint=Integer.parseInt(number);
		if(numberint>=4000) {
			System.out.println("Poda³eœ za du¿a liczbê!");
		}
		else {
			System.out.println(number=policz(numberint));
		}
	
		
	}

}

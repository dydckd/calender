package yc.calender;

import java.util.Scanner;

public class Calender {
	
	private final int[] Max_Days={31,28,31,30,31,30,31,31,30,31,30,31};
	public int MaxDaysOfMonth(int month) {
		return Max_Days[month-1];
	}

	public static void main(String[] args) {
		
//		System.out.println("일 월 화 수 목 금 토");
//		System.out.println("=================");
//		System.out.println("1 2 3 4 5 6 7");
//		System.out.println("8 9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
		String Prompt = ">";
		Scanner sc =  new Scanner(System.in);
		Calender cl = new Calender();
		
		for( ; ; ) {
		System.out.println("월을 입력하세요");
		System.out.println(Prompt);
		int a = sc.nextInt();
		if(a>12 || a<=0) {
			continue;}
		else if(a!=-1) {
		System.out.printf("%d월은 %d일까지 있습니다.%n",a,cl.MaxDaysOfMonth(a));
		}else {
			break;
		}
		}
		
		System.out.println("Bye");
	}

}

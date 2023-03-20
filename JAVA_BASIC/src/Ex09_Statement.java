import java.util.ArrayList;
import java.util.List;

public class Ex09_Statement {
	
	public static void main(String[] args) {
		
		/*
		제어문
		조건문 : if(3가지) , switch(조건) {case 값 .. break}
		반복문 : for(){} , 개선된 for , while(){} , do{} ~ while()
		분기문 : break(블럭탈출) , continue(아래 구문 skip)
		*/
		
		int count = 0;
		if(count < 1) System.out.println("true"); // 단일 if
		
		char data = 'c';
		switch(data) {
			case 'a' : System.out.println("a 다");
				break;
			case 'b' : System.out.println("b 다 ");
				break;
			default : System.out.println("디폴트야");
			
		}
		// for 문
		// 1~ 100 까지 합
		int answer = 0;
		for(int i = 1; i <=100; i++) {
			answer += i;
		}
		System.out.printf("1부터 100까지 누적 합 %d",answer);
		System.err.println();
		// 1부터 5까지의 합
		answer = 5 * (1 + 5) /2;
		System.out.println("answer : " + answer);
		
		//1 ~ 10 까지의 홀수 합
		
		int answer2 = 0;
		for(int i = 1; i <= 10; i+=2) {
			answer2 += i;
		}
		System.out.println("answer2 : " + answer2);
		
		
		
		// for 문에서 if 문 사용해서 1 ~ 1000까지 짝수합 구하기
		int answer3 = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i%2 == 0) {
				answer3 += i;
			}
		}
		System.out.printf("100까지의 합 : %d",answer3);
		
		
		
		
		
		
		
		
	}

}

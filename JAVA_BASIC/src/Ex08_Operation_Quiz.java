import java.util.Scanner;

public class Ex08_Operation_Quiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 입력값 3개 
		String numStr1 = sc.nextLine();
		int num1 = 0;
		while(true) {
			try {
				num1 = Integer.parseInt(numStr1);
			} catch (Exception e) {
				System.out.println("입력오류");
				System.out.println("숫자만 입력해주세요");
				numStr1 = sc.nextLine();
				continue;
			}
			break;
		}
		System.out.println("num1 : " + num1);
		
		String b = sc.nextLine();
		if(b.equals("-")|| b.equals("+") || b.equals("*") || b.equals("/")) {
			
		}else {
			System.out.println("다시입력해주세요");
			b = sc.nextLine();
		}
		
		System.out.println("세번째 입력값 - 숫자");
		String numStr2 = sc.nextLine();
		int num2 = 0;
		while(true) {
			try {
				num2 = Integer.parseInt(numStr2);
			} catch (Exception e) {
				System.out.println("입력오류");
				System.out.println("숫자만 입력해주세요");
				numStr2 = sc.nextLine();
				continue;
			}
			break;
		}
		
		int answer= 0;
		
		if(b.equals("-")) {
			answer = num1 - num2;
		}if(b.equals("*")) {
			answer = num1 * num2;
		}if(b.equals("/")) {
			answer = num1 / num2;
		}if(b.equals("+")) {
			answer = num1 + num2;
		}
		
		System.out.println("연산결과 : " + answer);		

		
		
		
		
	}

}

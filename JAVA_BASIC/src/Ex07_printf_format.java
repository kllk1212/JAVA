import java.util.Scanner;

public class Ex07_printf_format {

		public static void main(String[] args) {
			// System.out.println();
			// C# : Console.WriteLine();
			
			System.out.println("A"); // 출력하고 줄바꿈 (엔터)
			System.out.println();
			System.out.println("B");
			
			int num = 1000;
			System.out.println(num);
			System.out.println("num 값은 " + num + "입니다.");
			
			// 형식 format
			System.out.printf("num 값은 %d 입니다.",num);

			/*
			%d 10진수 형식의 정수
			%f 실수
			%s 문자열
			%c 문자
			\t (tab) , \n (줄바꿈)
			 
			*/
			float f = 3.14f;
			System.out.println(f);
			System.out.printf("f변수값은 %f 입니다 \n",f);
			
			// cmd 모드 (console 창에서) 사용자가 입력한 값을 read....
			// 설계도 == 클래스 == 타입은 사용하고 싶다면 heap에 올린다
			Scanner sc = new Scanner(System.in);
			/*
			//String value = sc.nextLine();
			
			
			int number = Integer.parseInt(sc.nextLine());
			System.out.println(number);
			되도록이면 
			권장사항) nextInt , nextFloat 보다는 모든 데이터를 nextLine()으로 받아라
			
			*/
			
			System.out.print("숫자를 입력하세요");
			String number = sc.nextLine();

			//int number = Integer.parseInt(sc.nextLine());
			//System.out.printf("입력한 숫자는 : %d" + number);
			
		}
}
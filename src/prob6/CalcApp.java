package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			if(expression.equals("quit"))
			{
				break;
			}
			String[] array =expression.split(" ");
			
			String op =array[1]; //연산자를 문자로 변환 scan변수가 받은 0번째 인덱스를 문자로 변환한다.

			int num1=Integer.parseInt(array[0]);
			int num2=Integer.parseInt(array[2]);

			switch (op) {

				case "+" :

					Add add = new Add();

					add.setValue(num1, num2);

					System.out.println(">> "+add.calculate());

					break;

				case "-" :

					Sub sub = new Sub();

					sub.setValue(num1, num2);

					System.out.println(">> "+sub.calculate());

					break;

				case "*" :

					Mul mul = new Mul();

					mul.setValue(num1, num2);

					System.out.println(">> "+mul.calculate());

					break;

				case "/" :

					Div div = new Div();

					div.setValue(num1, num2);

					System.out.println(">> "+div.calculate());

					break;

				default : System.out.println("잘못된 연산자 입니다.");

			}
			
		}
	}
}

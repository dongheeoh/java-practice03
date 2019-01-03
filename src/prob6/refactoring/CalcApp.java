package prob6.refactoring;

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

			
			Arith arith=null;
			switch (op) {

				case "+" :

					arith = new Add();
					break;

				case "-" :

					arith = new Sub();
					break;

				case "*" :

					arith = new Mul();
					break;

				case "/" :

					arith = new Div();
					break;

				default : 
					break;

			}
			if(arith==null)
		{
			System.out.println(">> 알수없는 연산입니다.");
			continue;
		}
			arith.setValue(num1, num2);
			int result = arith.calculate();
			System.out.println(">> "+result);
		}
		
		scanner.close();
	}
}

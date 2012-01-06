import java.util.Scanner;

public class IntNumberMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntNumber num1 = new IntNumber(sc.nextInt());
		IntNumber num2 = new IntNumber(sc.nextInt());
		if (!num2.isZero())
			System.out.println(num1.div(num2));
		else
			System.out.println("Division durch 0");
	}
}

package lambdas;

public class Runner {

	public static void main(String[] args) {
		calc add = (a, b) -> a + b;
		calc minus = (a, b) -> a - b;
		calc multiply = (a, b) -> a * b;
		calc divide = (a, b) -> a / b;

		double result = divide.calculate(10, 4);
		System.out.println(result);

	}

}

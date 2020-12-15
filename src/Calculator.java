public class Calculator {
	public static void main(String[] args) {
		System.out.println("Введите операцию в формате a + b, a - b, a * b, a / b\nДопускается ввод арабских и римских чисел от 1 до 10 включительно:");
		Calculating c = new Calculating();
		c.calculate();
	}
}

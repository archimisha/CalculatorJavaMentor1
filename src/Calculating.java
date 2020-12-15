import java.io.*;

public class Calculating {
	private String ans;
	private int a, b, answer=0;
	private String[] str;
	private BufferedReader br;
	private RomanNum rn1, rn2;
	private Calculating calc;

	public void calculate() {
		try {
			do {
				br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine().split(" ");

				try {
					rn1 = RomanNum.valueOf(str[0]);
					rn2 = RomanNum.valueOf(str[2]);
					a = rn1.getValue();
					b = rn2.getValue();

					calc = new Calculating();
					answer = calc.getAnswer(a, b, str[1]);
					if (answer != -1) {
						ans = RomanNum.getNameByValue(answer);
						System.out.println(ans);
					}
				}catch (IllegalArgumentException e) {
					a = Integer.parseInt(str[0]);
					b = Integer.parseInt(str[2]);
					calc = new Calculating();
					answer = calc.getAnswer(a, b, str[1]);
					if (answer != -1) System.out.println(answer);
					else answer = -1;
				}

			} while (answer != -1);
			throw new NumberFormatException();

		}catch (NumberFormatException exc) {
			System.out.println("Вы ввели запрос не соответствующий указаниям");
		}
		catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода " + exc);
		}
	}

	public int getAnswer(int val1, int val2, String oper) {
		int answ = -1;
		if (((val1 > 0) & (val1 < 11)) & ((val2 > 0) & (val2 < 11))) {
			switch (oper) {
				case "+":
					answ = val1 + val2;
					break;
				case "-":
					answ = val1 - val2;
					break;
				case "*":
					answ = val1 * val2;
					break;
				case "/":
					answ = val1 / val2;
					break;
				default:
					System.out.println("Несоответствующая операция");
			}
			return answ;
		}
		return answ;
	}
}
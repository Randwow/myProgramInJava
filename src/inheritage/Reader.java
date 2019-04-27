package inheritage;
import java.util.Scanner;

public class Reader {
	int a,b,c,d,e,f;
		public void Scaner() {
			System.out.print("Введите первое число: ");
			Scanner scn = new Scanner(System.in); // Инициализация сканера 
				a = scn.nextInt(); // Считываиние первой перменной 
			System.out.print("Введите второе  число: ");
				b = scn.nextInt(); // Считываиние второй перменной 
			System.out.print("Введите первое число для сравнения: "); 
				c = scn.nextInt(); // Считываиние первой перменной 
			System.out.print("Введите второе  число для сравнения: ");
				d = scn.nextInt(); // Считываиние второй перменной 
				System.out.print("Введите первое число для сравнения: "); 
				e = scn.nextInt(); // Считываиние первой перменной 
			System.out.print("Введите второе  число для сравнения: ");
				f = scn.nextInt(); // Считываиние второй перменной 
		}
}
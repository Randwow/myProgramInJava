package inheritage;

public class Company {  // Супер класс из которого идёт наследование 
	public void main(String args[]) {	
	}
	public int summa(int a, int b) {
		int summa;
		summa = a + b;
		System.out.println("Сумма ваших чисел:= " + summa);
		return summa;
	}	
	
		public int Compare(int x, int y) {
			int z;
			z = (x > y) ? x : y ;
			System.out.println("Ваше большее число первого сравнения:= " + z);
			return z; 
		}
		public int Compare1(int c, int d) {
			int e;
			e = (c > d) ? c : d ;
			System.out.println("Ваше большее число второго сравнения:= " + e);
			return e; 
		}
}
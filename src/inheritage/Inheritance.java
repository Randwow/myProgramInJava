package inheritage;

public class Inheritance {
	public static void main (String args[]) {
		Reader r = new Reader (); // Инициализация объекта 
		r.Scaner();
		first f = new first();  //Наследование информации с первого класса (Создание ссылки на объект first) и тд. 
		second s = new second(); //Наследование информации с первого класса 
		third t = new third(); //Наследование информации с первого класса 
		f.summa(r.a, r.b);  // Вызов класса 
		s.Compare(r.c, r.d);
		t.Compare(r.e, r.f);		
	}
}

package inheritage;
import javax.swing.JOptionPane;

public class Reader {
	int a,b,c,d,e,f;
	String n1, n2, n3, n4, n5, n6; 
		public void Scaner() {
			n1 = JOptionPane.showInputDialog("Введите первое число : "); 
			n2 = JOptionPane.showInputDialog("Введите второе число : "); 
			n3 = JOptionPane.showInputDialog("Введите первое число для сравнения : ");
			n4 = JOptionPane.showInputDialog("Введите второе число для сравнения : ");
			n5 = JOptionPane.showInputDialog("Введите первое число для второго сравнения : ");
			n6 = JOptionPane.showInputDialog("Введите второе число для второго сравнения : ");
			a = Integer.parseInt(n1);
			b = Integer.parseInt(n2);
			c = Integer.parseInt(n3);
			d = Integer.parseInt(n4);
			e = Integer.parseInt(n5);
			f = Integer.parseInt(n6);
		}
		public void Scaner(int summa, int z, int e) {
			JOptionPane.showMessageDialog(null, "Сумма ваших чисел: = " + summa);
			JOptionPane.showMessageDialog(null, "Ваше большее первое число: = " + z);
			JOptionPane.showMessageDialog(null, "Ваше большее второе число: = " + e);
		}
}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.sun.jdi.IntegerValue;

public class jtable {
	public static void main(String[] args) {
		JFrame frame= new JFrame("�lk uygulama");
		String [][] veriler = {{"Samet","Fizik","90"},{"Ahmet","Matematik","96"},{"Mehmet","T�rk�e","100"}};
			String [] basliklar = {"�sim","Ders","Not"};
				
			JTable t = new JTable(veriler,basliklar);
			t.setBounds(0, 0, 250, 250);
			JScrollPane cp = new JScrollPane(t); //sa�daki a��a�� yukar� kayd�rma i�lemi bu,kesinlikle olmal�d�r.Ve bunu ekleyince a�a��da frame ye table � de�il scrollpaneyi ekliyoruz..
				
			frame.add(cp);
			frame.setVisible(true);
			frame.setSize(300, 260);

		
	}
}

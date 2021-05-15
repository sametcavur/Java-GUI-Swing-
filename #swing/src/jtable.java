import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.sun.jdi.IntegerValue;

public class jtable {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Ýlk uygulama");
		String [][] veriler = {{"Samet","Fizik","90"},{"Ahmet","Matematik","96"},{"Mehmet","Türkçe","100"}};
			String [] basliklar = {"Ýsim","Ders","Not"};
				
			JTable t = new JTable(veriler,basliklar);
			t.setBounds(0, 0, 250, 250);
			JScrollPane cp = new JScrollPane(t); //saðdaki aþþaðý yukarý kaydýrma iþlemi bu,kesinlikle olmalýdýr.Ve bunu ekleyince aþaðýda frame ye table ý deðil scrollpaneyi ekliyoruz..
				
			frame.add(cp);
			frame.setVisible(true);
			frame.setSize(300, 260);

		
	}
}

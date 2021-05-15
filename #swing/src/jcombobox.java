import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jcombobox {
public static void main(String[] args) {
	JFrame frame= new JFrame("Ýlk uygulama");

	String []sehirler = {"Antalya","Ýstanbul","Ýzmir","Urfa"};

	JComboBox cb = new JComboBox(sehirler);
	cb.setBounds(20, 20, 200, 20);
					
	JLabel l = new JLabel();
	l.setBounds(20, 80, 100, 20);

	JButton b = new JButton("Týkla");
	b.setBounds(20, 50, 100, 20);
	b.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		l.setText(String.valueOf(cb.getSelectedItem()));	}	});
			
	frame.add(l);
	frame.add(b);
	frame.add(cb);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setSize(300, 260);


}
}

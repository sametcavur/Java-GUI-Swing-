import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jtextfield {
public static void main(String[] args) {
	JFrame frame= new JFrame("Ýlk uygulama");
	
	JTextField tf = new JTextField();
	tf.setBounds(20,20,140,20);
		
	JPasswordField pf = new JPasswordField();
	pf.setBounds(20,60,140,20);
		
	JButton b = new JButton("Týkla");
	b.setBounds(20, 100, 135, 50);
	b.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	if(tf.getText().equals("sametcavur") && pf.getText().equals("123456")) {
		System.out.println("Baþarýlý bir þekilde giriþ yapýldý");  	}
	
else {		
System.out.println("Giriþ Yapýlamadý..!"); 		}}
		});
		frame.add(pf);
		frame.add(b);
		frame.add(tf);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(200, 220);

}

}

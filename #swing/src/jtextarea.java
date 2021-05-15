import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jtextarea {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Ýlk uygulama");
			
		JTextArea ta = new JTextArea();
		ta.setBounds(20, 100, 300, 330);
			
		JLabel label1 = new JLabel();
		label1.setBounds(200, 25 , 190, 30);
			
		JLabel label2 = new JLabel();
		label2.setBounds(200, 50, 190, 30);
			
		JButton buton = new JButton("Týkla");
		buton.setBounds(30, 30, 100, 50);
		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		String text = ta.getText();
		String []words = text.split("\\s");
		label1.setText("Kelime Sayýsý= " + words.length);
		label2.setText("Harf Sayýsý= " + text.length());}
			});
		frame.setVisible(true);
		frame.add(buton);
		frame.add(ta);
		frame.add(label1);
		frame.add(label2);
		frame.setSize(400, 550);
		frame.setLayout(null);


}}

import java.awt.FlowLayout;

import javax.swing.*;

public class jflowLayout {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Ýlk Uygulama");
		JButton b1 = new JButton("buton1");
		JButton b2 = new JButton("buton2");
		JButton b3 = new JButton("buton3");
		JButton b4 = new JButton("buton4");
		JButton b5 = new JButton("buton5");
			
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
			
		frame.add(panel);
		frame.setSize(500,150);
		frame.setVisible(true);	




	}

}

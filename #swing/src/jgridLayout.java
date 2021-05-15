import java.awt.GridLayout;

import javax.swing.*;

public class jgridLayout {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Ýlk Uygulama");
		JButton b1 = new JButton("buton1");
		JButton b2 = new JButton("buton2");
		JButton b3 = new JButton("buton3");
		JButton b4 = new JButton("buton4");
			
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
			
		frame.add(panel);
		frame.setSize(400,400);
		frame.setVisible(true);	

	}

}

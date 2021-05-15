import java.awt.BorderLayout;

import javax.swing.*;

public class jborderLayout {
public static void main(String[] args) {
	JFrame frame= new JFrame("Ýlk Uygulama");
	JButton b1 = new JButton("buton1");
	JButton b2 = new JButton("buton2");
	JButton b3 = new JButton("buton3");
	JButton b4 = new JButton("buton4");
	JButton b5 = new JButton("buton5");
		
	JPanel panel = new JPanel();
	panel.setLayout(new BorderLayout());
	panel.add(b1,BorderLayout.NORTH);
	panel.add(b2,BorderLayout.SOUTH);
	panel.add(b3,BorderLayout.EAST);
	panel.add(b4,BorderLayout.WEST);
	panel.add(b5,BorderLayout.CENTER);
		
	frame.add(panel);
	frame.setSize(400,400);
	frame.setVisible(true);	

}
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jbutton {
	public static void main(String[] args) {
		JFrame frame = new JFrame("�lk Uygulamam�z");
		JButton buton = new JButton("T�klamal�");
		buton.setBounds(90,90,100,50);
		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Butona T�kland�");	
			}
		});
		//KAPANI�//
		frame.add(buton);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(300,320);        }


}

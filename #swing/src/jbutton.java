import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jbutton {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ýlk Uygulamamýz");
		JButton buton = new JButton("Týklamalý");
		buton.setBounds(90,90,100,50);
		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Butona Týklandý");	
			}
		});
		//KAPANIÞ//
		frame.add(buton);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(300,320);        }


}

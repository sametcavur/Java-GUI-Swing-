import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jlabel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("�lk Uygulamam�z");
		JLabel label = new JLabel();
		label.setBounds(30, 2, 140, 40);
		
		JButton buton = new JButton("T�klamal�");
		buton.setBounds(40,40,100,50);
		
		buton.addActionListener(new ActionListener() {
			int a = 1;
			public void actionPerformed(ActionEvent e) //Butona t�kland��� zaman olucaklar
			{
				label.setText("Butona " + a++ + " kez t�kland�!!");
			}
		});
		//KAPANI�//
		frame.add(label);
		frame.add(buton);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(200,160);


	}
	

}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jcheckbox {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Ýlk uygulama");
		JCheckBox cb = new JCheckBox("Evet");
		cb.setBounds(20, 20, 100,40);
		JCheckBox cb1 = new JCheckBox("Hayýr");
		cb1.setBounds(20, 50, 100, 40);
		JButton b = new JButton("Týkla");
		b.setBounds(20, 100, 100, 40);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cb.isSelected()) {
					System.out.println(cb.getText() + " seçildi");
				}
				if(cb1.isSelected()) {
					System.out.println(cb1.getText() + " seçildi");
				}	}
		});
		frame.add(b);
		frame.add(cb);
		frame.add(cb1);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(200, 220);

	}

}

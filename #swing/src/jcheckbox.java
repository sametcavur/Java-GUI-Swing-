import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jcheckbox {
	public static void main(String[] args) {
		JFrame frame= new JFrame("�lk uygulama");
		JCheckBox cb = new JCheckBox("Evet");
		cb.setBounds(20, 20, 100,40);
		JCheckBox cb1 = new JCheckBox("Hay�r");
		cb1.setBounds(20, 50, 100, 40);
		JButton b = new JButton("T�kla");
		b.setBounds(20, 100, 100, 40);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cb.isSelected()) {
					System.out.println(cb.getText() + " se�ildi");
				}
				if(cb1.isSelected()) {
					System.out.println(cb1.getText() + " se�ildi");
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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jlist {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Ýlk uygulama");
		
		JLabel label= new JLabel("Dil");
		label.setBounds(10, 10, 170, 20);
		
		DefaultListModel<String> listemiz = new DefaultListModel<>();
		listemiz.addElement("Java");
		listemiz.addElement("C#");
		listemiz.addElement("PHP");
		JList<String> list = new JList<String>(listemiz);
		list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
		list.setBounds(10,50,70,70);
		
		DefaultListModel<String> listemiz1 = new DefaultListModel<>();
		listemiz1.addElement("Spring");
		listemiz1.addElement("Swing");
		listemiz1.addElement("React");
		JList<String> list1 = new JList<String>(listemiz1);
		list1.setBounds(140,50,70,70);
		
		JButton buton = new JButton("Týkla");
		buton.setBounds(10, 150, 100, 30);
		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String veri =list.getSelectedValue();
				String veri1 = list1.getSelectedValue();
				label.setText("Dil=" +veri + ", Framework=" +veri1);
				
			}
		});
		frame.add(list1);
		frame.add(list);
		frame.add(buton);
		frame.add(label);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(300, 260);
	}
}

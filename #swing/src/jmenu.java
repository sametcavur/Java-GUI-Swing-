import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jmenu {
public static void main(String[] args) {
	JFrame frame= new JFrame("Ýlk Uygulama");
	
	JMenuBar menubar = new JMenuBar();
		
	JMenu menu = new JMenu("Ana Menü");
	JMenu bebemenu = new JMenu("Bebe Menü");
	JMenu babamenu = new JMenu("Baba Menü");
	JMenu submenu = new JMenu("Dosya"); //submenü alt menü demek
		
	JMenuItem m1 = new JMenuItem("Yeni");
	JMenuItem m2 = new JMenuItem("Aç");
		
	JMenuItem s1 = new JMenuItem("Kaydet");
	JMenuItem s2 = new JMenuItem("Sil");
	s2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(frame,"Silindi");	}
		});
	s1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(frame,"Kaydedildi");		}
		});
		submenu.add(s1);
		submenu.add(s2);
		
		menu.add(m1);
		menu.add(m2);
		menu.add(submenu);
		
		menubar.add(menu);
		menubar.add(bebemenu);
		menubar.add(babamenu);

		frame.setJMenuBar(menubar);
		frame.setVisible(true);
		frame.setSize(300, 260);


}
}

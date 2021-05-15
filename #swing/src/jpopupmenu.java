import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class jpopupmenu {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Ýlk Uygulama");
		
		JPopupMenu pm = new JPopupMenu();
		
		JMenuItem m1 = new JMenuItem("Kes");
		JMenuItem m2 = new JMenuItem("Kopyala");
		JMenuItem m3 = new JMenuItem("Yapýþtýr");
		
		pm.add(m1);
		pm.add(m2);
		pm.add(m3);
		frame.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			pm.show(frame,e.getX(),e.getX());
		}
		});

		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Kopyalandý");
			}
		});
		
		frame.setVisible(true);
		frame.setSize(300, 260);

	}
}

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;

public class jscrollBar {
	public static void main(String[] args) {
		JFrame frame= new JFrame("�lk uygulama");
		JLabel label= new JLabel("herhangi bi�ey");
		label.setBounds(30, 20, 100, 20);
		JScrollBar sb = new JScrollBar(JScrollBar.VERTICAL);//BURAYA HOR�ZONTAL YAZARSAK SCROLL BAR YUKARI A�A�I DE��L SA�A SOLA OYNAR
		sb.setBounds(30, 60, 15, 120);
		sb.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent a) {
			label.setText(" " +sb.getValue());
			}
		});
		frame.setLayout(null);
		frame.add(sb);
		frame.add(label);
		frame.setVisible(true);
		frame.setSize(300, 260);

	}

}

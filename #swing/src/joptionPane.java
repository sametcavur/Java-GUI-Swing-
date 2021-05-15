import javax.swing.*;

public class joptionPane {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Ýlk uygulama");
		
		JOptionPane.showMessageDialog(frame,"Merhaba Samet");
		JOptionPane.showMessageDialog(frame,"Dikkat!","FormunÜstündekiYazý", JOptionPane.WARNING_MESSAGE);
		String isim = JOptionPane.showInputDialog("Adýnýz");
		JLabel label = new JLabel("Hoþgeldiniz "+isim +" Bey");
		label.setBounds(10, 10, 400, 10);
			frame.setLayout(null);
			frame.add(label);
			frame.setVisible(true);
			frame.setSize(300, 260);


	}

}

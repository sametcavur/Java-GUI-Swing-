import javax.swing.*;

public class joptionPane {
	public static void main(String[] args) {
		JFrame frame= new JFrame("�lk uygulama");
		
		JOptionPane.showMessageDialog(frame,"Merhaba Samet");
		JOptionPane.showMessageDialog(frame,"Dikkat!","Formun�st�ndekiYaz�", JOptionPane.WARNING_MESSAGE);
		String isim = JOptionPane.showInputDialog("Ad�n�z");
		JLabel label = new JLabel("Ho�geldiniz "+isim +" Bey");
		label.setBounds(10, 10, 400, 10);
			frame.setLayout(null);
			frame.add(label);
			frame.setVisible(true);
			frame.setSize(300, 260);


	}

}

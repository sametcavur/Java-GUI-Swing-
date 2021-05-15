import javax.swing.*;

public class jtabbedPane {
public static void main(String[] args) {
	JFrame frame= new JFrame("Ýlk Uygulama");
	
	JLabel l1 = new JLabel("Ýlk Alan");
	JPanel panel1 = new JPanel();
	panel1.add(l1);
		
	JLabel l2 = new JLabel("Ýkinci Alan");
	JPanel panel2 = new JPanel();
	panel2.add(l2);
		
	JLabel l3 = new JLabel("Üçüncü Alan");
	JPanel panel3 = new JPanel();
	panel3.add(l3);
		
	JTabbedPane tp = new JTabbedPane();
	tp.setBounds(20, 20, 250, 150);
	tp.add("ÝLK" , panel1);
	tp.add("ÝKÝNCÝ" , panel2); 
	tp.add("ÜÇÜNCÜ" , panel3);
		
	frame.add(tp);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setSize(330, 320);
		

}
}

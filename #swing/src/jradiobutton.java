import javax.swing.*;

public class jradiobutton {
	public static void main(String[] args) {
		JFrame frame= new JFrame("�lk uygulama");
		JRadioButton rb = new JRadioButton("Erkek",true);//Burdaki true program a��l�nca ilk ba�ta erkek se�ili olsun demek
		rb.setBounds(10,10,120,20);
		JRadioButton rb1 = new JRadioButton();
		rb1.setText("Kad�n");
		rb1.setBounds(10,30,120,20);
		JRadioButton rb2 = new JRadioButton("Belirtmek �stemiyorum");
		rb2.setBounds(10,50,220,20);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb);
		bg.add(rb1);
		bg.add(rb2); // Bu yaln�zca birini se�ebilme hakk� veriyor,e�er yazmasayd�k kullan�c� hem erkek,hem kad�n,hem de belirtmek istemiyorum se�ebilirdi ama art�k sadece birini se�ebilir.
			
		frame.add(rb);
		frame.add(rb1);
		frame.add(rb2);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(300, 160);


	}

}

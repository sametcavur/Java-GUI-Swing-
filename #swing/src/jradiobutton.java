import javax.swing.*;

public class jradiobutton {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Ýlk uygulama");
		JRadioButton rb = new JRadioButton("Erkek",true);//Burdaki true program açýlýnca ilk baþta erkek seçili olsun demek
		rb.setBounds(10,10,120,20);
		JRadioButton rb1 = new JRadioButton();
		rb1.setText("Kadýn");
		rb1.setBounds(10,30,120,20);
		JRadioButton rb2 = new JRadioButton("Belirtmek Ýstemiyorum");
		rb2.setBounds(10,50,220,20);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb);
		bg.add(rb1);
		bg.add(rb2); // Bu yalnýzca birini seçebilme hakký veriyor,eðer yazmasaydýk kullanýcý hem erkek,hem kadýn,hem de belirtmek istemiyorum seçebilirdi ama artýk sadece birini seçebilir.
			
		frame.add(rb);
		frame.add(rb1);
		frame.add(rb2);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(300, 160);


	}

}

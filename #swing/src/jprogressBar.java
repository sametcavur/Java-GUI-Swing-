import javax.swing.*;

public class jprogressBar {
public static void main(String[] args) {
	JFrame frame= new JFrame("Ýlk Uygulama");
	JProgressBar pb = new JProgressBar(0,1000);
	pb.setBounds(30, 30, 250, 20);
	pb.setValue(0);
	pb.setStringPainted(true);
	
	
	frame.setLayout(null);
	frame.add(pb);
	frame.setVisible(true);
	frame.setSize(330, 120);
	
	int i = 0;
	while (i<1000) {
		pb.setValue(i);
		i=i+1;
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
}

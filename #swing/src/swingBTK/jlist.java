package swingBTK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
public class jlist extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jlist frame = new jlist();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	public jlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(307, 15, 117, 117);
		contentPane.add(list);
		DefaultListModel model = new DefaultListModel<>();
		list.setModel(model);
		
		JLabel lbOgrAd = new JLabel("\u00D6\u011Frenci Ad\u0131=");
		lbOgrAd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbOgrAd.setBounds(28, 11, 73, 28);
		contentPane.add(lbOgrAd);
		
		JLabel lbOgrSoyad = new JLabel("\u00D6\u011Frenci Soyad\u0131=");
		lbOgrSoyad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbOgrSoyad.setBounds(10, 51, 93, 28);
		contentPane.add(lbOgrSoyad);
		
		textField = new JTextField();
		textField.setBounds(108, 15, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 55, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton buttonEkle = new JButton("EKLE");
		buttonEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(textField.getText()+" "+textField_1.getText());
				JOptionPane.showMessageDialog(contentPane,textField.getText() + " " +textField_1.getText() +" Eklendi!");
			}
		});
		buttonEkle.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonEkle.setBounds(204, 14, 93, 52);
		contentPane.add(buttonEkle);
		
		JButton buttonSil = new JButton("S\u0130L");
		buttonSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeElement(textField.getText()+" "+textField_1.getText());
				JOptionPane.showMessageDialog(contentPane,textField.getText() +" " +textField_1.getText() +" Silindi");
			}
		});
		buttonSil.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonSil.setBounds(204, 80, 93, 52);
		contentPane.add(buttonSil);
		
		JButton btnNewButton = new JButton("Se\u00E7ili \u0130temi Sil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedIndex()!=-1) {
				model.removeElementAt(list.getSelectedIndex());
				JOptionPane.showMessageDialog(contentPane,textField.getText() +" " +textField_1.getText() +" Silindi");
			}}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(77, 90, 117, 42);
		contentPane.add(btnNewButton);
	}
}

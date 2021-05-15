package swingWB;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private double answer,number;
	int operation;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void text(String x) {
		textField.setText(textField.getText() + x);
	}
	
	public void calculate() {
		switch (operation) {
		case 1 : 
			answer = number + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer)); 
			break;
		case 2 : 
			answer = number - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer)); 
			break;
		case 3 : 
			answer = number * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer)); 
			break;
		case 4 : 
			answer = number / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer)); 
			break;
		
	}}
	
	
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setBounds(100, 100, 282, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 244, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setBounds(0, 17, 244, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(0, 0, 244, 21);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 77, 244, 177);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4, 10, 10));
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			text(e.getActionCommand());			
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			text(e.getActionCommand());			
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			text(e.getActionCommand());			
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(b3);
		
		JButton bTopla = new JButton("+");
		bTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operation=1;
				textField.setText(" ");
				label.setText(number + e.getActionCommand());
			}
		});
		bTopla.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(bTopla);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			text(e.getActionCommand());			
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			text(e.getActionCommand());			
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			text(e.getActionCommand());			
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(b6);
		
		JButton bCikar = new JButton("-");
		bCikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operation=2;
				textField.setText(" ");
				label.setText(number + e.getActionCommand());
			}
		});
		bCikar.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.add(bCikar);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			text(e.getActionCommand());			
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			text(e.getActionCommand());			
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			text(e.getActionCommand());			
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(b9);
		
		JButton bCarp = new JButton("*");
		bCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operation=3;
				textField.setText(" ");
				label.setText(number + e.getActionCommand());
			}
		});
		bCarp.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(bCarp);
		
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			text(e.getActionCommand());			
			}
		});
		b0.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(b0);
		
		JButton bSonuc = new JButton("=");
		bSonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				label.setText(" ");
			}
		});
		bSonuc.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel_1.add(bSonuc);
		
		JButton bC = new JButton("C");
		bC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
			}
		});
		bC.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(bC);
		
		JButton bBol = new JButton("/");
		bBol.setFont(new Font("Tahoma", Font.BOLD, 15));
		bBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textField.getText());
				operation=4;
				textField.setText(" ");
				label.setText(number + e.getActionCommand());
			}
		});
		panel_1.add(bBol);
	}
}

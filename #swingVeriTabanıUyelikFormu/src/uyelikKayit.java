import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;
import com.mysql.jdbc.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class uyelikKayit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uyelikKayit frame = new uyelikKayit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Insert() throws SQLException{
		Connection connection = null; 
		dbHelper dbHelper = new dbHelper();
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dbHelper.getConnection();
			String ekle = "insert into kullanicilar.bilgiler (adSoyad,email,kullaniciAdi,sifre) values(?,?,?,?)";
			preparedStatement = connection.prepareStatement(ekle);
			preparedStatement.setString(1,textField.getText());
			preparedStatement.setString(2,textField1.getText());
			preparedStatement.setString(3,textField2.getText());
			preparedStatement.setString(4,textField3.getText());
			preparedStatement.execute();
			
			JOptionPane showMessage = new JOptionPane();
			showMessage.showMessageDialog(null,"KAYIT BAÞARILI");
			
		} catch (SQLException e) {
			dbHelper.showErrorMessages(e);
		}
		finally {
			connection.close();
			preparedStatement.close();
		}
		
	}
	
	
	
	public uyelikKayit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00DCYE KAYIT FORMU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(108, 11, 255, 61);
		contentPane.add(lblNewLabel);
		
		JLabel labal = new JLabel("\u0130sim Soyisim :");
		labal.setFont(new Font("Tahoma", Font.BOLD, 11));
		labal.setBounds(10, 87, 98, 14);
		contentPane.add(labal);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 118, 73, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("E-mail :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 149, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u015Eifre :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 180, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(128, 83, 119, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		textField1.setBounds(128, 115, 119, 20);
		contentPane.add(textField1);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(128, 146, 119, 20);
		contentPane.add(textField2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(128, 177, 119, 20);
		contentPane.add(textField3);
		
		JButton buton = new JButton("KAYIT OL");
		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Insert();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		buton.setFont(new Font("Tahoma", Font.BOLD, 13));
		buton.setBounds(275, 114, 125, 49);
		contentPane.add(buton);
	}
}

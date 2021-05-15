import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;

public class s extends JFrame {
	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					s frame = new s();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	DefaultTableModel model;
	
	public s() {
	
		try {
			ArrayList<city> cities = getCities();
			for (city city : cities) {
				Object[] row = {city.getID(),
						city.getName(),
						city.getCountryCode(),
						city.getDistrict(),
						city.getPopulation()};
				model.addRow(row);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Name", "CountryCode", "District", "Population"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		}); 
		table.setBounds(10, 11, 414, 239);
		contentPane.add(table);
		
		model =(DefaultTableModel) table.getModel();
	}
	public ArrayList<city> getCities()throws SQLException{
		Connection connection = null;
		dbHelper dbHelper = new dbHelper();
		Statement statement = null;
		ResultSet resultSet;
		ArrayList<city> cities = null;
		try {
		connection = dbHelper.getConnection();
		statement = connection.createStatement();
		resultSet = statement.executeQuery("SELECT * FROM city");
		cities = new ArrayList<city>();
		while(resultSet.next()) {
			cities.add(new city(resultSet.getInt("ID"),
					resultSet.getString("Name"),
					resultSet.getString("CountryName"),
					resultSet.getString("District"),
					resultSet.getInt("Population")
					));
		}
		} catch (SQLException e) {
			dbHelper.showErrorMessages(e);
		}
		finally {
			statement.close();
			connection.close();
		}
		return cities;
		 
	}
}

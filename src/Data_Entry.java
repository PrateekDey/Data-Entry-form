import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class Data_Entry extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField usn;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JComboBox dept;
	private JRadioButton male;
	private JRadioButton female;
	private JRadioButton others;
	private JComboBox yearofpass;
	private JTable DetailTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data_Entry frame = new Data_Entry();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Data_Entry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel header1 = new JLabel("Simple Data Entry Application");
		header1.setFont(new Font("Georgia", Font.BOLD, 25));
		header1.setHorizontalAlignment(SwingConstants.CENTER);
		header1.setBounds(100, 10, 859, 34);
		panel.add(header1);
		
		JLabel description = new JLabel("This Applet is made for the demonstartion of JCombo and JTable features");
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setFont(new Font("Georgia", Font.ITALIC, 15));
		description.setBounds(100, 37, 859, 26);
		panel.add(description);
		
		JLabel lbfname = new JLabel("First Name :");
		lbfname.setFont(new Font("Georgia", Font.PLAIN, 20));
		lbfname.setBounds(30, 85, 120, 26);
		panel.add(lbfname);
		
		JLabel lblname = new JLabel("Last Name :");
		lblname.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblname.setBounds(510, 85, 120, 26);
		panel.add(lblname);
		
		JLabel lbdob = new JLabel("Date of Birth :");
		lbdob.setFont(new Font("Georgia", Font.PLAIN, 20));
		lbdob.setBounds(30, 140, 139, 26);
		panel.add(lbdob);
		
		JLabel lbgender = new JLabel("Gender :");
		lbgender.setFont(new Font("Georgia", Font.PLAIN, 20));
		lbgender.setBounds(30, 195, 120, 26);
		panel.add(lbgender);
		
		JLabel lbusn = new JLabel("USN :");
		lbusn.setFont(new Font("Georgia", Font.PLAIN, 20));
		lbusn.setBounds(520, 250, 63, 26);
		panel.add(lbusn);
		
		JLabel lbdept = new JLabel("Department :");
		lbdept.setFont(new Font("Georgia", Font.PLAIN, 20));
		lbdept.setBounds(30, 250, 120, 26);
		panel.add(lbdept);
		
		JLabel lbyearofpass = new JLabel("Year of Passing :");
		lbyearofpass.setFont(new Font("Georgia", Font.PLAIN, 20));
		lbyearofpass.setBounds(30, 310, 154, 26);
		panel.add(lbyearofpass);
		
		fname = new JTextField();
		fname.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		fname.setBounds(190, 85, 290, 25);
		panel.add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lname.setColumns(10);
		lname.setBounds(630, 85, 290, 26);
		panel.add(lname);
		
		usn = new JTextField();
		usn.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		usn.setColumns(10);
		usn.setBounds(630, 250, 290, 25);
		panel.add(usn);
		
		date = new JComboBox();
		date.setModel(new DefaultComboBoxModel(new String[] {"DATE", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		date.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		date.setBounds(190, 140, 120, 25);
		panel.add(date);
		
		month = new JComboBox();
		month.setModel(new DefaultComboBoxModel(new String[] {"MONTH", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		month.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		month.setBounds(320, 140, 120, 25);
		panel.add(month);
		
		year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new String[] {"YEAR", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"}));
		year.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		year.setBounds(450, 140, 120, 25);
		panel.add(year);
		
		dept = new JComboBox();
		dept.setModel(new DefaultComboBoxModel(new String[] {"CHOOSE THE DEPARTMENT", "COMPUTER SCIENCE ENGINEERING", "INFORMATION SCIENCE ENGINEERING", "TELECOMMUNICATION ENGINEERING", "ELECTRONIC AND COMMUNICATION ENGINEERING", "ELECTRONIC AND ELECTRICAL ENGINEERING", "MECHANICAL ENGINEERING", "CIVIL ENGINEERING", "BASIC SCIENCE", "MASTER'S BLOCK", "ARCHITECTURE ENGINEERING"}));
		dept.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		dept.setBounds(190, 250, 290, 25);
		panel.add(dept);
		
		yearofpass = new JComboBox();
		yearofpass.setModel(new DefaultComboBoxModel(new String[] {"PASSED", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		yearofpass.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		yearofpass.setBounds(190, 310, 120, 25);
		panel.add(yearofpass);
		
		male = new JRadioButton("Male");
		male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(male.isSelected()) {
					female.setSelected(false);
					others.setSelected(false);
				}
			}
		});
		male.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		male.setBounds(190, 195, 100, 25);
		panel.add(male);
		
		female = new JRadioButton("Female");
		female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(female.isSelected()) {
					male.setSelected(false);
					others.setSelected(false);
				}
			}
		});
		female.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		female.setBounds(289, 195, 100, 25);
		panel.add(female);
		
		others = new JRadioButton("Others");
		others.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(others.isSelected()) {
					male.setSelected(false);
					female.setSelected(false);
				}
			}
		});
		others.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		others.setBounds(397, 195, 100, 25);
		panel.add(others);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fname.setText("");
				lname.setText("");
				date.setSelectedIndex(0);
				month.setSelectedIndex(0);
				year.setSelectedIndex(0);
				male.setSelected(false);
				female.setSelected(false);
				others.setSelected(false);
				dept.setSelectedIndex(0);
				usn.setText("");
				yearofpass.setSelectedIndex(0);
			}
		});
		reset.setFont(new Font("Georgia", Font.BOLD, 15));
		reset.setBounds(100, 370, 140, 25);
		panel.add(reset);
		
		JButton DeleteRow = new JButton("Delete Row");
		DeleteRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//try and catch with the row is selected or not
				DefaultTableModel model = (DefaultTableModel) DetailTable.getModel();
				try {
					int rowid = DetailTable.getSelectedRow();
					model.removeRow(rowid);
				}catch(Exception ae) {
					JOptionPane.showMessageDialog(null, "First Select A Row");
				}
			}
		});
		DeleteRow.setFont(new Font("Georgia", Font.BOLD, 15));
		DeleteRow.setBounds(300, 370, 140, 25);
		panel.add(DeleteRow);
		
		JButton edit = new JButton("Edit Value");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) DetailTable.getModel();
				int rowid = DetailTable.getSelectedRow();
				int colid = DetailTable.getSelectedColumn();
				
				String val = model.getValueAt(rowid, colid).toString();
				String newval = JOptionPane.showInputDialog(null, "Enter the Change", val).toUpperCase();
				
				model.setValueAt(newval, rowid, colid);
			}
		});
		edit.setFont(new Font("Georgia", Font.BOLD, 15));
		edit.setBounds(500, 370, 140, 25);
		panel.add(edit);
		
		JButton Add = new JButton("Add");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Add things perspective to the table
				String fullname = fname.getText().toUpperCase()+ " " +lname.getText().toUpperCase();
				String dob = date.getSelectedItem().toString() + "/" + month.getSelectedItem().toString() + "/" + year.getSelectedItem().toString();
				String depart = dept.getSelectedItem().toString();
				String usnno = usn.getText().toUpperCase();
				String yearofp = yearofpass.getSelectedItem().toString();
				String gender = "";
				if(male.isSelected()) 
					gender="MALE";
				if(female.isSelected()) 
					gender="FEMALE";
				if(others.isSelected()) 
					gender="OTHERS";
				
				DefaultTableModel model=(DefaultTableModel) DetailTable.getModel();
				model.addRow(new Object[] {fullname, usnno, dob, gender, depart, yearofp});
				
				//Reset all the things
				fname.setText("");
				lname.setText("");
				date.setSelectedIndex(0);
				month.setSelectedIndex(0);
				year.setSelectedIndex(0);
				male.setSelected(false);
				female.setSelected(false);
				others.setSelected(false);
				dept.setSelectedIndex(0);
				usn.setText("");
				yearofpass.setSelectedIndex(0);
			}
		});
		Add.setFont(new Font("Georgia", Font.BOLD, 15));
		Add.setBounds(700, 370, 140, 25);
		panel.add(Add);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 430, 1010, 236);
		panel.add(scrollPane);
		
		DetailTable = new JTable();
		DetailTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "USN", "Date Of Birth", "Gender", "Department", "Year Of Passing"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		DetailTable.setFont(new Font("Arial", Font.PLAIN, 12));
		scrollPane.setViewportView(DetailTable);
		
		JLabel feature = new JLabel("This Applet is Created by Prateek Dey");
		feature.setEnabled(false);
		feature.setHorizontalAlignment(SwingConstants.CENTER);
		feature.setFont(new Font("Georgia", Font.PLAIN, 15));
		feature.setBounds(750, 670, 300, 20);
		panel.add(feature);
	}
}

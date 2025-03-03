package idgenerator1;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Otherstaff extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField uniqueNo;
	private JTextField dob;
	private JTextField gender;
	private JTextField bloodG;
	private JTextField department;
	private JTextField phone;
	private JTextField address;
	private JLabel lblNewLabel_18; 
	private JLabel input_1;
	private JLabel input_2;
	private JLabel input_3;
	private JLabel input_4;
	private JLabel input_5;
	private JLabel input_6;
	private JLabel input_7;
	private JLabel input_8;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otherstaff frame = new Otherstaff();
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
	public Otherstaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sarap\\OneDrive\\Desktop\\MINI PROJECT\\pce1.png"));
		setBounds(100, 100, 885, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Other staff");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(94, 10, 287, 41);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 61, 423, 546);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("His/Her Name");
		lblNewLabel_1.setBounds(10, 10, 143, 34);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Unique no.");
		lblNewLabel_2.setBounds(10, 64, 143, 31);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_3 = new JLabel("Date of birth");
		lblNewLabel_3.setBounds(10, 120, 143, 25);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(10, 174, 115, 25);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5 = new JLabel("Blood Group");
		lblNewLabel_5.setBounds(10, 231, 115, 25);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_6 = new JLabel("Department");
		lblNewLabel_6.setBounds(10, 290, 115, 25);
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		name = new JTextField();
		name.setBounds(154, 13, 259, 31);
		panel_1.add(name);
		name.setColumns(10);
		
		uniqueNo = new JTextField();
		uniqueNo.setBounds(154, 68, 259, 31);
		panel_1.add(uniqueNo);
		uniqueNo.setColumns(10);
		
		dob = new JTextField();
		dob.setBounds(154, 121, 259, 31);
		panel_1.add(dob);
		dob.setColumns(10);
		
		gender = new JTextField();
		gender.setBounds(154, 175, 259, 31);
		panel_1.add(gender);
		gender.setColumns(10);
		
		bloodG = new JTextField();
		bloodG.setBounds(154, 232, 259, 31);
		panel_1.add(bloodG);
		bloodG.setColumns(10);
		
		department = new JTextField();
		department.setBounds(154, 291, 269, 31);
		panel_1.add(department);
		department.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Contact no.");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(10, 350, 115, 18);
		panel_1.add(lblNewLabel_7);
		
		phone = new JTextField();
		phone.setBounds(154, 343, 269, 34);
		panel_1.add(phone);
		phone.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Address");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(10, 403, 115, 18);
		panel_1.add(lblNewLabel_8);
		
		address = new JTextField();
		address.setBounds(154, 395, 269, 34);
		panel_1.add(address);
		address.setColumns(10);
		
		JButton btnNewButton = new JButton("Set Image");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser browseImageFile = new JFileChooser();
				FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
				browseImageFile.addChoosableFileFilter(fnef);
				int showOpenDialogue = browseImageFile.showOpenDialog(contentPane);
				
                if( showOpenDialogue == JFileChooser.APPROVE_OPTION) {
					
					File selectedImageFile = browseImageFile.getSelectedFile();
					String selectedImagePath = selectedImageFile.getAbsolutePath();
					JOptionPane.showMessageDialog(null,selectedImagePath);
					
					ImageIcon pic = new ImageIcon(selectedImagePath);
					Image image = pic.getImage().getScaledInstance(lblNewLabel_18.getWidth(),lblNewLabel_18.getHeight(),Image.SCALE_SMOOTH);
					lblNewLabel_18.setIcon(new ImageIcon(image));					
				}	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(118, 448, 211, 31);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Generate id");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name = name.getText();
                String UniqueNo = uniqueNo.getText();
                String DOB = dob.getText();
                String Gender = gender.getText();
                String Blood = bloodG.getText();
                String Department = department.getText();
                String Address = address.getText();
                String mobileNumber = phone.getText();
                int len = mobileNumber.length();
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnNewButton_1, "Enter a valid mobile number");
                }

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/idgenerator", "root", "sara@174574");

                    String query = "INSERT INTO nonteaching values('" + UniqueNo + "','" + Name + "','" + DOB + "','" + Gender + "','" + Blood + "','" + Department + "','" + mobileNumber + "','"+ Address + "')";
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton_1, "Data already exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton_1, "Data inserted");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                
                input_1.setText(Name);
                input_2.setText(UniqueNo);
                input_3.setText(DOB);
                input_4.setText(Blood);
                input_5.setText(mobileNumber);
                input_6.setText(Address);
                input_7.setText(Gender);
                input_8.setText(Department);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(22, 500, 157, 31);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(252, 500, 136, 31);
		panel_1.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setLayout(null);
		panel.setBounds(455, 10, 406, 597);
		contentPane.add(panel);
		
		JLabel lblNewLabel_9 = new JLabel("icon");
		lblNewLabel_9.setBounds(10, 21, 77, 75);
		panel.add(lblNewLabel_9);
		ImageIcon p = new ImageIcon(this.getClass().getResource("/pce1.png"));
		Image img = p.getImage().getScaledInstance(lblNewLabel_9.getWidth(),lblNewLabel_9.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_9.setIcon(new ImageIcon(img));
		
		JLabel lblNewLabel_10 = new JLabel("Name:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_10.setBounds(20, 250, 55, 13);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Unique no.:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(20, 285, 93, 21);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Date of birth:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_12.setBounds(20, 340, 105, 21);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Gender:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_13.setBounds(236, 340, 69, 21);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Blood Group:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_14.setBounds(20, 398, 105, 21);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Department:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_15.setBounds(215, 398, 105, 21);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Contact no.:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_16.setBounds(20, 452, 105, 21);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Address:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_17.setBounds(20, 501, 82, 27);
		panel.add(lblNewLabel_17);
		
	    lblNewLabel_18 = new JLabel("");
	    lblNewLabel_18.setBackground(Color.YELLOW);
		lblNewLabel_18.setBounds(124, 44, 163, 182);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Non-Teaching Staff ID");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_19.setBounds(97, 0, 228, 34);
		panel.add(lblNewLabel_19);
		
		input_1 = new JLabel("");
		input_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_1.setBounds(80, 244, 131, 31);
		panel.add(input_1);
		
		input_2 = new JLabel("");
		input_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_2.setBounds(109, 285, 120, 27);
		panel.add(input_2);
		
		input_7 = new JLabel("");
		input_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_7.setBounds(302, 340, 94, 27);
		panel.add(input_7);
		
	    input_3 = new JLabel("");
		input_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_3.setBounds(124, 340, 87, 27);
		panel.add(input_3);
		
	    input_4 = new JLabel("");
		input_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_4.setBounds(116, 398, 89, 27);
		panel.add(input_4);
		
		input_5 = new JLabel("");
		input_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_5.setBounds(115, 452, 131, 27);
		panel.add(input_5);
		
		input_6 = new JLabel("");
		input_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_6.setBounds(87, 501, 294, 34);
		panel.add(input_6);
		
	    input_8 = new JLabel("");
		input_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_8.setBounds(314, 398, 82, 27);
		panel.add(input_8);
	}
}

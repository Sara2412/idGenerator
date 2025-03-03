package idgenerator1;


import java.awt.Graphics;
import java.awt.print.PrinterJob;
import java.awt.print.Printable;
import java.awt.print.PageFormat;
import java.awt.Graphics2D;
import java.awt.print.PrinterException;
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
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.sql.ResultSet;

public class student extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField admissionNo;
	private JTextField dob;
	private JTextField gender;
	private JTextField bloodG;
	private JTextField branch;
	private JTextField phone;
	private JTextField address;
	private JTextField rollNo;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_9;
	private JPanel panel;
	private JLabel input_1;
	private JLabel input_2;
	private JLabel input_3;
	private JLabel input_4;
	private JLabel input_5;
	private JLabel input_6;
	private JLabel input_7;
	private JLabel input_8;
	private JLabel input_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student frame = new student();
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
	public student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sarap\\OneDrive\\Desktop\\MINI PROJECT\\pce1.png"));
		setBounds(100, 100, 885, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 10, 423, 597);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 62, 143, 34);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Admission no.");
		lblNewLabel_2.setBounds(10, 9, 143, 31);
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
		
		JLabel lblNewLabel_6 = new JLabel("Branch");
		lblNewLabel_6.setBounds(10, 290, 115, 25);
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		name = new JTextField();
		name.setBounds(154, 62, 259, 31);
		panel_1.add(name);
		name.setColumns(10);
		
		dob = new JTextField();
		dob.setBounds(154, 121, 259, 31);
		panel_1.add(dob);
		dob.setColumns(10);
		
		gender = new JTextField();
		gender.setBounds(154, 175, 80, 31);
		panel_1.add(gender);
		gender.setColumns(10);
		
		bloodG = new JTextField();
		bloodG.setBounds(154, 232, 259, 31);
		panel_1.add(bloodG);
		bloodG.setColumns(10);
		
		branch = new JTextField();
		branch.setBounds(154, 291, 269, 31);
		panel_1.add(branch);
		branch.setColumns(10);
		
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
				
		
				    if(showOpenDialogue == JFileChooser.APPROVE_OPTION) {
					
					File selectedImageFile = browseImageFile.getSelectedFile();
					String selectedImagePath = selectedImageFile.getAbsolutePath();
					JOptionPane.showMessageDialog(null,selectedImagePath);
					
					ImageIcon pic = new ImageIcon(selectedImagePath);
					Image image = pic.getImage().getScaledInstance(lblNewLabel_19.getWidth(),lblNewLabel_19.getHeight(),Image.SCALE_SMOOTH);
					lblNewLabel_19.setIcon(new ImageIcon(image));					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(22, 464, 157, 31);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Generate id");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name = name.getText();
                String AdmissionNo = admissionNo.getText();
                String RollNo = rollNo.getText();
                String DOB = dob.getText();
                String Gender = gender.getText();
                String Blood = bloodG.getText();
                String Branch = branch.getText();
                String Address = address.getText();
                String mobileNumber = phone.getText();
                int len = mobileNumber.length();
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnNewButton_1, "Enter a valid mobile number");
                }

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/idgenerator", "root", "sara@174574");

                    String query = "INSERT INTO student values('" + AdmissionNo + "','" + RollNo + "','" + Name + "','" +
                        DOB + "','" + Gender + "','" + Blood + "','" + Branch + "','" + mobileNumber + "','"+ Address + "')";
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton_1, "Data already exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton_1,
                            "Data inserted");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                
               input_1.setText(Name);
               input_2.setText(AdmissionNo);
               input_3.setText(DOB);
               input_4.setText(Blood);
               input_5.setText(mobileNumber);
               input_6.setText(Address);
               input_7.setText(RollNo);
               input_8.setText(Gender);
               input_9.setText(Branch);
               
	
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(22, 527, 157, 31);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  printRecord(panel);
			}
			
			private void printRecord (JPanel panel) {
				PrinterJob printerJob = PrinterJob.getPrinterJob();
				printerJob.setJobName("Print Record");
				printerJob.setPrintable(new Printable() {
					@Override
					public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
						if(pageIndex > 0) {
							return Printable.NO_SUCH_PAGE;
						}
						
						Graphics2D graphics2D = (Graphics2D)graphics;
						graphics2D.translate(pageFormat.getImageableX()*2,pageFormat.getImageableY()*2);
						graphics2D.scale(0.5,0.5);
						
						panel.print(graphics2D);
						return Printable.PAGE_EXISTS;
						
					}
				});
				
				boolean returningResult = printerJob.printDialog();
				if(returningResult) {
					try {
						printerJob.print();
					}catch (PrinterException printerException) {
						JOptionPane.showMessageDialog(btnNewButton_2,"Print Error:" + printerException.getMessage());
						
					}
				}
			}
					
		});
		
		
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(252, 527, 136, 31);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_10 = new JLabel("Roll no.");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(244, 177, 69, 18);
		panel_1.add(lblNewLabel_10);
		
		rollNo = new JTextField();
		rollNo.setBounds(317, 174, 96, 32);
		panel_1.add(rollNo);
		rollNo.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("View");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String AdmissionNo = admissionNo.getText();
				try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/idgenerator", "root", "sara@174574");
                    if (AdmissionNo.length() > 0) {
                    String sql = "SELECT * FROM student WHERE admission_no = '" + AdmissionNo +"'"; 
                    
                    Statement s = connection.prepareStatement(sql);
                    ResultSet rs = s.executeQuery(sql);
                    
                    if(rs.next()) {
                    	String Admission =rs.getString(1);
                    	String roll_no =rs.getString(2);
                    	String full_name =rs.getString(3);
                    	String dob =rs.getString(4);
                    	String gender =rs.getString(5);
                    	String bloodgroup =rs.getString(6);
                    	String branch =rs.getString(7);
                    	String contact=rs.getString(8);
                    	String address =rs.getString(9);
                    	
                    	input_1.setText(full_name);
                        input_2.setText(Admission);
                        input_3.setText(dob);
                        input_4.setText(bloodgroup);
                        input_5.setText(contact);
                        input_6.setText(address);
                        input_7.setText(roll_no);
                        input_8.setText(gender);
                        input_9.setText(branch);
                      }
                    else {
                    	JOptionPane.showMessageDialog(null,"Sorry! No data found for this Number","Student ID",JOptionPane.ERROR_MESSAGE);
                    	JOptionPane.showMessageDialog(null,"Enter a valid Number","Student ID Information",JOptionPane.INFORMATION_MESSAGE);
                    	input_2.setText(" ");
                    }
                 
                  }
                    else {
                    	JOptionPane.showMessageDialog(null,"Please, try again!","Student ID",JOptionPane.ERROR_MESSAGE); 
				} 
			} catch (Exception ex) {
				    
				JOptionPane.showMessageDialog(null,"SQL Syntax should be reviewed","Database",JOptionPane.ERROR_MESSAGE);
			  }
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(252, 464, 136, 31);
		panel_1.add(btnNewButton_3);
		
		admissionNo = new JTextField();
		admissionNo.setBounds(154, 13, 259, 31);
		panel_1.add(admissionNo);
		admissionNo.setColumns(10);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 204, 255));
		panel.setLayout(null);
		panel.setBounds(455, 10, 406, 597);
		contentPane.add(panel);
		
		lblNewLabel_9 = new JLabel("ICON");
		lblNewLabel_9.setBounds(20, 20, 69, 64);
		panel.add(lblNewLabel_9);
		ImageIcon p = new ImageIcon(this.getClass().getResource("/pce1.png"));
		Image img = p.getImage().getScaledInstance(lblNewLabel_9.getWidth(),lblNewLabel_9.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_9.setIcon(new ImageIcon(img));
		
		JLabel lblNewLabel_10_1 = new JLabel("Name:");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_10_1.setBounds(21, 251, 58, 13);
		panel.add(lblNewLabel_10_1);
	
		JLabel lblNewLabel_11 = new JLabel("Admission no.:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(20, 285, 121, 21);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Date of birth:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_12.setBounds(20, 340, 105, 21);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Gender:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_13.setBounds(258, 340, 69, 21);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Blood Group:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_14.setBounds(20, 398, 105, 21);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Branch:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_15.setBounds(258, 398, 105, 21);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Contact no.:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_16.setBounds(20, 452, 105, 21);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Address:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_17.setBounds(20, 501, 82, 27);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Roll no.:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_18.setBounds(258, 289, 69, 13);
		panel.add(lblNewLabel_18);
		
	    lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setBounds(123, 43, 149, 185);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Student ID");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_20.setBounds(133, 0, 121, 33);
		panel.add(lblNewLabel_20);
		
	    input_1 = new JLabel("");
		input_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_1.setBounds(83, 242, 171, 33);
		panel.add(input_1);
		
		input_2 = new JLabel("");
		input_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_2.setBounds(135, 285, 113, 28);
		panel.add(input_2);
		
	    input_3 = new JLabel("");
		input_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_3.setBounds(123, 340, 125, 27);
		panel.add(input_3);
		
		input_4 = new JLabel("");
		input_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_4.setBounds(118, 398, 113, 27);
		panel.add(input_4);
		
		input_5 = new JLabel("");
		input_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_5.setBounds(115, 452, 139, 27);
		panel.add(input_5);
		
		input_6 = new JLabel("");
		input_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		input_6.setBounds(96, 496, 267, 33);
		panel.add(input_6);
		
		input_7 = new JLabel("");
		input_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_7.setBounds(327, 285, 69, 27);
		panel.add(input_7);
		
		input_8 = new JLabel("");
		input_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_8.setBounds(318, 337, 78, 30);
		panel.add(input_8);
		
		input_9 = new JLabel("");
		input_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input_9.setBounds(318, 398, 78, 20);
		panel.add(input_9);
	}
}



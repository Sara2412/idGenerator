package idgenerator1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class UserHome extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserHome frame = new UserHome("Sample");
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
    public UserHome(String userSes) {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sarap\\OneDrive\\Desktop\\MINI PROJECT\\pce1.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBounds(450, 190, 1423, 858);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JButton btnNewButton = new JButton("Logout");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(new Color(211, 211, 211));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                 JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    UserLogin obj = new UserLogin();
                    obj.setTitle("Student-Login");
                    obj.setVisible(true);
                }
                dispose();
                UserLogin obj = new UserLogin();

                obj.setTitle("Student-Login");
                obj.setVisible(true);

            }
        });
        btnNewButton.setBounds(1270, 746, 129, 42);
        contentPane.add(btnNewButton);
        JButton button = new JButton("Change-password\r\n");
        button.setForeground(new Color(0, 0, 0));
        button.setBackground(new Color(211, 211, 211));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChangePassword bo = new ChangePassword(userSes);
                bo.setTitle("Change Password");
                bo.setVisible(true);

            }
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button.setBounds(1185, 10, 214, 58);
        contentPane.add(button);
        
        JButton btnNewButton_1 = new JButton("STUDENT");
        btnNewButton_1.setForeground(Color.BLACK);
        btnNewButton_1.setBackground(new Color(127, 255, 212));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) { 
        		student s = new student();
        		s.setVisible(true);
        	}
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnNewButton_1.setBounds(603, 306, 334, 70);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton(" STAFF");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		teachingstaff t = new teachingstaff();
        		t.setVisible(true);
        	}
        });
        btnNewButton_2.setBackground(new Color(240, 230, 140));
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnNewButton_2.setBounds(603, 463, 334, 64);
        contentPane.add(btnNewButton_2);
    }
}


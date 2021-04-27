package BookStore;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.jdi.connect.spi.Connection;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;

public class LoginPage extends JFrame implements ActionListener{

		JLabel l1,l2,l4,l6,l7,l8,l3,l9;
	    JButton b1;
	   JTextField t1;
	   JPasswordField t2;
	   JTextArea a2;
	   
	   LoginPage()
	    {
	    	
	    	ImageIcon background=new ImageIcon("C:\\\\Users\\\\Pradip\\\\OneDrive\\\\Documents\\\\project_pradip\\\\b3.jpg");
	        Image img=background.getImage();
	        Image temp=img.getScaledInstance(1900,900,Image.SCALE_SMOOTH);
	        background=new ImageIcon(temp);
	        JLabel back=new JLabel(background);
	        back.setLayout(null);
	        
	    	setVisible(true);  
	        setSize(1900, 900);  
	        setLayout(null);  
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        setTitle("Login Page");  
	        l1 = new JLabel("    BookStore Online Shopping System");  
	        l1.setForeground(Color.blue);  
	        l1.setFont(new Font("Serif", Font.BOLD, 40)); 
	        l6=new JLabel(" +91 8422800381");
	        l6.setForeground(Color.red);  
	        l7=new JLabel(" info@TestYantra.in");
	        l7.setForeground(Color.red);  
	        l7.setFont(new Font("Serif", Font.BOLD, 20));
	        l6.setFont(new Font("Serif", Font.BOLD, 20));
	        
	        a2=new JTextArea();
	 		
			
			ImageIcon i1=new ImageIcon("C:\\Users\\Pradip\\OneDrive\\Documents\\project_pradip\\i7.jpg");

	    	l8=new JLabel(i1);
	    	l9=new JLabel(i1);
	    	l4=new JLabel("Admin Login");
	    	l4.setForeground(Color.magenta);  
	        l4.setFont(new Font("Serif", Font.BOLD, 26));

	    	l2=new JLabel("Username : ");
	    	l2.setForeground(Color.darkGray);  
	        l2.setFont(new Font("Serif", Font.BOLD, 20));
	    	t1=new JTextField();
	    	t1.setFont(new Font("Serif", Font.BOLD, 20));
	    	
	    	l3=new JLabel("Password : ");
	    	l3.setForeground(Color.DARK_GRAY);  
	        l3.setFont(new Font("Serif", Font.BOLD, 20));
	    	t2=new JPasswordField();
	    	t2.setFont(new Font("Serif", Font.BOLD, 20));
	    	b1=new JButton("Login");
			
			back.setBounds(0,0,1900,900);
			l1.setBounds(300, 30, 1000, 40); 
			a2.setBounds(10, 150, 1350, 15);
    		a2.setBackground(Color.darkGray);
			l9.setBounds(430, 90, 20, 20);
			l6.setBounds(450, 90, 200, 20);
			l8.setBounds(630, 90, 20, 20);
			l7.setBounds(650, 90, 200, 20);
			l4.setBounds(560, 250, 200, 35);
			l2.setBounds(480, 300, 150, 20);
			t1.setBounds(600, 300, 200, 30);
			l3.setBounds(480, 350, 150, 20);
			t2.setBounds(600, 350, 200, 30);
	        b1.setBounds(550, 400, 100, 30);
			b1.setForeground(Color.red);
			b1.addActionListener(this);
			
			
			add(back);
			back.add(l1); 
			back.add(a2);
		    back.add(l9);
	        back.add(l6);
	        back.add(l8);
	        back.add(l7);
	        back.add(l4);
	        back.add(l2);
	        back.add(t1);
	        back.add(l3);
	        back.add(t2);
			back.add(b1);
		   
	    }
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b1)
			{
				String Username=t1.getText();
				String Password=t2.getText();
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=(Connection) DriverManager.getConnection("\"jdbc:mysql://127.0.0.1:3306/pradip\",\"root\",\"Rockstar001@\"");
					PreparedStatement ps= ((java.sql.Connection) con).prepareStatement("select * from login where Username=? and Password=?");
					ps.setString(1, Username);
					ps.setString(2, Password);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(b1, "Login Succefull");
						LoginPage page=new LoginPage();
						page.setVisible(true);
						this.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(t1, "Username or Paswword is Wrong");
					}
				}catch(Exception ae)
				{
					ae.printStackTrace();
				}
			}
		}

		public static void main(String args[])  
		{
			
		
			try
			{
				
				LoginPage frame=new LoginPage();
				frame.setVisible(true);
				frame.setSize(1900,900);
				frame.setBounds(5, 10, 1700, 900);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		}  




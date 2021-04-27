package BookStore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.sun.jdi.connect.spi.Connection;


public class HomePage extends JFrame implements ActionListener {

	JLabel l,l1,l2,l3,l4,l6,l5,l7,l8,p1,p2,p3,p4,p5,p6,p7;
	JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    FileInputStream fis;
    ImageIcon s[];
    int i,l9;
    JPanel p;
    JTextArea a1,a2;
    
    String[] list= {"C:\\\\Users\\\\Pradip\\\\OneDrive\\\\Documents\\\\project_pradip\\\\i1.jpg",
    		"C:\\Users\\Pradip\\OneDrive\\Documents\\project_pradip\\b1.jpg",
    		"C:\\Users\\Pradip\\OneDrive\\Documents\\project_pradip\\b2.jpg",
    		"C:\\\\Users\\\\Pradip\\\\OneDrive\\\\Documents\\\\project_pradip\\\\b3.jpg"
    		
    };
   
    HomePage() throws FileNotFoundException
    {
    	
    	ImageIcon background=new ImageIcon("C:\\\\Users\\\\Pradip\\\\OneDrive\\\\Documents\\\\project_pradip\\\\b3.jpg");
        Image img=background.getImage();
        Image temp=img.getScaledInstance(1900,900,Image.SCALE_SMOOTH);
        background=new ImageIcon(temp);
        JLabel back=new JLabel(background);
        back.setLayout(null);
        
    	setVisible(true);  
        setSize(1700, 1200);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Home");  
        l1 = new JLabel("  BookStore Online Shopping System");  
        l1.setForeground(Color.blue); 
        l1.setFont(new Font("Serif", Font.BOLD, 40)); 
        l6=new JLabel(" +91 8422800381");
        l6.setForeground(Color.red);  
        l7=new JLabel(" info@TestYantra.in");
        l7.setForeground(Color.red);  
        l7.setFont(new Font("Serif", Font.BOLD, 20));
        l6.setFont(new Font("Serif", Font.BOLD, 20));
        
		
		a1=new JTextArea();
		a2=new JTextArea();
		
		ImageIcon logout=new ImageIcon("I:\\Images\\logout.jpg");
		b1=new JButton(logout);	
		ImageIcon cart=new ImageIcon("I:\\Images\\cart.jpg");
		b2=new JButton(cart);
		ImageIcon i1=new ImageIcon("I:\\Images\\d2.jpg");
		String f1=new String("I:\\\\Images\\\\d2.jpg");
		fis=new FileInputStream(f1);
		t1=new JLabel("HP i3  -- Rs.80000");
		t1.setForeground(Color.red);
		t1.setFont(new Font("Serif", Font.BOLD, 15)); 
		c1=new JButton("Add To Cart");
		ImageIcon i2=new ImageIcon("I:\\Images\\d3.jpg");
		t2=new JLabel("HP i3  -- Rs.80000");
		t2.setForeground(Color.red);
		t2.setFont(new Font("Serif", Font.BOLD, 15)); 
		c2=new JButton("Add To Cart");
		ImageIcon i3=new ImageIcon("I:\\Images\\d4.jpg");
		t3=new JLabel("HP i3  -- Rs.80000");
		t3.setForeground(Color.red);
		t3.setFont(new Font("Serif", Font.BOLD, 15)); 
		c3=new JButton("Add To Cart");
		ImageIcon i4=new ImageIcon("I:\\Images\\d1.jpg");
		t4=new JLabel("HP i3  -- Rs.80000");
		t4.setForeground(Color.red);
		t4.setFont(new Font("Serif", Font.BOLD, 15)); 
		c4=new JButton("Add To Cart");
		ImageIcon i5=new ImageIcon("I:\\Images\\t1.jpg");
		t5=new JLabel("HP i3  -- Rs.80000");
		t5.setForeground(Color.red);
		t5.setFont(new Font("Serif", Font.BOLD, 15)); 
		c5=new JButton("Add To Cart");
		ImageIcon i6=new ImageIcon("I:\\Images\\t2.jpg");
		t6=new JLabel("HP i3  -- Rs.80000");
		t6.setForeground(Color.red);
		t6.setFont(new Font("Serif", Font.BOLD, 15)); 
		c6=new JButton("Add To Cart");
		ImageIcon i7=new ImageIcon("I:\\Images\\t3.jpg");
		t7=new JLabel("HP i3  -- Rs.80000");
		t7.setForeground(Color.red);
		t7.setFont(new Font("Serif", Font.BOLD, 15)); 
		c7=new JButton("Add To Cart");
		ImageIcon i8=new ImageIcon("I:\\Images\\m2.jpg");
		t8=new JLabel("HP i3  -- Rs.80000");
		t8.setForeground(Color.red);
		t8.setFont(new Font("Serif", Font.BOLD, 15)); 
		c8=new JButton("Add To Cart");
		ImageIcon i9=new ImageIcon("I:\\Images\\m3.jpg");
		t9=new JLabel("HP i3  -- Rs.80000");
		t9.setForeground(Color.red);
		t9.setFont(new Font("Serif", Font.BOLD, 15)); 
		c9=new JButton("Add To Cart");
		ImageIcon i10=new ImageIcon("I:\\Images\\m1.jpg");
		t10=new JLabel("HP i3  -- Rs.80000");
		t10.setForeground(Color.red);
		t10.setFont(new Font("Serif", Font.BOLD, 15)); 
		c10=new JButton("Add To Cart");
		
		l2=new JLabel(i1);
		l3=new JLabel(i2);
		l4=new JLabel(i3);
    	l8=new JLabel(i4);
    	p1=new JLabel(i5);
    	p2=new JLabel(i6);
    	p3=new JLabel(i7);
    	p4=new JLabel(i8);
    	p5=new JLabel(i9);
    	p6=new JLabel(i10);
		
		back.setBounds(0,0,1900,900);
		l1.setBounds(300, 0, 1000, 60); 
		l3.setBounds(430, 50, 20, 20);
		l6.setBounds(450, 50, 200, 20);
		l8.setBounds(630, 90, 20, 20);
		l7.setBounds(650, 50, 200, 20);
		a2.setBounds(10, 120, 1350, 10);
		a2.setBackground(Color.DARK_GRAY);
        b1.setBounds(1150, 60, 50, 50);
		b1.setForeground(Color.red);
		b2.setBounds(1080, 60, 50, 50);
		b2.setForeground(Color.red);
		a1.setBounds(10, 230, 1350, 10);
		a1.setBackground(Color.DARK_GRAY);
		
		l2.setBounds(20, 150, 250, 200);
		t1.setBounds(20,350,140,40);
		c1.setBounds(170,360,100,20);
		l3.setBounds(290, 150, 250, 200);
		t2.setBounds(290,350,140,40);
		c2.setBounds(440,360,100,20);
		l4.setBounds(560, 150, 250, 200);
		t3.setBounds(560,350,140,40);
		c3.setBounds(710,360,100,20);
		l8.setBounds(830, 150, 250, 200);
		t4.setBounds(830,350,140,40);
		c4.setBounds(980,360,100,20);
		p1.setBounds(1100, 150, 250, 200);
		t5.setBounds(1100,350,140,40);
		c5.setBounds(1250,360,100,20);
		p2.setBounds(20, 400, 250, 200);
		t6.setBounds(20,600,140,40);
		c6.setBounds(170,610,100,20);
		p3.setBounds(290, 400, 250, 200);
		t7.setBounds(290,600,140,40);
		c7.setBounds(440,610,100,20);
		p4.setBounds(560, 400, 250, 200);
		t8.setBounds(560,600,140,40);
		c8.setBounds(710,610,100,20);
		p5.setBounds(830, 400, 250, 200);
		t9.setBounds(830,600,140,40);
		c9.setBounds(980,610,100,20);
		p6.setBounds(1100, 400, 250, 200);
		t10.setBounds(1100,600,140,40);
		c10.setBounds(1250,610,100,20);
		add(back);
		back.add(l1); back.add(t6);back.add(c6);
		back.add(l2);back.add(t7);back.add(c7);
		back.add(l3);back.add(t8);back.add(c8);
		back.add(l4);back.add(t9);back.add(c9);
        back.add(l6);back.add(t10);back.add(c10);
       back.add(l8);
        back.add(l7);
        back.add(a2);back.add(t5);back.add(c5);
		back.add(b1);back.add(t3);back.add(c3);back.add(t4);back.add(c4);
		back.add(b2);back.add(t1);back.add(c1);back.add(t2);back.add(c2);
		back.add(p1);back.add(p2);back.add(p3);back.add(p4);back.add(p5);back.add(p6);
	    b6=new JButton("<<");
	    b6.setForeground(Color.blue);
	    b7=new JButton(">>");
	    b7.setForeground(Color.blue);
	    back.add(b6);
	    back.add(b7);
	    back.add(b6,BorderLayout.SOUTH);
	    b6.addActionListener(this);
	    b7.addActionListener(this);
	    s = new ImageIcon[4]; 
	    //s[0] = new ImageIcon("C:\\Users\\Pradip\\OneDrive\\Documents\\project_pradip\\b1.jpg");
	    //s[1] = new ImageIcon("C:\\Users\\Pradip\\OneDrive\\Documents\\project_pradip\\i1.jpg");
	    //s[2] = new ImageIcon("C:\\Users\\Pradip\\OneDrive\\Documents\\project_pradip\\i2.jpg");
	    //s[3] = new ImageIcon("C:\\Users\\Pradip\\OneDrive\\Documents\\project_pradip\\i3.jpg");
	    l = new JLabel("",JLabel.CENTER); 
	    back.add(l,BorderLayout.CENTER);
	    l.setIcon(s[0]);
	    l.setBounds(30, 260, 1300, 450);
	    b6.setBounds(620, 650, 50, 50);
	    b7.setBounds(730, 650, 50, 50);
	    b6.addActionListener(this);
	    b7.addActionListener(this);
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    c1.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	 if(e.getSource()==b1)
	 {
		 LoginPage page=new LoginPage();
		 page.setVisible(true);
		 this.dispose();
	 }
	 else if(e.getSource()==b2)
	 {
		 LoginPage page=new LoginPage();
		 page.setVisible(true);
		 this.dispose();
	 }
	 else if(e.getSource()==c1)
	 {
		 String s1=t1.getName();
		 try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=(Connection) DriverManager.getConnection("\"jdbc:mysql://127.0.0.1:3306/pradip\",\"root\",\"Rockstar001@\"");
				PreparedStatement ps= ((java.sql.Connection) con).prepareStatement("insert into testyantra(title,pic) values(?,?)");
				ps.setString(1,s1);
				ps.setBinaryStream(2,fis);
				ResultSet rs=ps.executeQuery();
				JOptionPane.showMessageDialog(l2, "Add to cart Succesfully");
			}catch(Exception ae)
			{
				ae.printStackTrace();
			}
	 }
	}
	
	public static void main(String args[]) throws FileNotFoundException  
	{  
	    new HomePage();  
	} 

}

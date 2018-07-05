import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileOutputStream;

class test extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,l4;
	JTextField tf1;
	JPasswordField pf1;
	JButton b1;
	JPanel p1;

	test()
	{
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		l3=new JLabel(" ");
		l4=new JLabel(" ");

		tf1=new JTextField();
		
		pf1=new JPasswordField();

		b1=new JButton("Submit");
		
		p1=new JPanel();
	}
	void add(JFrame f)     
      	{
		p1.add(b1);
		p1.add(l4);	

		f.add(l1);
		f.add(tf1);

		f.add(l2);
		f.add(pf1);

		f.add(p1);
		f.add(l3);

		f.setSize(500,200);
		f.setLayout(new GridLayout(3,2));
		f.setVisible(true);
		f.setTitle("Login Page");
	}
	void reg()
	{
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		String str1=tf1.getText();
		String str2=pf1.getText();

		if(e.getSource().equals(b1))
		{ 
			if(str1.equals("admin"))
			{ 
				if(str2.equals("admin123"))			
				{
					try
					{
					JFrame f = new JFrame();
					pro obj = new pro();
					obj.add(f);
					obj.reg();
					obj.calc();
					}
					catch(Exception E){System.out.println(E);}
				}
				else
				{
					l3.setText("Correct username but wrong password.");

				}
			}
			else
			{
				l3.setText("Incorrect username");
			}
		}
	}
	public static void main(String args[])
	{
		JFrame f = new JFrame();
		test obj = new test();
		obj.add(f);
		obj.reg();
	}
}  
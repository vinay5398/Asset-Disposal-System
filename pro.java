import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;  
import java.io.FileOutputStream;  
import java.text.*;
import java.util.*;
import java.util.concurrent.*;	

class pro extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JTextField tf1,tf2;
	JTextArea t1;
	JButton b1,b2,b3,b4,b5;
	JPanel p1,p2,p3,p4;
	JComboBox products;
	JFormattedTextField txtDate;

	pro()
	{
		
		l1=new JLabel("Verified by(Name)");
		l2=new JLabel("Product type");
		l3=new JLabel("Comments");
		l4=new JLabel("Age of asset");
		l5=new JLabel(" ");
		l6=new JLabel(" ");
		l7=new JLabel("Date of purchase(dd/mm/yy)");
		l8=new JLabel("Current date");
		l9=new JLabel("Serial No. of asset(if any)");
		l10=new JLabel(" ");
		l11=new JLabel(" ");

		tf1=new JTextField();
		tf2=new JTextField();

		t1=new JTextArea();
		txtDate = new JFormattedTextField();
		DateFormat txtDate = new SimpleDateFormat("dd/MM/yyyy");

		String str[]={"Centralised Data Processing","Main Frames","Printer Units","Mini Computers","Personal Computing","Laptops,Mouse,Screen,Keyboard","Notebook","Printers","Copying Equipments","Calculators","User Terminals and systems","Lighting Equipment","Audio/Video Conferencing Systems","LCD Monitors","Xerox Machines","Smoke Detectors","Telephone","Collection and Storage Equipment"};
		products= new JComboBox(str);

		p1= new JPanel();
		p2= new JPanel();
		p3= new JPanel();		
  		p4= new JPanel();
		
		b1=new JButton("Confirm");  
		b2=new JButton("Reset");  
		b3=new JButton("Close");  	
		b4=new JButton("Start");  	
		b5=new JButton("Calculate");  	
	}
	void add(JFrame f)
	{
		p4.add(l5);
		p4.add(l6);
		p2.add(b1);
		p2.add(b4);
 		p3.add(b2);
 		p3.add(b3);
		p1.add(l11);
		p1.add(b5);

		f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(products);
		f.add(l7);
		f.add(tf2);
		f.add(l8);
		f.add(l10);
		f.add(l4);
		f.add(p1);
		f.add(l9);
		f.add(txtDate);
		f.add(l3);
		f.add(t1);
		f.add(p2);
		f.add(p3);
		f.add(p4);

		f.setSize(800,800);
		f.setLayout(new GridLayout(10,2));
		f.setVisible(true);
		f.setTitle("Admin Asset Disposal Page");

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		l10.setText(formatter.format(date));

		l6.setText("Press start to begin procedure");

		tf1.setEnabled(false);
		tf2.setEnabled(false);
		txtDate.setEnabled(false);
		t1.setEnabled(false);
	}
	void calc() throws Exception
	{
		String date1=tf2.getText();
		String date2=l10.getText();
	     	l11.setText(" ");
	}
	void reg()
	{
		b1.addActionListener(this);
		b3.addActionListener(this);
		b2.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str1=tf1.getText();
		String str2=t1.getText();

		if(e.getSource().equals(b1))
		{
			if(str1.equals("")||str2.equals(""))
			{
				l5.setText("Enter Missing Fields");
			}
			else
			{
				l5.setText("Thank you "+str1);
				l6.setText("Request has been registered");				
			}
		}
		if(e.getSource().equals(b3))
		{
			setVisible(false);
    			dispose();
    			System.exit(0); 
		}
		if(e.getSource().equals(b2))
		{
			tf1.setText(" ");
			tf2.setText(" ");
			txtDate.setText(" ");
			t1.setText(" ");
			l5.setText(" ");
			l6.setText(" ");
			l11.setText(" ");
			l12.setText(" ");
		}
		if(e.getSource().equals(b4))
		{
			tf1.setEnabled(true);
			tf2.setEnabled(true);
			txtDate.setEnabled(true);
			t1.setEnabled(true);
			l6.setText(" ");
		}
	}
  	public static void main(String args[])
   	{  

	}	
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Border implements ActionListener
{
	public static int top, bottom, right, left, center;
	public static JPanel pTop, pLeft, pCenter, pRight, pBottom;
	public static JFrame jf;
	
	public static void addComponentsToPane(Container container)
	{
		pTop = new JPanel(new FlowLayout());
		pTop.setSize(new Dimension(30, 50));
		pTop.setBorder(BorderFactory.createLineBorder(Color.black));
		container.add(pTop, BorderLayout.NORTH);
	
	
	
		JButton btn1 = new JButton("RED");
        btn1.setName("RED");
		btn1.addActionListener(new Border());
		//btn1.addActionListener(this);
		pTop.add(btn1);
		
        JButton btn2 = new JButton("YELLOW");
		btn2.setName("YELLOW");
		btn2.addActionListener(new Border());
		//btn2.addActionListener(this);
        pTop.add(btn2);
        
        JButton btn3 = new JButton("BLUE");
		btn3.setName("BLUE");
		btn3.addActionListener(new Border());
		//btn3.addActionListener(this);
        pTop.add(btn3);
    
	

		
		JPanel subTop = new JPanel(new FlowLayout());
		subTop.setSize(new Dimension(300, 500));
		subTop.setBorder(BorderFactory.createLineBorder(Color.black));
		pTop.add(subTop, BorderLayout.NORTH);
	
	
		JCheckBox chkTop = new JCheckBox(" Top     ");
		chkTop.setBounds(10, 10, 20, 20);
		chkTop.setName("chkTop");
		chkTop.addActionListener(new Border());   //  new BtnClickListener()
		//chkTop.addActionListener(this);
		subTop.add(chkTop);
			

			
        JButton btn4 = new JButton("GREEN");
		btn4.setName("GREEN");
		btn4.addActionListener(new Border());
		//btn4.addActionListener(this);
        pTop.add(btn4);
		
        JButton btn5 = new JButton("ORANGE");
		btn5.setName("ORANGE");
		btn5.addActionListener(new Border());
		//btn5.addActionListener(this);
        pTop.add(btn5);
		
		
        JButton btn6 = new JButton("PINK");
		btn6.setName("PINK");
		btn6.addActionListener(new Border());
		//btn5.addActionListener(this);
        pTop.add(btn6);
		
		pLeft = new JPanel(new FlowLayout());
		pLeft.setSize(new Dimension(250, 600));
		pLeft.setBorder(BorderFactory.createLineBorder(Color.black));
		container.add(pLeft, BorderLayout.LINE_START);
		
		
		JCheckBox chkLeft = new JCheckBox(" Left ");
		chkLeft.setBounds(10, 10, 20, 20);
		chkLeft.setName("chkLeft");
		chkLeft.addActionListener(new Border());
		//chkLeft.addActionListener(this);
		pLeft.add(chkLeft);
		
		
		
		
		pCenter = new JPanel(new FlowLayout());
		pCenter.setSize(new Dimension(250, 600));
		pCenter.setBorder(BorderFactory.createLineBorder(Color.black));
		container.add(pCenter, BorderLayout.CENTER);
		
		
		JCheckBox chkCenter = new JCheckBox(" Center ");
		chkCenter.setBounds(10, 10, 20, 20);
		chkCenter.setName("chkCenter");
		chkCenter.addActionListener(new Border());
		//chkCenter.addActionListener(this);
		pCenter.add(chkCenter);
		
		
		
		
		pRight = new JPanel(new FlowLayout());
		pRight.setSize(new Dimension(250, 600));
		pRight.setBorder(BorderFactory.createLineBorder(Color.black));
		container.add(pRight, BorderLayout.LINE_END);
		
		
		JCheckBox chkRight = new JCheckBox(" Right ");
		chkRight.setBounds(10, 10, 20, 20);
		chkRight.setName("chkRight");
		chkRight.addActionListener(new Border());
		//chkRight.addActionListener(this);
		pRight.add(chkRight, BorderLayout.LINE_END);
		
		
		pBottom = new JPanel(new FlowLayout());
		pBottom.setSize(new Dimension(250, 600));
		pBottom.setBorder(BorderFactory.createLineBorder(Color.black));
		container.add(pBottom, BorderLayout.PAGE_END);
		
		
		JCheckBox chkBottom = new JCheckBox(" Bottom ");
		chkBottom.setBounds(10, 10, 20, 20);
		chkBottom.setName("chkBottom");
		chkBottom.addActionListener(new Border());
		//chkBottom.addActionListener(this);
		pBottom.add(chkBottom, BorderLayout.CENTER);
		
    }
	
	
	public void actionPerformed(ActionEvent event)
	{
		JComponent comp = (JComponent)event.getSource();
		System.out.println(comp.getName() + " has been Clicked...!!!");
		//JOptionPane.showMessageDialog(null,comp.getName() + " has been Clicked...!!!");
		 
		if(event.getSource() instanceof JButton)
		{
			JButton b = (JButton)event.getSource();
			Color selectedColor = Color.WHITE;
		
			if(b.getText().equals("RED"))
				selectedColor = Color.RED;
			else if(b.getText().equals("YELLOW"))
				selectedColor = Color.YELLOW;
			else if(b.getText().equals("BLUE"))
				selectedColor = Color.BLUE;
			else if(b.getText().equals("GREEN"))
				selectedColor = Color.GREEN;
			else if(b.getText().equals("ORANGE"))
				selectedColor = Color.ORANGE;
			else if(b.getText().equals("PINK"))
				selectedColor = Color.PINK;
			
			
			if(top == 1)
			 	pTop.setBackground(selectedColor);
			
			if(left == 1)
			 	pLeft.setBackground(selectedColor);
			
			if(center == 1)
			 	pCenter.setBackground(selectedColor);
			
			if(right == 1)
			 	pRight.setBackground(selectedColor);
			
			if(bottom == 1)
			 	pBottom.setBackground(selectedColor);
		
		}
		
		else if(event.getSource() instanceof JCheckBox)
		{
			JCheckBox chk = (JCheckBox)event.getSource();
			
			if(chk.getName().equals("chkTop"))
			{
				if(chk.isSelected())
					top = 1;
				else
					top = 0;
					pTop.setBackground(jf.getBackground());
			}
			
			else if(chk.getName().equals("chkLeft"))
			{
				if(chk.isSelected())
					left = 1;
				else
					left = 0;
					pLeft.setBackground(jf.getBackground());
			}
			
			else if(chk.getName().equals("chkCenter"))
			{
				if(chk.isSelected())
					center = 1;
				else
					center = 0;
					pCenter.setBackground(jf.getBackground());
			}
			
			else if(chk.getName().equals("chkRight"))
			{
				if(chk.isSelected())
					right = 1;
				else
					right = 0;
					pRight.setBackground(jf.getBackground());
			}
			
			else if(chk.getName().equals("chkBottom"))
			{
				if(chk.isSelected())
					bottom = 1;
				else
					bottom = 0;
					pBottom.setBackground(jf.getBackground());
			}
		}	
	} 

	
	public static void main(String args[])
	{
		Border obj = new Border();
		
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");    //It Can be Multiple Look & Fill eg.Classic, etc.
		}
		catch(Exception e)
		{
			System.err.println("Look and feel not set.");
		}
		
		jf = new JFrame("MyPanel");
		
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        obj.addComponentsToPane(jf.getContentPane());
		
        jf.pack();
        jf.setVisible(true);
	}
	
	
}

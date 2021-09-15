import java.awt.Font;

import javax.swing.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
	JButton b1;
	About(){
		setBounds(600,200,700,600);
		setLayout(null);

		
		JLabel l1 =new JLabel("<html>NOTEPAD FOR WINDOWS 11<br>version 2021<br> All Rights Reserved<br>Notepad is a generic text editor included with all Notepad Application for Windows 11 allows you to create, open, and read plaintext files. <br> If the file contains"
				+ " special formatting or is not a plaintext file</html>");
		
		l1.setBounds(150,130,130,67);
		l1.setFont(new Font ("SANS_SERIF",Font.PLAIN,18));
		add(l1);
		
		b1=new JButton("OK");
		b1.setBounds(580,500,80,25);
		b1.addActionListener(this);
		add(b1);
		
				
		
	}
	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
	}
		
	


public static void main(String[] args) {
	new About().setVisible(true);
}
}
	


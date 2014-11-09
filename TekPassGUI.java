package TekPassGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class TekPassGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	//INTS/STRINGS GO HERE
	
	JTextField User = new JTextField(5);
	JTextField Pass = new JTextField(5);
	JButton button = new JButton("Set");

	
	


	

	
	public TekPassGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("TekPass");
		add(User);
		add(Pass);
		add(button);
		button.addActionListener(this);
		pack();
		setVisible(true);
		setSize(350,75);
		
	}	


    
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		
		try {
			String Home = System.getProperty("user.home");
			String uname = User.getText();
			String p = Pass.getText();
		FileWriter ryt=new FileWriter(Home + "\\Desktop\\TEKpass\\ACCs\\" + uname + ".usr" );
	    BufferedWriter out=new BufferedWriter(ryt);
		out.write(p);
		System.out.println("Saved successfully!");
		out.close();
		} catch (IOException ie) {
			System.out.println("Unable to write!");	
		}
	}
	
	
	
	
	
	
	
	
	
	
}

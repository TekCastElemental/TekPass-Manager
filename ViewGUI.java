package TekPassGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ViewGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JTextField User = new JTextField(5);
	JLabel pass = new JLabel();
	JButton button = new JButton("Show Pass");
	
	public ViewGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("TekPass");
		add(User);
		add(pass);
		add(button);
		button.addActionListener(this);
		pack();
		setVisible(true);
		setSize(350,75);
	}
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		  try{
			  // Open the file that is the first 
			  // command line parameter
			  String Home = System.getProperty("user.home");
			  String username = User.getText();
			  FileInputStream fstream = new FileInputStream(Home + "\\Desktop\\TEKpass\\ACCs\\" + username + ".usr");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
			  //Read File Line By Line
			  while ((strLine = br.readLine()) != null)   {
			  // Print the content on the console
				pass.setText(strLine);
			  }
			  //Close the input stream
			  in.close();
			    }catch (Exception ie){//Catch exception if any
			  System.err.println("Error: User not found!");
			  }
		
		
		
		
		
	}
	
}

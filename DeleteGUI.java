package TekPassGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class DeleteGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JTextField User = new JTextField(5);
	JLabel pass = new JLabel();
	JButton button = new JButton("Delete User");
	
	
	public DeleteGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("TekPass");
		add(User);
		add(pass);
		add(button);
		button.addActionListener(this);
		pack();
		setVisible(true);
		setSize(450,75);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = User.getText();
		String Home = System.getProperty("user.home");
		
		try {
			File file = new File(Home + "\\Desktop\\TEKpass\\ACCs\\" + name + ".usr");
			if(file.delete()){
    			pass.setText(file.getName() + " is deleted!");
    		}else{
    			pass.setText("Delete operation is failed.");
    		}
 
    	}catch(Exception ie){
 
    		ie.printStackTrace();
 
    	}
		}
		
		
	}



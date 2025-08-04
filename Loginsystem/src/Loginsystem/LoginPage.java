package Loginsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LoginPage implements ActionListener{
	
	JFrame frame=new JFrame();
	JButton loginButton=new JButton("login");
	JButton resetButton=new JButton("Reset");
	JTextField useriDfield= new JTextField();
	JPasswordField userpasswordfield= new JPasswordField();
	JLabel userIDLabel= new JLabel("userID:");
	JLabel userPasswordLabel= new JLabel("password:");
	JLabel messageLabel= new JLabel("This is a test.");
	
	HashMap<String,String> logininfo=new HashMap<String,String>();
	LoginPage(HashMap<String,String>loginInfoOriginal){
		loginInfoOriginal=loginInfoOriginal;
		
		userIDLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		
		messageLabel.setBounds(125, 250, 250, 35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		useriDfield.setBounds(125,100,200,25);
		userpasswordfield.setBounds(125,150,200,25);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(useriDfield);
		frame.add(userpasswordfield);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetButton) {
			useriDfield.setText("");
			userpasswordfield.setText("");
		}
		if(e.getSource()==loginButton)
		{
			String userID= useriDfield.getText();
			String password=String.valueOf(userpasswordfield.getPassword());
			
			if(logininfo.containsKey(userID))
			{
					if(logininfo.get(userID).equals(password)) 
					{
						messageLabel.setForeground(Color.green);
						messageLabel.setText("Login Successful");
						frame.dispose();
						WelcomePage welcomepage =new WelcomePage(userID);				}
					}
					else
					{
						messageLabel.setForeground(Color.red);
						messageLabel.setText("Wrong Password");
					}
			}
		else {
			messageLabel.setForeground(Color.red);
			messageLabel.setText("username not found");
		}
			
		
	}
}

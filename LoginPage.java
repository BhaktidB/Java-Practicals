package practical14;
/*
 * Expt 14 
 * name: Bhakti Bailurkar
 * rollNo.: 1
 * Aim: Program to create GUI application (Login Form)
 * 
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;

class Task extends JFrame implements ActionListener{
	
	JLabel u,p;
	JTextField txt;
	JPasswordField pass;
	JButton b;
	
	Task(){
		
	u = new JLabel("Username");	
	p = new JLabel("Password");	
	txt = new JTextField(20);
	pass = new JPasswordField(20);	
	b = new JButton("Verify");
	
	add(u);
	add(txt);
	add(p);
	add(pass);
	add(b);
	
	b.addActionListener(this);
	
	setVisible(true); 
	setSize(500,500); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	setTitle("Login Page"); 
	setLayout(new FlowLayout());  
	}
	
	public void actionPerformed(ActionEvent ae) {
		String name = txt.getText();
		char []pw1 = name.toCharArray();
        char []correct1 = new char[]{'s','e','a'};
		String[] cn = new String[] {"sea"};
		char[] pw = pass.getPassword();
		char[] correct = new char[] {'s','i','l','e','n','t'};
		if(Arrays.equals(pw,correct) && (Arrays.equals(pw1,correct1))) {
			JOptionPane.showMessageDialog(this, "Success");
			
		}else {
			JOptionPane.showMessageDialog(this, "Incorrect Password");
			
		}
	}
}

public class LoginPage {

	public static void main(String[] args) {
		
		Task t = new Task();

	}

}

package practical13;
/*Expt NO.:13 
 * Name:Bhakti Deepak Bailurkar
 * DIV: SE A
 * RollNO.: 1
 * Aim: Program on swing.
 * 
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Check extends JFrame implements ActionListener{
	JRadioButton r1,r2;
	JLabel l;
	JTextField txt;
	Check(){
		 
			r1 = new JRadioButton("Male");
			r2 = new JRadioButton("Female");
			JButton b = new JButton("Click");
			l = new JLabel("Hello World");
			txt = new JTextField(20);
			ButtonGroup bg = new ButtonGroup();
			
			add(l);
			add(txt);
			add(r1);
			add(r2);	
			add(b);
			bg.add(r1);
			bg.add(r2);
			
			b.addActionListener(this);
			
			
			
		/*
		 * setting always remain same
		 * initialization
		 */
		setVisible(true); 
		setSize(500,500); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("Checking the Gender"); 
		setLayout(new FlowLayout());  
	}
	
	public void actionPerformed(ActionEvent ae) {
		String name =txt.getText();
		if(r1.isSelected()) {
			l.setText("Mr. "+name);
			
		}else {
			l.setText("Miss. "+name);
		}
		
	}
}
public class gui {
	public static void main(String [] args) {
		Check c = new Check();
		
	}
}

package java_programs;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Name: Bhakti Deepak Bailurkar 
 * Roll: 1
 * Aim: Write a program in Swing to change the background color in Frame using two button
	(Yellow and Green).
 */
import javax.swing.*;

public class Change_Color extends JFrame implements ActionListener{

	JButton yellow,green;
	
	Change_Color(){
		
		yellow = new JButton("Yellow");
		
		green = new JButton("Green");
		
		
		add(yellow);
		add(green);
		
		yellow.addActionListener(this);
		green.addActionListener(this);
		
		setVisible(true); //set visibility true
		setSize(500,500); //set size ht and width
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the program
		setTitle("Change the Color"); // sets the title
		setLayout(new FlowLayout()); //starts new component from where it ends 
	}
	
	public static void main(String[] args) {
		Change_Color color = new Change_Color();
		
	}

	
	public void actionPerformed(ActionEvent e) {
		String click = e.getActionCommand();
		
		if(e.getSource()==yellow) {
			getContentPane().setBackground(Color.YELLOW);
		}else if(e.getSource()==green){
			getContentPane().setBackground(Color.GREEN);
		}
	}

}

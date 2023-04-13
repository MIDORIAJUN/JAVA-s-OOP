package study;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUi extends JFrame{
	public GUi() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame...");
		setLayout(new FlowLayout());
		
		JButton button = new JButton("버튼");
		add(button);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GUi g = new GUi(); 
	}

}

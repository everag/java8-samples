package br.evertonagner.java8.lambdas;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class SwingExample {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		
		JButton btn = new JButton("Press me!");
		
		btn.addActionListener((evt) -> {
			String message = "Hey!";
			
			// Closure!
			JOptionPane.showMessageDialog(frame, message);
		});
		
		btn.addActionListener(SwingExample::onButtonClicked);
		
		frame.add(btn);
		frame.setSize(200, 200);
		
		frame.setVisible(true);
	}
	
	public static void onButtonClicked(ActionEvent evt) {
		System.out.println("Method reference ;)");
	}
}

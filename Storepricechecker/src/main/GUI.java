package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener {
static String em; 
static String n; 
static String pn; 
String bn; 
String pd; 
String StoreEmail = "Ethanjhyde@gmial.com";

JFrame f = new JFrame();
JPanel p = new JPanel();
JPanel p1 = new JPanel();
JButton b = new JButton();
JTextField t = new JTextField(10);
JTextField t1 = new JTextField(10);
JTextField t2 = new JTextField(10);
JTextField t3 = new JTextField(10);
JTextField t4 = new JTextField(10);
JTextField t5 = new JTextField(10);	

	public static void main(String[] args) {
		
		
	}

	public void gui() {
		
f.setSize(200, 225);
		f.add(p);
		
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		p.add(t);
		p.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setText("Your Email");
		t1.setText("Your Name");
		t2.setText("Product Name");
		t3.setText("Brand Name");
		t4.setText("Product Description");
		b.addActionListener(this);
		b.setText("Send Request");

		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	em =	t.getText();
n =	t1.getText();
pn = t2.getText();
bn = t3.getText();
pd = t4.getText();
		sender s = new sender();
		System.out.println("Button pressed");
		s.sendSpam("ethanjhyde@gmail.com", n + " Would like to buy a "+ pn, n + " wants to buy a "+ pn + " from you. Please email back to " + e + " about pricing"+" Thank you. please do not reply to this email this is an automated email from ProductFinder");		
	}
}

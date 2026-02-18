
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Component;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;


class GUIDemo4 {

	JFrame f;
	JPanel p;
	JLabel lblUserName, lblPassword;
	JTextField txtUserName, txtPassword;


	public GUIDemo4(){

		f = new JFrame();
		p = new JPanel();

		lblUserName = new JLabel();
		txtUserName = new JTextField();
		lblPassword = new JLabel();
		txtPassword = new JTextField();

		f.setSize(500,600);
		f.setTitle("My Frame");
		f.setLocation(350,50);

		p.setLayout(null);

		lblUserName.setText("Enter the UserName : ");
		lblUserName.setBounds(50,50,150,30);
		p.add(lblUserName);

		txtUserName.setBounds(50,100,100,30);
		p.add(txtUserName);

		lblPassword.setText("Enter the Password : ");
		lblPassword.setBounds(50,150,150,30);
		p.add(lblPassword);

		txtPassword.setBounds(50,200,100,30);
		p.add(txtPassword);		

		f.add(p);
		f.setVisible(true);			

	}

	public static void main(String args[]){

		new GUIDemo4();

	}

}
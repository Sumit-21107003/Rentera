package com.apsit.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {

		     //JFrame= A GUI window to add components to
		     //JLabel= A GUI window area to display a string of Text,an Image or both
		     //JPanel= A GUI component that function as a container to hold other components	
		     
		     
		    	
		     JLabel label=new JLabel();//create a label
		     label.setText("Welcome!! to our SITE");//set text to the label
		     //label.setVerticalTextPosition(JLabel.TOP);
		     //label.setHorizontalTextPosition(JLabel.CENTER);
		     label.setForeground(new Color(160,42,42));
		     label.setFont(new Font("Paper Plane",Font.PLAIN,50));//set font of text
		     label.setHorizontalAlignment(JLabel.CENTER);//
		     label.setVerticalAlignment(JLabel.TOP);
		     
		    	
		    	
			 JFrame frame=new JFrame();//creates a frame
			 frame.setVisible(true);//make frame visible
			 frame.setTitle("Housing Management");//set Title of frame
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
			 frame.setSize(600, 500);//set x-dimension and y-dimension of frame
			 frame.getContentPane().setBackground(new Color(0xFFF1E6));//Coconut color FFF1E6, change color to the background
			 frame.add(label);//add label to the frame
			//add button to frame
			 
			 ImageIcon image=new ImageIcon("HomeManagementLogo.png");
			 frame.setIconImage(image.getImage());

			}




}

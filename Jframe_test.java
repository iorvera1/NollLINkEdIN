package NollLINkEdIN;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//Another method to make a JFrame using parent
public class Jframe_test extends JFrame{
	
	Jframe_test(){
		
		this.setTitle("Title Goes here");//sets Title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Code for exit application
		this.setResizable(false);
		this.setSize(420, 420);//sets the x-dimensions, and y-diemensions of this
		this.setVisible(true);//makes this visible
		ImageIcon Image = new ImageIcon("Wallpaper_Test.png");//creates an Image icon
		this.setIconImage(Image.getImage());//changes icon of this
		this.getContentPane().setBackground(new Color(200,200,244));//change color of backgrounds with hex codes i.e (0x000000)
	
        
	}

}

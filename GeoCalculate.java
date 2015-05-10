import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class GeoCalculate extends JFrame implements ActionListener{
	private Circle circle = new Circle();
	private JFrame circleFrame = new JFrame();
	JButton circleButton = new JButton("Circle");
	JButton squareButton = new JButton("Square");
	JButton rectangleButton = new JButton("Rectangle");
	JPanel p1,p2,p3,p4,p5;
	
	
	GeoCalculate(){
	  p1 = new JPanel(new GridLayout(1,2));
	  p1.add(circleButton);
	  circleButton.addActionListener(this);  
	  p2 = new JPanel(new GridLayout(1,2));
	  p2.add(squareButton);
		  
	  p3 = new JPanel(new GridLayout(1,2));
	  p3.add(rectangleButton);
	  	
	  p4 = new JPanel();
	  p4.add(p1,BorderLayout.NORTH);
	    p4.add(p2,BorderLayout.CENTER);
	    p4.add(p3,BorderLayout.SOUTH);
	    p5 = new JPanel();
	    Label word = new Label("請選擇要計算的類型--");
	    Font font = new Font(Font.MONOSPACED, Font.PLAIN, 20);
	    word.setFont(font);
	    p5.add(word,BorderLayout.CENTER);
	    p5.add(p4,BorderLayout.SOUTH);
		
		  add(p5,BorderLayout.CENTER);
	}

        @Override
	  public void actionPerformed(ActionEvent e) {
	  	// TODO Auto-generated method stub
	  	  if(e.getSource() == circleButton){
	  		 circleFrame.add(circle);
	  		 circleFrame.setLocationRelativeTo(null);
	  		 circleFrame.setTitle("U10316005_GeoCalculate");
	  		 circleFrame.setSize(360, 300);
	  		 circleFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	  		 circleFrame.setVisible(true);
	  	  }
	  	  
	  }
	 
	 
	public static void main(String[] args){
		GeoCalculate frame = new GeoCalculate();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("U10316005_GeoCalculate");
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}

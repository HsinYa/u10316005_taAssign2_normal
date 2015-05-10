import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Square extends JPanel implements ActionListener{
	private JTextField jftLength = new JTextField();
	private JTextField jftArea = new JTextField();
	private JTextField jftPerimeter = new JTextField();
	JButton calculate = new JButton("計算");
	JButton clear = new JButton("清除");
	JPanel p1,p2,p4;
	
	public Square(){
		p1 = new JPanel(new FlowLayout());
		Label word = new Label("<Square>");
		Font font = new Font(Font.DIALOG, Font.BOLD, 15);
		word.setFont(font);
		p1.add(word,FlowLayout.LEFT);
		this.add(p1,FlowLayout.LEFT);
		p2 = new JPanel(new GridLayout(1,4));
		Label word2 = new Label("Length:");
		word2.setFont(font);
		p2.add(word2);
		p2.add(jftLength);
		p2.add(calculate);
		p2.add(clear);
		this.add(p2,BorderLayout.CENTER);
		p4 = new JPanel(new GridLayout(2,2));
		Label word3 = new Label("The area is:");
		word3.setFont(font);
		p4.add(word3);
		p4.add(jftArea);
		Label word4 = new Label("The perimeter is:");
		word4.setFont(font);
		p4.add(word4);
		p4.add(jftPerimeter);
		this.add(p4,BorderLayout.SOUTH);
		
		calculate.addActionListener(this);
		clear.addActionListener(this);
	}
	
	@Override
	  public void actionPerformed(ActionEvent e) {
	  	// TODO Auto-generated method stub
	  	  if(e.getSource() == calculate){
	  		 double l = Double.parseDouble(jftLength.getText());
	  		 double area = l*l;
	  		 double perimeter = l*4;
	  		 
	  		jftArea.setText(String.format("%.2f", area));
	  		jftPerimeter.setText(String.format("%.2f", perimeter));
	  	  }
	  	  else if(e.getSource() == clear){
	  		jftLength.setText("");
	  		jftArea.setText("");
	  		jftPerimeter.setText("");
	  	  }
	  }
}

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class SwingDemo extends JFrame implements ActionListener{
	
	public JLabel lbl;
	public JButton redBtn;
	public JButton greenBtn;
	public JButton blueBtn;
	
	public SwingDemo(){
		
		lbl = new JLabel("Core Java Programming");
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl.setOpaque(true);
		redBtn = new JButton("Red");
		greenBtn = new JButton("Green");
		blueBtn = new JButton("Blue");
		setSize(400, 400);
		setLayout(new FlowLayout());
		redBtn.addActionListener(this);
		greenBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		add(lbl);
		add(redBtn);
		add(greenBtn);
		add(blueBtn);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String color = ae.getActionCommand();
		System.out.println(color);
		
		if(color.equalsIgnoreCase("Red")) {
			lbl.setBackground(Color.RED);
		}
		else if(color.equalsIgnoreCase("Green")) {
			lbl.setBackground(Color.GREEN);
		}
		else {
			lbl.setBackground(Color.BLUE);
		}	
	}
}
public class Program26 
{

	public static void main(String args[]) {
		
		new SwingDemo();
	}
}

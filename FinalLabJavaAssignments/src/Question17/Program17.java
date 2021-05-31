import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFrame;

class AWTDemo1 extends JFrame{
	
	public AWTDemo1() {
		Label nameLbl = new Label("Your Name :");
		Label clsLbl = new Label("Your Class");
		Label hobLbl = new Label("Your Hobbies");
		TextField txt = new TextField(15);
		
		CheckboxGroup cbg = new CheckboxGroup();  
		Checkbox mcaI = new Checkbox("MCA-I", cbg, false);
		Checkbox mcaII = new Checkbox("MCA-II", cbg, false);
		Checkbox mcaIII = new Checkbox("MCA-III", cbg, false);
		Checkbox music = new Checkbox("Music", false);  
		Checkbox dance = new Checkbox("Dance", false); 
		Checkbox sports = new Checkbox("Sports", false); 
		setSize(400,400); 
		setLayout(new FlowLayout());
		add(nameLbl);
		add(txt);
		add(clsLbl);
		add(hobLbl);
		add(mcaI);
		add(music);
		add(mcaII);
		add(dance);
		add(mcaIII);
		add(sports);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}


public class Program17 {

	public static void main(String[] args) {
		
		new AWTDemo1();
	}

}

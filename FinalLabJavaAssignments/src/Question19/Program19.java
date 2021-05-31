import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JList;

class FrameDemo2 extends JFrame{
	
	JList<String> listItems;
	
	public FrameDemo2() {
		
		String items[]= { "Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7"};
		listItems = new JList<String>(items);
		setLayout(new FlowLayout());
		add(listItems);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		listItems.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				if(me.getClickCount()==2){
		            System.out.println("Selected Index : " + (listItems.getSelectedIndex()+1));
		        }
			}
		});
		setVisible(true);
	}
}

public class Program19
{

	public static void main(String args[]) {
		
		new FrameDemo2();
	}
}

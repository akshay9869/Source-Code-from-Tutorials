import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui extends JFrame {
	private JButton regular;
	private JButton custom;
	
	public Gui(){
		super("Title");
		setLayout(new FlowLayout());
		regular = new JButton("Regular Button");
		add(regular);
		
		Icon b = new ImageIcon(getClass().getResource("p.png"));
		Icon x = new ImageIcon(getClass().getResource("wp.png"));
		custom = new JButton("Custom Button",b);
		custom.setRolloverIcon(x);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		regular.addActionListener(handler);
		custom.addActionListener(handler);
		
	}
	private class HandlerClass implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
			
		}
		
	}
	
	
	

}

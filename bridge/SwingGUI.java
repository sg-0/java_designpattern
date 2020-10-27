package bridge2;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SwingGUI extends JFrame implements GUI_Imp{

	Container cp;
	JLabel label;
	
	public SwingGUI(){
		initGUI();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@SuppressWarnings("static-access")
	public void initGUI(){
		cp = this.getContentPane();
		label = new JLabel();	
		setTitle("Swing-GUI");
		setSize(230,260);
		label.setHorizontalAlignment(label.CENTER);
		cp.add(label);
	}

	@Override
	public void drawPoint(int x, int y) {
		JPanel p = new JPanel();
		p.setSize(5, 5);
		p.setBackground(Color.BLACK);
		p.setLocation(x, y);
		p.setVisible(true);
		label.add(p);
	}
	public void repaint(){
		cp.repaint();
	}

}

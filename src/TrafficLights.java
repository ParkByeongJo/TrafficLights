import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyPanel extends JPanel implements ActionListener{
	boolean flag=false;
	private int light_number=0;
	
	public MyPanel() {
		setLayout(new BorderLayout());
		JButton b=new JButton("½ÅÈ£µî ÄÑÁü");
		b.addActionListener(this);
		this.add(b, BorderLayout.SOUTH);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		if(light_number==0) {
			g.setColor(Color.RED);
			g.fillOval(100, 100, 100, 100);
		}else if(light_number==1) {
			g.setColor(Color.GREEN);
			g.fillOval(100, 200, 100, 100);
		}else if(light_number==2) {
			g.setColor(Color.YELLOW);
			g.fillOval(100, 300, 100, 100);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(++light_number>=3) {
			light_number=0;
		}
		repaint();
	}
}
public class TrafficLights extends JFrame{
	
	public TrafficLights() {
		this.add(new MyPanel());
		this.setSize(300, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TrafficLights();

	}

}

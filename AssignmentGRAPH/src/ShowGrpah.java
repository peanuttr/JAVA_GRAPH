import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowGrpah extends JFrame implements ActionListener{
	
	private Container  c;
	private JButton rndbtn;
	private drawGraph dg;
	
	public static void main(String[] args) {
		//Method เมน ใช้เรียก Method Constructor
		new ShowGrpah();
	}
	public ShowGrpah(){
		//Method Constructor ที่ใช้ในการสร้าง หน้าต่าง GUI
		super("GRAPH");
		c = getContentPane();
		c.setLayout(new FlowLayout());
		rndbtn=new JButton(" >> Random << ");
		rndbtn.addActionListener(this);
		c.add(rndbtn);
		
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		dg = new drawGraph();
	}
	@Override
	public void actionPerformed(ActionEvent evn) {
		//Method ใช้สำหรับเช็ค Action ในการกดปุ่ม
		if(evn.getSource()==rndbtn) repaint();
	}
	public void paint(Graphics g) {
		//Method ไว้วาดกราฟลง หน้าต่าง GUI
		super.paint(g);
		dg.setHeight(0,200);
		dg.draw(g);
	}

}

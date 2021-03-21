import java.awt.Color;
import java.awt.Graphics;

public class drawGraph {
	
	private int height[] = new int [5];
	public drawGraph(){
		//Method แบบ constructor
		
	}
	public void setHeight(int n1,int n2) {
		//Method ที่ใช้ทำการ  set ค่าความสูงของกราฟ
			for(int n=0;n<height.length;n++) {
				this.height[n]= n1 + (int) (Math.random()*n2);
			}
	}
	public int[] getHeight() {
		//Method ที่ใช้สำหรับรับค่าความสูงของกราฟ
		return this.height ;
	}
	public void draw(Graphics g) {
		//Method ที่ใช้สำหรับการวาดเส้นความสูงกราฟและกราฟและชื่อของกราฟ
		g.drawLine(50, 80, 50, 300);
		g.drawLine(50, 300, 350, 300);
		g.drawString("A", 100, 315);
		g.drawString("B", 155, 315);
		g.drawString("C", 205, 315);
		g.drawString("D", 260, 315);
		g.drawString("F", 315, 315);
		g.drawString("0", 40, 300);
		g.drawString("50", 35, 250);
		g.drawString("100", 29, 200);
		g.drawString("150", 29, 150);
		g.drawString("200", 29, 100);
		
		g.setColor(Color.YELLOW);
		g.fillRect(80, 300-height[0], 50, height[0]);
		g.setColor(Color.PINK);
		g.fillRect(135, 300-height[1], 50, height[1]);
		g.setColor(Color.RED);
		g.fillRect(190, 300-height[2], 50, height[2]);
		g.setColor(Color.GREEN);
		g.fillRect(245, 300-height[3], 50, height[3]);
		g.setColor(Color.BLUE);
		g.fillRect(300, 300-height[4], 50, height[4]);
		
	}
}

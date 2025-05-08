import java.awt.*;
import java.applet.*;
public class awt extends Applet
{
	public void paint(Graphics g)
		{
			g.setColor(Color.green);
			g.drawLine(10,10,80,10);
			g.setColor(Color.red);
			g.drawOval(60,60,50,70);
			g.setColor(Color.blue);
			g.drawRect(200,200,250,120);
		}
}

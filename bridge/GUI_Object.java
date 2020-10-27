package bridge2;

public abstract class GUI_Object{
	
	private GUI_Imp g;

	public GUI_Object(GUI_Imp g){
		this.g = g;
	}

	public void drawLine(int x1, int y1, int x2, int y2){
		if(Math.abs(x1-x2) < 2 && Math.abs(y1-y2) < 2){
			g.drawPoint(x1, y1);
			g.drawPoint(x2, y2);
		}
		else{
			int middleX = (x1+x2)/2;
			int middleY = (y1+y2)/2;
			drawLine(x1,y1,middleX,middleY);
			drawLine(middleX,middleY,x2,y2);
		}
	}
}

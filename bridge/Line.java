package bridge2;


public class Line extends GUI_Object{
	
	public Line(GUI_Imp guiImp, int x1, int y1, int x2, int y2) {
		super(guiImp);
		super.drawLine(x1, y1, x2, y2);
	}

}

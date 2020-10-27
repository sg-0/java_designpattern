package bridge2;


public class Rectangle extends GUI_Object{
	
	public Rectangle(GUI_Imp guiImp) {
		super(guiImp);
	}
	public void draw(int x, int y, int length, int width){
		super.drawLine(x, y, x+length, y);
		super.drawLine(x+length, y, x+length, y+width);
		super.drawLine(x+length, y+length, x, y+length);
		super.drawLine(x, y+length, x, y);
	}

}

package bridge2;

public class Console implements GUI_Imp{
	
	int length,width;
	String [][] array;
	
	public Console(int length, int width){
		this.length = length;
		this.width = width;
		array = new String[length][width];	
		for (int i=0; i < length; i++){
			for (int j=0; j < width; j++){
				array[i][j]= " ";
			}
		}
	}
	
	@Override
	public void drawPoint(int x, int y) {
		array[x][y] = "x";
	}
	
	public void print(){
		for (int i=0; i < length; i++){
			for (int j=0; j < width; j++){
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
	}

}

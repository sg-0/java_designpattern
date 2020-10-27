package bridge2;


public class Client {
      
       public static void demo(GUI_Imp g) {
             Rectangle rect = new Rectangle(g);
             int x = 10, y = 10, length = 200, with = 200;
             for (int i = 0; i < 10; i++){
                    rect.draw(x, y, length, with);
                   
                    x += 10; y += 10;
                    length -= 20; with -= 20;
             }           
       }
      
       public static void main(String[] args) {
            
             SwingGUI swing = new SwingGUI();
             Console console = new Console(220,220);
             demo(swing);
             swing.repaint();
             demo(console);
             console.print();
       }
}

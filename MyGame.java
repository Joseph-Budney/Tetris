import java.awt.Color;
//import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MyGame extends Game  {
    public static final String TITLE = "MyGame";
    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 400;

    // declare variables here

    boolean[][] grid;
    Block activeBlock;

    public MyGame() {
        // initialize variables here
        grid = new boolean[20][10];
        activeBlock = new Block();
    }
    
    public void update(){
        // updating logic
        //everySecond.schedule(task,);
        activeBlock.update(grid);
    }
    
    public void draw(Graphics pen) {
        pen.setColor(Color.GRAY);
        for(int row = 0; row<grid.length; row++){
            for(int col = 0; col<grid[0].length; col++){
                pen.drawRect(SCREEN_WIDTH+25*col, SCREEN_HEIGHT+25*row, 25, 25);
                if(grid[row][col]){
                    pen.fillRect(SCREEN_WIDTH+25*col, SCREEN_HEIGHT+25*row, 25, 25);
                }
            }
        }   
    }
        
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == 68){
            activeBlock.right(grid);
        }
        if(ke.getKeyCode() == 65){
            activeBlock.left(grid);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {}

    @Override
    public void mouseClicked(MouseEvent ke) {}

    @Override
    public void mousePressed(MouseEvent me) {}
    
    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
        
        
    //Launches the Game
    public static void main(String[] args) { new MyGame().start(TITLE, SCREEN_WIDTH,SCREEN_HEIGHT); }
}
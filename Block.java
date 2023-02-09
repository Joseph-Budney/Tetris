import java.awt.Graphics;
public class Block{

    public static boolean block;
    public int Xpos;
    public int Ypos;
    long start;
    long end;

    public Block(){
        block = true;
        Ypos = 0;
        Xpos = 4;
    }
    public void draw(Graphics pen) {

    }
    public void update(boolean[][] grid){
        grid[Ypos][Xpos] = true;
        if(Ypos <19){
            end = System.currentTimeMillis();
            if(end-start>2000){
                grid[Ypos][Xpos] = false;
                Ypos++;
                start = System.currentTimeMillis();
            }
            System.out.println(end-start);
        }
    }
    public void left(boolean[][] grid){
        if(Xpos>0){
            grid[Ypos][Xpos] = false;
            Xpos--;
        }
    }
    public void right(boolean[][] grid){
        if(Ypos <19){
            grid[Ypos][Xpos] = false;
            Xpos++;
        }
    }

}
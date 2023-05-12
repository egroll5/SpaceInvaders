import mayflower.*;

public class Player extends Master
{
    public Player(){
        super("player1");
    }
    public void draw(){
    
    }
    public void move(){
        
    }
    public boolean collision(){
        return false;
    }
    public void act(){
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        Laser l = new Laser();
        if(Mayflower.isKeyDown(Keyboard.KEY_RIGHT) && getX() < 700){
            setLocation(x+5, y);
        } else if(Mayflower.isKeyDown(Keyboard.KEY_LEFT) && getX()> 0){
            setLocation(x - 5, y);
        }else if(Mayflower.isKeyDown(Keyboard.KEY_SPACE)){
            //MyWorld m = new MyWorld( getX(), getY()-100);
            World wo = getWorld();
            l.scale(0.4);
            wo.addObject(l, getX(), getY()-100);
            
        }
    }
}

import mayflower.*;

public class MyWorld extends World
{   
    public MyWorld(){
        setBackground("img/space.jpg");
        Player p1 = new Player();
        addObject(p1, 400, 500); 
        
        Alien p2 = new Alien();
        addObject(p2, 200, 200);
        p2.scale(0.4);
        
    }
    public void act(){
    
    }
}

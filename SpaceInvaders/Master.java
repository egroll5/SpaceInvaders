import mayflower.*;

public class Master extends Actor
{
    public Master(String s){
        MayflowerImage p =  new MayflowerImage("img/"+s+".png");
        p.scale(0.5);
        setImage(p);
    }
    public void act(){
    
    }
}

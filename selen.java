import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class selen extends Actor
{
    private static final GreenfootImage terbang1 = new GreenfootImage("sigajah.png");
    private static final GreenfootImage terbang2 = new GreenfootImage("sigajah2.png");
    private int speedtrb = 5;
    private boolean trb = false;
    private int arah = 1;
    int frame = 0;
    public int scorecount=0;
    
    public void act()
    {
        jalan();
        tembak();
        kena();
        //taunting();
    }
    public void jalan()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            trb = true;
            arah = 1;
            move(speedtrb);
            if(trb = true)
            {
                trbb();
            }

        }
                     
        if(Greenfoot.isKeyDown("a"))
        {
            trb = true;
            arah = -1;
            move(speedtrb * -1);
            if(trb = true)
            {
                trbb();
            }

        } 
        if(Greenfoot.isKeyDown("w")){
            trb = true;
            setLocation(getX(), getY()-5);
            if(trb = true)
            {
                trbb();
            }
        }
        if(Greenfoot.isKeyDown("s")){
            trb = true;
            setLocation(getX(), getY()+5);  
            if(trb = true)
            {
                trbb();
            }
        }

    }
    public void trbb()
    {
        if(frame == 1)
        {
            setImage(terbang2);
        }
        if(frame == 6)
        {
            setImage(terbang1);
            
        }
        if(frame == 12)
        {
            setImage(terbang2);
            frame = 0;
        }
        frame++;
    }
    public void tembak(){
         if(Greenfoot.isKeyDown(    "space")) {
           getWorld().addObject(new bullets(), getX()+60, getY());
        }
    }
    public void kena(){
        tikus c =(tikus)getOneIntersectingObject(tikus.class);
        if (c!=null){
            getWorld().removeObject(c);
            level_1.health.add(-1);
            level_2.health.add(-1);
            level_3.health.add(-1);
            level_4.health.add(-1);
        }
        kacang e =(kacang)getOneIntersectingObject(kacang.class);
        if (e!=null){
            getWorld().removeObject(c);
            level_2.peanut.add(1);
            level_4.peanut.add(1);
        }
        koin s =(koin)getOneIntersectingObject(koin.class);
        if (s!=null){
            getWorld().removeObject(c);
            level_3.koin.add(1);
            level_4.koin.add(1);
        }
    }
    
}

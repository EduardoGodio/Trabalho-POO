import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Iniciar extends World
{
    public Iniciar()
    {    
        super(600, 400, 1); 
        addObject(new Formiga(), 100, 200);
        int c = 0;
        while(c < 5){
            double x = Math.random() * 600;
            double y = Math.random() * 400;
            int cupcakex = (int)x;
            int cupcakey = (int)y;
            addObject(new Cupcake(), cupcakex, cupcakey);
            c++;
        }
    }
}

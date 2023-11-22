import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Iniciar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Iniciar extends World
{

    /**
     * Constructor for objects of class Iniciar.
     * 
     */
    public Iniciar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
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

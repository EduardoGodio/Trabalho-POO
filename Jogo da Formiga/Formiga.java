import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Formiga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Formiga extends Actor
{
    int qtd = 0;
    public void act()
    {
        move(3);
        if(Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(5);
        }
        if(isTouching(Cupcake.class)){
          comerCupcake();  
        }
    }
    public void comerCupcake(){
        removeTouching(Cupcake.class);
        qtd++;
        getWorld().showText("Cupcakes: " + qtd, 100, 30);
        double x = Math.random() * 600;
        double y = Math.random() * 400;
        int cupcakex = (int)x;
        int cupcakey = (int)y;
        getWorld().addObject(new Cupcake(), cupcakex, cupcakey);
        if(qtd == 1){
            criarSapo();
        }
        if(qtd == 5){
            criarSapo();
        }
        if(qtd == 10){
            criarSapo();
        }
        if(qtd == 15){
            criarSapo();
        }
        if(qtd == 20){
            criarSapo();
        }
        if(qtd == 25){
            criarSapo();
        }
        if(qtd == 30){
            criarSapo();
        }
        }
    public void criarSapo(){
        double sx = Math.random() * 600;
        double sy = Math.random() * 400;
        int sapox = (int)sx;
        int sapoy = (int)sy;
        getWorld().addObject(new Sapo(), sapox, sapoy);
    }
    }

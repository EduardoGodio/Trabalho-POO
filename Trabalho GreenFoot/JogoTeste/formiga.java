import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class formiga extends Actor
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
        if(isTouching(cupcake.class)){
          comerCupcake();  
        }
    }
    public void comerCupcake(){
        removeTouching(cupcake.class);
        qtd++;
        getWorld().showText("Cupcakes: " + qtd, 100, 30);
        if(qtd == 2){
            cupcake c = new cupcake();
        }
        }
    }

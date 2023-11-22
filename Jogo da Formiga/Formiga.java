import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Formiga extends Actor
{
    int qtd = 0, proj = 0, rot;
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
        atirarProjetil();
    }
    public void atirarProjetil(){
        if(Greenfoot.isKeyDown("space")){
            Projetil p = new Projetil();
            getWorld().addObject(p, getX(), getY());
            p.setRotation(getRotation());
        }
    }
    public void comerCupcake(){
        removeTouching(Cupcake.class);
        qtd++;
        proj++;
        getWorld().showText("Cupcakes: " + qtd, 100, 30);
        double x = Math.random() * 600;
        double y = Math.random() * 400;
        int cupcakex = (int)x;
        int cupcakey = (int)y;
        getWorld().addObject(new Cupcake(), cupcakex, cupcakey);
        if(qtd == 1 || qtd % 5 == 0){
            criarSapo();
        }
        if(proj % 5 == 0){
            getWorld().showText("Projetil: Pronto", 100, 60);
        } else{
            getWorld().showText("Projetil: Preparando", 100, 60);
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

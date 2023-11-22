import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Formiga extends Actor
{
    int qtd = 0, proj = 0;
    boolean atirar;
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
        getWorld().showText("Cupcake: " + qtd, 110, 30);
        if(proj >= 5){
            getWorld().showText("Projetil ("+ proj +"): Pronto", 110, 60);
        } else{
            getWorld().showText("Projetil ("+ proj +"): Preparando", 110, 60);
        }
    }
    public void atirarProjetil(){
        if(Greenfoot.isKeyDown("space") && proj >= 5 && atirar == true){
            Projetil p = new Projetil();
            getWorld().addObject(p, getX(), getY());
            p.setRotation(getRotation());
            proj -= 5;
            atirar = false;
        } else if(!Greenfoot.isKeyDown("space")){
            atirar = true;
        }
    }
    public void comerCupcake(){
        removeTouching(Cupcake.class);
        qtd++;
        proj++;
        if(proj == 6){
            proj--;
        }
        double x = Math.random() * 600;
        double y = Math.random() * 400;
        int cupcakex = (int)x;
        int cupcakey = (int)y;
        getWorld().addObject(new Cupcake(), cupcakex, cupcakey);
        if(qtd == 1 || qtd % 5 == 0){
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

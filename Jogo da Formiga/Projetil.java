import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Projetil extends Actor
{
    public void act()
    {
        movimentoProjetil();
        removerMapa();
    }
    public void movimentoProjetil(){
        move(5);
    }
    public void removerMapa(){
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}

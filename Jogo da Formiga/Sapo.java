import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sapo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sapo extends Actor
{
    /**
     * Act - do whatever the Sapo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Formiga.class)){
            comerFormiga();
        }
        turn(3);
        move(3);
    }
    public void removerTudo() {
        java.util.List<Actor> atoresNoMundo = getWorld().getObjects(Actor.class);
        for (Actor ator : atoresNoMundo) {
            if (ator instanceof Sapo || ator instanceof Cupcake) {
                GreenfootImage imagemAtor = ator.getImage();
                GreenfootImage imagemInvisivel = new GreenfootImage
                                                (imagemAtor.getWidth(), 
                                                 imagemAtor.getHeight());
                imagemInvisivel.setTransparency(0);
                ator.setImage(imagemInvisivel);
            }
        }
    }
    public void comerFormiga(){
        removeTouching(Formiga.class);
        removerTudo();
        getWorld().showText("Fim de jogo!", 300, 200);
    }
}

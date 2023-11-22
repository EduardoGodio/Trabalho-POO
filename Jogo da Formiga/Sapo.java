import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Sapo extends Actor
{
    int virarSapo, andarSapo;
    public void act()
    {
        if(isTouching(Formiga.class)){
            comerFormiga();
        }
        if(Greenfoot.getRandomNumber(12) <= 3){
            andarSapo();
            turn(virarSapo);
            move(andarSapo);
        } else if(Greenfoot.getRandomNumber(12) <= 6){
            andarSapo();
            turn(virarSapo);
            move(andarSapo);
        } else if(Greenfoot.getRandomNumber(12) <= 6){
            andarSapo();
            turn(virarSapo);
            move(andarSapo);
        } else{
            andarSapo();
            turn(virarSapo);
            move(andarSapo);
        }
        if(isTouching(Projetil.class)){
            getWorld().removeObject(this);
        }
    }
    public void andarSapo(){
        Random random = new Random();
        double virar = random.nextInt(4) + 2;
        double andar = random.nextInt(4) + 2;
        virarSapo = (int)virar;
        andarSapo = (int)andar;
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

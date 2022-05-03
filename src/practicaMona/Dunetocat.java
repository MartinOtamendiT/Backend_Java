package practicaMona;

import java.awt.*;

public class Dunetocat extends Octocat{
    private String suit;
    private String weapon;

    public Dunetocat(String name){
        super(name,"Dunetocat",103);
        super.setBodyColor(88,88,88);
        super.setFaceColor(207,163,108);
        super.setEyesColor(65,130,208);
        suit="destiltraje";
        weapon="crys";
    }

    public void useVoice(String order){
        System.out.println("TE ORDENO:"+order);
    }
    public void seeFuture(){
        int i=(int)(Math.random()*3);
        String phrases[]={"Encontraremos a los Fremen.","Sere el Kwisatz Haderach.","Arrakis sera un paraiso."};
        System.out.println("Veo en el futuro: "+phrases[i]);
    }
    public void fight(){
        System.out.println("Preparando "+weapon+"... Atacando...");
    }
}

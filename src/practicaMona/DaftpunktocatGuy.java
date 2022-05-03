package practicaMona;
import java.awt.*;

public class DaftpunktocatGuy extends Octocat{
    private String suit;
    private Color helmet;
    private boolean helmetLights;
    public DaftpunktocatGuy(String name){
        super(name,"Daftpunktocat-Guy",99);
        super.setOriginalColors();
        suit="traje elegante";
        helmet=new Color(247,187,63);
        helmetLights=true;
    }

    public void switchLights(boolean state){
        helmetLights=state;
        if(state==true)
            System.out.println("Luces del casco encendidas");
        else
            System.out.println("Luces del casco apagadas");
    }
    public void playSong(){
        int i=(int)(Math.random()*5);
        String songs[]={"One More Time",
                "Instant Crush",
                "Harder, Better, Faster, Stronger",
                "Get Lucky",
                "Around the World"};
        System.out.println("Tocando: "+songs[i]);
    }
    public void dance(String song){
        System.out.println("Bailando al ritmo de "+song);
    }
}

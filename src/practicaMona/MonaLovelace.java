package practicaMona;
import java.awt.*;

public class MonaLovelace extends Octocat{
    private Color hairColor;
    private Color dressColor;
    public MonaLovelace(String name){
        super(name,"Mona Lovelace",129);
        super.setOriginalColors();
        hairColor=new Color(80,42,19);
        dressColor=new Color(221,192,238);
    }

    public void createAlgorithm(){
        System.out.println("Un momento por favor, creando algoritmo...");
        System.out.println("\tAlgoritmo creado con exito");
    }

    public void readBook(){
        System.out.println("Leyendo libro...");
    }

    public void sayPhrase(){
        int i=(int)(Math.random()*3);
        String phrases[]={"La religión para mí es ciencia y la ciencia es religión.",
                "La imaginación es la facultad del descubrimiento, preeminentemente.",
                "Este cerebro mío es más que meramente mortal como el tiempo lo demostrará."};
        System.out.println(name+" Lovelace dice:\n\t"+phrases[i]);
    }
}

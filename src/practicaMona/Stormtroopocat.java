package practicaMona;

public class Stormtroopocat extends Octocat{
    private String suit;
    private String helmet;
    private String weapon;
    public Stormtroopocat(String name){
        super(name,"Stormtroopocat",84);
        super.setOriginalColors();
        suit="traje de Stormtrooper";
        helmet="Stormtrooper imperial";
        weapon="blaster";
    }

    public void shoot(int disparos){
        System.out.print("Disparando: ");
        for(int i=0;i<disparos;i++)
            System.out.print("PIU ");
        System.out.print("!!!\n");
    }
    public void arrest(){
        System.out.println("Estas bajo arresto, escoria rebelde.");
    }
    public void exploreArea(String planet){
        System.out.println("Explorando area en el planeta "+planet+"...");
        System.out.println("\tArea despejada.");
    }
}

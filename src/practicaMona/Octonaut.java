package practicaMona;

public class Octonaut extends Octocat{
    private String suit;
    private String helmet;
    public Octonaut(String name){
        super(name,"Octonaut",15);
        super.setOriginalColors();
        suit="traje espacial";
        helmet="casco espacial";
    }

    public void explorePlanet(String planet){
        System.out.println("Explorando al planeta "+planet+"...");
    }
    public void driveSpaceship(boolean lightspeed){
        System.out.println("Viajando en mi nave espacial.");
        if(lightspeed==true)
            System.out.println("\tActivando velocidad luzzz............");
    }
    public void antigravityMode(boolean state){
        if(state==true)
            System.out.println("Flotando en modo antigravedad =).");
        else
            System.out.println("Antigravedad desactivada =(.");
    }
}

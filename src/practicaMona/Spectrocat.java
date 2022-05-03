package practicaMona;

public class Spectrocat extends Octocat{
    private String suit;
    public Spectrocat(String name){
        super(name,"Spectrocat",44);
        super.setBodyColor(170,170,170);
        super.setFaceColor(170,170,170);
        super.setEyesColor(228,228,228);
        suit="sabana fantasmal";
    }

    @Override
    public void move(){
        System.out.println("Me desplazo flotando...");
    }
    public void scare(){
        System.out.println("BOOOOOOO!!! Soy un fantasmaaaa!!!");
    }
    public void haunt(String target){
        System.out.println("Embrujando "+target+" ...");
        System.out.println("\tEl objeto "+target+" ha sido embrujado.");
    }
    public void fly(){
        System.out.println("Me encanta volaaaarrr!!!!!!");
    }
}

package practicaHarry;

public class Wizard {
    private String name;
    private String house;
    private String gender;
    private String birthplace;
    private String patronus;
    private String boggart;

    public Wizard(){
        name=" ";
        house="Undefined";
        gender="Unknown";
        birthplace="Unknown";
        patronus="Unknown";
        boggart="Unknown";
    }

    public Wizard(String name, String house, String gender, String birthplace, String patronus, String boggart){
        this.name=name;
        this.house=house;
        this.gender=gender;
        this.birthplace=birthplace;
        this.patronus=patronus;
        this.boggart=boggart;
    }

    public Wizard(String name, String gender, String birthplace){
        this.name=name;
        this.gender=gender;
        this.birthplace=birthplace;
    }

    public Wizard(String name, String house, String gender, String birthplace){
        this.name=name;
        this.house=house;
        this.gender=gender;
        this.birthplace=birthplace;
    }

    public void setAttributes(String name, String house, String gender, String birthplace, String patronus, String boggart){
        this.name=name;
        this.house=house;
        this.gender=gender;
        this.birthplace=birthplace;
        this.patronus=patronus;
        this.boggart=boggart;
    }
    public void setPatronus(String patronus){
        this.patronus=patronus;
    }
    public void setBoggart(String boggart){
        this.boggart=boggart;
    }
    public void setHouse(String house){
        this.house=house;
    }

    @Override
    public String toString() {
        return "**************************************************\n"+
                "The wizard is " + name +
                "\nHouse: " + house +
                "\nGender: " + gender +
                "\nBirthplace: " + birthplace +
                "\nPatronus: " + patronus +
                "\nBoggart: " + boggart ;
    }

    public static void main(String[] args) {
        Wizard wizards[] = new Wizard[5];

        //Creating Wizards
        wizards[0]= new Wizard("Newt Scamander","Hufflepuff","Male",
                "England, Great Britain", "Unknown","To work in a office");
        wizards[1]= new Wizard("Tina Goldstein","Thunderbird","Female",
                "United States of America", "Unknown","Unknown");
        wizards[2]= new Wizard("Hermione Granger","Gryffindor","Female",
                "England, Great Britain", "Otter",
                "Professor McGonagall informing her that she failed her exams");
        wizards[3]= new Wizard("Harry Potter","Gryffindor","Male",
                "Godric's Hollow, West Country, England, Great Britain", "Stag",
                "Dementor");
        wizards[4]= new Wizard("Tom Marvolo Riddle","Slytherin","Male",
                "London, England, Great Britain", "Unknown",
                "His own corpse");

        //Print Wizards
        for(int i=0; i<5; i++){
            System.out.println(wizards[i].toString());
        }
    }
}

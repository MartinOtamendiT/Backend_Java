package practicaMona;

public class testOctocats {
    public static void main(String[] args) {
        System.out.println("*******************************************************");
            Octocat Mona=new Octocat("Mona");
            Mona.greet();
            Mona.move();
        System.out.println("*******************************************************");
            Dunetocat duneMona=new Dunetocat("Mona Atreides");
            duneMona.greet();
            duneMona.seeFuture();
            duneMona.fight();
            duneMona.useVoice("Mejoraras este codigo");
        System.out.println("*******************************************************");
            Spectrocat specter=new Spectrocat("Mona Specter");
            specter.greet();
            specter.scare();
            specter.haunt("casa");
            specter.fly();
            specter.move();
        System.out.println("*******************************************************");
            MonaLovelace Ada=new MonaLovelace("Ada");
            Ada.greet();
            Ada.sayPhrase();
            Ada.createAlgorithm();
            Ada.readBook();
        System.out.println("*******************************************************");
            Stormtroopocat starkiller=new Stormtroopocat("Mona Starkiller");
            starkiller.greet();
            starkiller.exploreArea("Tatooine");
            starkiller.arrest();
            starkiller.shoot(3);
        System.out.println("*******************************************************");
            DaftpunktocatGuy Guy=new DaftpunktocatGuy("Guy");
            Guy.greet();
            Guy.switchLights(true);
            Guy.playSong();
            Guy.dance("One more time");
            Guy.switchLights(false);
        System.out.println("*******************************************************");
            Octonaut lightyear=new Octonaut("Mona Lightyear");
            lightyear.greet();
            lightyear.antigravityMode(true);
            lightyear.driveSpaceship(true);
            lightyear.antigravityMode(false);
            lightyear.explorePlanet("Marte");
    }
}

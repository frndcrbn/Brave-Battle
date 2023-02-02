package polychallenge;

public class BEnemy extends AEnemy{

    BEnemy(String name, String type, String rank, int health, int damage){
        super(name, type, rank, health, damage);
    }

    void attack(){
        System.out.println(name + " uses [unknown] ( " + type + " ) attack.");
    }
}

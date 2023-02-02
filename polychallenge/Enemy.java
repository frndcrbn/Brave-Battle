package polychallenge;

public class Enemy {

    String name, type, rank;
    int health;
    int damage;

    Enemy(String name, String type, String rank, int health, int damage){
        this.name = name;
        this.type = type;
        this.rank = rank;
        this.health = health;
        this.damage = damage;
    }

    void showStats(){
        System.out.println("Name   : " + name);
        System.out.println("Type   : " + type);
        System.out.println("Rank   : " + rank);
        System.out.println("Health : " + health);
        System.out.println("Damage : " + damage);
    }

    void attack(){
        System.out.println(name + " use attack.");
    }

}

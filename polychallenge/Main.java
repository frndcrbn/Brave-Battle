package polychallenge;

public class Main {

    public static void main(String[] args) {

        Enemy[] enemies = new Enemy[9];

        enemies[0] = new SPlusplusEnemy("Archon","S++", "Elite",100000, 10000);
        enemies[1] = new SPlusEnemy("Champion", "S+", "Veteran",90000, 9000);
        enemies[2] = new SEnemy("Assasin", "S", "Expert", 80000, 8000);
        enemies[3] = new AEnemy("Skilled Fighter", "A", "Advanced", 70000, 7000);
        enemies[4] = new BEnemy("Lieutenant", "B", "Intermediate", 60000, 6000);
        enemies[5] = new CEnemy("Mercenary", "C", "Novice", 50000, 5000);
        enemies[6] = new DEnemy("Flunky", "D", "Beginner", 40000, 4000);
        enemies[7] = new EEnemy("Underling", "E", "Rookie", 30000, 3000);
        enemies[8] = new FEnemy("Minion", "F", "Trainee", 20000, 2000);

        for ( Enemy e : enemies ){
            e.showStats();
        }
    }

}

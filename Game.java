import java.util.Scanner;

public class Game {
    private Player player;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Monster Battle RPG!");
        player = new Player("Hero", 100, 20, 1, 0);

        Monster[] monsters = {
            new Monster("Goblin", 50, 10),
            new BossMonster("Dragon", 120, 25)
        };

        for (Monster m : monsters) {
            battle(m);
            if (!player.isAlive()) {
                System.out.println("You have been defeated!");
                return;
            }
            player.levelUp();
        }

        System.out.println("Congratulations! You have defeated all the monsters!");
    }

    private void battle(Monster monster) {
        System.out.println("A wild " + monster.getName() + " appears!");

        while (player.isAlive() && monster.isAlive()) {
            player.attack(monster);
            if (monster.isAlive()) {
                monster.attack(player);
            }
        }
    }
}
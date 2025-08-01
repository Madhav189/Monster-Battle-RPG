public class Player extends Character {
    private int level;
    private int experience;

    public Player(String name, int health, int attackPower, int level, int experience) {
        super(name, health, attackPower);
        this.level = level;
        this.experience = experience;
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " attacks!");
        target.receiveDamage(attackPower);
    }

    public void levelUp() {
        level++;
        attackPower += 5;
        health += 20;
        System.out.println("You leveled up to level " + level + "!");
    }
}
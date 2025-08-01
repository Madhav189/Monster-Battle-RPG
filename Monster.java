public class Monster extends Character {
    public Monster(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " claws at you!");
        target.receiveDamage(attackPower);
    }
}
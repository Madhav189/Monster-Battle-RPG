public class BossMonster extends Monster {
    public BossMonster(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " unleashes a powerful fireball!");
        target.receiveDamage(attackPower + 10);
    }
}
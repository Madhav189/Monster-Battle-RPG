public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract void attack(Character target);

    public boolean isAlive() {
        return health > 0;
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " received " + damage + " damage. Remaining health: " + health);
    }

    public String getName() {
        return name;
    }
}
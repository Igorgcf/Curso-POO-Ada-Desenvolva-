package Class05;

public class Warrior extends Character {

    private int rage;

    @Override
    public int attack(Character target) {

        if (isAlive()) {
            int damage = getAttackPower() - target.getDefensePower();
            if (damage > 0) {
                target.setHealth(target.getHealth() - damage);
            } else {
                damage = 0; // No damage if attack is less than or equal to defense
            }
            return damage;
        }
        return 0; // Cannot attack if not alive
    }

    public int berserkerFury(){

        if (isAlive()) {
            int bonusDamage = rage / 2; // Example: Rage contributes to bonus damage
            rage = 0; // Reset rage after using it
            return getAttackPower() + bonusDamage;
        }
        return 0; // Cannot use berserker fury if not alive
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }


}

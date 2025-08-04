package Class05;

public class Mage extends Character {

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

    public int Fireball() {
        if (isAlive()) {
            int bonusDamage = 20; // Example: Fireball adds a fixed bonus damage
            return getAttackPower() + bonusDamage;
        }
        return 0; // Cannot use Fireball if not alive
    }

    public int restoreMana(){
        if (isAlive()) {
            int manaRestored = 30; // Example: Restores a fixed amount of mana
            // Logic to restore mana can be added here
            return manaRestored;
        }
        return 0; // Cannot restore mana if not alive
    }
}

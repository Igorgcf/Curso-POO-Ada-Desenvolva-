package Class05;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        warrior.setName("Conan");
        warrior.setHealth(100);
        warrior.setAttackPower(70);
        warrior.setDefensePower(50);

        Mage mage = new Mage();
        mage.setName("Gandalf");
        mage.setHealth(100);
        mage.setAttackPower(80);
        mage.setDefensePower(30);


        System.out.println("Warrior Details:");
        System.out.println("Warrior Name: " + warrior.getName());
        System.out.println("Health: " + warrior.getHealth());
        System.out.println("Attack Power: " + warrior.getAttackPower());
        System.out.println("Defense Power: " + warrior.getDefensePower());
        System.out.println("Is Alive: " + warrior.isAlive());

        System.out.println("********************");
        System.out.println("\nMage Details:");
        System.out.println("Mage Name: " + mage.getName());
        System.out.println("Health: " + mage.getHealth());
        System.out.println("Attack Power: " + mage.getAttackPower());
        System.out.println("Defense Power: " + mage.getDefensePower());
        System.out.println("Is Alive: " + mage.isAlive());

        System.out.println("********************");
    }
}

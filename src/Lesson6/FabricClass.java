package Lesson6HW;

import Lesson6HW.Unit.Archer;
import Lesson6HW.Unit.Mage;
import Lesson6HW.Unit.Titan;
import Lesson6HW.Unit.Warrior;
import Lesson6HW.models.Unit;

public class FabricClass {

    public static void main(String[] args) {
        Warrior warrior = new Warrior(100, 45, "Warrior", 34);
        Archer archer = new Archer(50, "Archer", 45, 5, 60);
        Mage mage = new Mage(30, "Mage", 40, 6);
        Titan titan = new Titan(500, 150, "Titan", 10);

        System.out.println("***********************");

        Unit[] army = {warrior, archer, mage, titan};

        for (int i = 0; i < army.length; i++) {
//            army[i].speak();
//            army[i].run();
//            army[i].takeDamage(45);
//            if (army[i] instanceof Archer) {
//                ((Archer)army[i]).escapeFromBattle();
//            }

            if (army[i] instanceof Warrior) {
                ((Warrior) army[i]).takeDamage(90);
            }
        }

//        warrior.speak();
//        warrior.run();
//        warrior.attack();
//        warrior.takeDamage(90);
//        System.out.println("***********************");
//        archer.speak();
//        archer.run();
//        archer.attack();
//        archer.takeDamage(45);
//        archer.escapeFromBattle();
//        System.out.println("***********************");
//        mage.speak();
//        mage.run();
//        mage.createFire();
//        mage.createIce();
//        mage.createFire();
//        mage.takeDamage(10);
//        System.out.println("***********************");
//        titan.attack();
//        titan.run();
//        titan.takeDamage(250);
//        titan.speak();


    }
}

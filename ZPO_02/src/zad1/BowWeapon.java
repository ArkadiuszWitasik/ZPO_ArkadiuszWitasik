package zad1;

public class BowWeapon implements WeaponBehavior{

    @Override
    public void attack() {
        System.out.println("Archer shoots arrows!");
    }
}

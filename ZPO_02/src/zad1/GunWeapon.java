package zad1;

public class GunWeapon implements WeaponBehavior{
    @Override
    public void attack() {
        System.out.println("Gunner fires a gun!");
    }
}

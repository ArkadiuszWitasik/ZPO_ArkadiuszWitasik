package zad1;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character(){};

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void attack() {
        weaponBehavior.attack();
    }
}

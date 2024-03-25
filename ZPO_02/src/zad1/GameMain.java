package zad1;

import java.util.ArrayList;

public class GameMain {
    public static void main(String[] args) {
        ArrayList<Character> team = new ArrayList<>();
        team.add(new Archer(new BowWeapon()));
        team.add(new Cannoneer(new CannonWeapon()));
        team.add(new Gunner(new GunWeapon()));
        team.add(new Knight(new SwordWeapon()));

        for(Character character: team) {
            character.attack();
            System.out.println();
        }
    }
}

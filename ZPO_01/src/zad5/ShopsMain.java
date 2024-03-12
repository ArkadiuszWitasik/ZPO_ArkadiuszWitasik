package zad5;

import java.util.ArrayList;

public class ShopsMain {
    public static void main(String[] args) {
        ArrayList<Shop> shops = new ArrayList<>();
        shops.add(new PolishShop("PolandBud", new PolishShopTaxRate()));
        shops.add(new GermanShop("FastShop", new GermanyShopTaxRate()));
        shops.add(new UnitedKingdomShop("UK low price", new UnitedKingdomTaxRate()));

        for(Shop shop:shops) {
            shop.showShopInfo();
            System.out.println();
        }
    }
}

package zad5;

public abstract class Shop {

    String shopName;
    TaxRate taxRate;

    public Shop(){};

    public Shop(String shopName, TaxRate taxRate) {
        this.shopName = shopName;
        this.taxRate = taxRate;
    }
    public void setTaxRate(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void showShopInfo() {
        System.out.println("Shop name: " + this.shopName);
        taxRate.showTaxRate();
    }
}

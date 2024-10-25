package sample.cafekiosk.unit.beverages;

import sample.cafekiosk.unit.beverages.Beverage;

public class Americano implements Beverage {


    @Override
    public String getName() {
        return "아메리카노";
    }

    @Override
    public int getPrice() {
        return 4000;
    }
}

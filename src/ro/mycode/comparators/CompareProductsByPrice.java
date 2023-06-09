package ro.mycode.comparators;

import ro.mycode.models.Orders;
import ro.mycode.models.Products;

import java.util.Comparator;

public class CompareProductsByPrice implements Comparator<Products> {

    @Override
    public int compare(Products o1, Products o2) {
        if (o1.getPrice()>o2.getPrice()){
            return 1;
        } else if (o1.getPrice()<o2.getPrice()) {
            return -1;
        }
        return 0;
    }
}

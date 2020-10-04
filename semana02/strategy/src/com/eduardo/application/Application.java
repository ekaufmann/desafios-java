package com.eduardo.application;

import com.eduardo.context.BoxDelivery;
import com.eduardo.model.Box;
import com.eduardo.model.LargeBox;
import com.eduardo.model.MediumBox;
import com.eduardo.model.SmallBox;
import com.eduardo.strategy.LargePackageStrategy;
import com.eduardo.strategy.MediumPackageStrategy;
import com.eduardo.strategy.SmallPackageStrategy;

public class Application {

    public static void main(String[] args) {

        BoxDelivery delivery = new BoxDelivery(new MediumPackageStrategy());
        Box smallBox = new SmallBox();
        Box mediumBox = new MediumBox();
        Box largeBox = new LargeBox();

        delivery.preparePackage(smallBox);
        delivery.setPackageStrategy(new SmallPackageStrategy());
        delivery.preparePackage(smallBox);
        delivery.setPackageStrategy(new MediumPackageStrategy());
        delivery.preparePackage(mediumBox);
        delivery.setPackageStrategy(new LargePackageStrategy());
        delivery.preparePackage(largeBox);
    }
}

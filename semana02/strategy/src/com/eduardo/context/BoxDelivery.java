package com.eduardo.context;

import com.eduardo.model.Box;
import com.eduardo.strategy.PackageStrategy;

public class BoxDelivery {

    PackageStrategy packageStrategy;

    public BoxDelivery(PackageStrategy packageStrategy) {
        this.packageStrategy = packageStrategy;
    }

    public void setPackageStrategy(PackageStrategy packageStrategy) {
        this.packageStrategy = packageStrategy;
    }

    public void preparePackage(Box box) {
        packageStrategy.preparePackage(box);
    }
}

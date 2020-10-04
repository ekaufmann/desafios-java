package com.eduardo.strategy;

import com.eduardo.model.Box;
import com.eduardo.util.SizeLimits;

public class SmallPackageStrategy implements PackageStrategy {

    private final int fee = 5;
    private SizeLimits acceptedSize = SizeLimits.SMALL;

    @Override
    public void preparePackage(Box box) {
        if(box != null && box.getSize() == acceptedSize) {
            System.out.println("Preparing small box...");
            send(box);
        } else {
            System.out.println("Invalid package!");
        }
    }

    @Override
    public int getFee() {
        return fee;
    }
}

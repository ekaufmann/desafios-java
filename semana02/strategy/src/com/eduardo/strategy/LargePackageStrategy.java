package com.eduardo.strategy;

import com.eduardo.model.Box;
import com.eduardo.util.SizeLimits;

public class LargePackageStrategy implements PackageStrategy {

    private final int fee = 15;
    private SizeLimits acceptedSize = SizeLimits.LARGE;

    @Override
    public void preparePackage(Box box) {
        if(box != null && box.getSize() == acceptedSize) {
            System.out.println("Preparing large box...");
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

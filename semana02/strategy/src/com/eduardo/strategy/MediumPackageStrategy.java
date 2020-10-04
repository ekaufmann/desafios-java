package com.eduardo.strategy;

import com.eduardo.model.Box;
import com.eduardo.util.SizeLimits;

public class MediumPackageStrategy implements PackageStrategy {

    private final int fee = 10;
    private SizeLimits acceptedSize = SizeLimits.MEDIUM;

    @Override
    public void preparePackage(Box box) {
        if(box != null && box.getSize() == acceptedSize) {
            System.out.println("Preparing medium box...");
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

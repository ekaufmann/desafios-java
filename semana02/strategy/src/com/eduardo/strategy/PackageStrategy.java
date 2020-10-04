package com.eduardo.strategy;

import com.eduardo.model.Box;

public interface PackageStrategy {

    void preparePackage(Box box);

    default void send(Box box) {
        System.out.printf("Sending the package from %s to %s\n", box.getSenderAddress(), box.getReceiverAddress());
        System.out.printf("Price = route price + %d\n", getFee());
    }

    int getFee();
}

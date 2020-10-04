package com.eduardo.model;

import com.eduardo.util.SizeLimits;

public abstract class Box {

    private SizeLimits size;
    private String receiverAddress = "Receiver";
    private String senderAddress = "Sender";

    public Box(SizeLimits size) {
        this.size = size;
    }

    public SizeLimits getSize() {
        return size;
    }

    public String getReceiverAddress() { return receiverAddress; }

    public String getSenderAddress() {
        return senderAddress;
    }
}

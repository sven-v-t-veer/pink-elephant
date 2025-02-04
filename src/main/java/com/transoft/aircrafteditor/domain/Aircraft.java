package com.transoft.aircrafteditor.domain;

public class Aircraft {
    private final int width;
    private final int length;

    public Aircraft(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}

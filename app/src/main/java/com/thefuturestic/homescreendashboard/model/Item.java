package com.thefuturestic.homescreendashboard.model;


public class Item {

    public String text;
    public int drawable;
    public String color;

    public Item(String text, int drawable, String color ) {
        this.text = text;
        this.drawable = drawable;
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

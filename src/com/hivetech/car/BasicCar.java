package com.hivetech.car;

import java.util.Random;

public abstract class BasicCar implements Cloneable{
    public String modelName;
    public int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public static int setPrice() {
        int price = 0;
        Random random = new Random();
        int p = random.nextInt(100000);
        price = p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException{
        return (BasicCar) super.clone();
    }
}

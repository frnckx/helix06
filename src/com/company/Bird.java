package com.company;

/**
 * Created by java1 on 2017.12.13..
 */
public class Bird extends Animal {
    public Bird() {
        setLatinName("Ave");
        setSex(Sex.Female);
        setWeightInKg(1);
    }



    @Override


    public void move(){
        System.out.println("Bird is flying.....");


    }

    @Override
    public String toString() {
        return "Latin name: " + getLatinName() + "\t Weight: " + getWeightInKg()+ " Sex: "+ getSex();
    }
}

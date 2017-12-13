package com.company;

/**
 * Created by java1 on 2017.12.13..
 */
public class Mammal extends Animal {

    public Mammal() {
        setLatinName("Mammalia");
        setSex(Sex.Female);
        setWeightInKg(12);
    }

    public void move(){
        System.out.println("Mammal is running.....");


    }
    public String toString() {
        return "Latin name: " + getLatinName() + "\t Weight: " + getWeightInKg()+ " Sex: "+ getSex();
    }
}

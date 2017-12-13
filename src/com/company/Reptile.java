package com.company;

/**
 * Created by java1 on 2017.12.13..
 */
public class Reptile extends Animal{

    public Reptile() {
        setLatinName("Reptilia");
        setSex(Sex.Female);
        setWeightInKg(5);
    }
    public void move(){
        System.out.println("Reptile is moving.....");


    }
    public String toString() {
        return "Latin name: " + getLatinName() + "\t Weight: " + getWeightInKg()+ " Sex: "+ getSex();
    }
}

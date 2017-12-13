package com.company;
enum SORT_DIRECTION {ASC, DESC}
public class Main {

    public static void main(String[] args) {
Bird bird = new Bird() ;
    bird.move();
    System.out.println(bird.toString());

    Reptile reptile = new Reptile();
    reptile.move();
        System.out.println(reptile.toString());
    Mammal mammal = new Mammal();
    mammal.move();

        System.out.println(mammal.toString());

        int[] array = {3, 2, 6, 0, 5, 4};
        insertSort(array, SORT_DIRECTION.DESC);
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }


        Amoeba amoeba = new Amoeba();
        amoeba.drawBoard();
    }


    public static void insertSort (int[] array, SORT_DIRECTION sortDirection){
        for (int i= 1; i< array.length; i++) {
            int j = i;
            if (sortDirection.equals(sortDirection.ASC)) {
                while (j > 0 && array[j] < array[j - 1]) {
                    int swap = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = swap;
                    --j;
                }
            }
            else {
                while (j > 0 && array[j] > array[j - 1]) {
                    int swap = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = swap;
                    --j;
                }



            }

            }
        }


    }


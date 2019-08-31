package pl.sda.List;

import java.util.ArrayList;

public class ListTask {

    public static void main(String[] args) {

        ArrayList<Integer> listaNaturalnych = new ArrayList<Integer>();
        {listaNaturalnych.add(3);
        listaNaturalnych.add(4);
        listaNaturalnych.add(5);
        listaNaturalnych.add(6);
        listaNaturalnych.add(7);
        listaNaturalnych.add(8);
        listaNaturalnych.add(9);
        listaNaturalnych.add(10);
        listaNaturalnych.add(11);
        listaNaturalnych.add(12);
        listaNaturalnych.add(13);
        listaNaturalnych.add(14);
        listaNaturalnych.add(15);
        listaNaturalnych.add(16);
        listaNaturalnych.add(17);
        listaNaturalnych.add(18);
        listaNaturalnych.add(19);
        listaNaturalnych.add(20);
        listaNaturalnych.add(21);
        listaNaturalnych.add(22);}
       //listaNaturalnych = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60 };


        //po kolei
        System.out.println("Po kolei");
        for (int wypisy: listaNaturalnych) {
            System.out.print(wypisy +" ");
        }

        System.out.println();
        System.out.println("Od konca");
        for (int i = listaNaturalnych.size()-1; i >= 0; i--){
            System.out.print(listaNaturalnych.get(i) + " ");
        }

        System.out.println();
        System.out.println("Wszystkie na nieparzystych pozycjach");
        //System.out.print(listaNaturalnych.get(0) + " ");
        for (int i = 0; i <= listaNaturalnych.size()-1; i++){
            if (i % 2 != 0) {
                System.out.print(listaNaturalnych.get(i) + " ");
            }
        }

        System.out.println();
        System.out.println("Wszystkie podzielne przez 3");
        //System.out.print(listaNaturalnych.get(0) + " ");
        for (int i = 0; i <= listaNaturalnych.size()-1; i++){
            if (listaNaturalnych.get(i) % 3 == 0) {
                System.out.print(listaNaturalnych.get(i) + " ");
            }
        }
        // suma
        System.out.println();
        System.out.println("Suma");
        int suma = 0;
        for (int i = 0; i <= listaNaturalnych.size()-1; i++){
            suma += listaNaturalnych.get(i);
        }
        System.out.println("Suma to " + suma);

        // Suma pierwszych 4
        System.out.println();
        System.out.println("Suma pierwszych 4");
        int suma4 = 0;
        for (int i = 0; i <= 3; i++){
            suma4 += listaNaturalnych.get(i);
        }
        System.out.println("Suma pierwszych 4 to " + suma4);


        System.out.println();
        System.out.println("Suma ostatnich 5");
        int sumaOstatnich5 =0;
        for (int i = listaNaturalnych.size()-1; i >= listaNaturalnych.size()-5; i--){
            sumaOstatnich5 += listaNaturalnych.get(i);
        }
        System.out.print("Suma ostatnich 5 to " + sumaOstatnich5);

        System.out.println();
        System.out.println("Suma liczb po kolei");
        int sumaPierwszych = 0;
        for (int i=0; i < listaNaturalnych.size(); i++){

            while (sumaPierwszych <= 10) {
                sumaPierwszych += listaNaturalnych.get(i);
            }

        }
        System.out.println("Suma pierwszych " + sumaPierwszych);
    }
}

package pl.sda.List;

import java.util.Random;

public class SelectionSortMain {

    public static void main(String[] args) {

        int [] tabb = {3, 1, 5, 11, 9, 12};
        SelectionSort ss = new SelectionSort();
        int [] sorted = ss.sort(tabb);
        for (int v:sorted){
            System.out.print(v + ", ");
        }

    }
}

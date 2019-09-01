package pl.sda.List;

public class MainList {

    public static void main(String[] args) {
        //SelectionSort ss = new SelectionSort();
        QuickSort qs = new QuickSort();
        IList list = new LinkedList();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(10);
        list.add(33);
        list.add(2);
        list = qs.sort(list, 0, list.size()-1);
        Object[] tab = list.getHolderView();

        for (Object val : tab){
            System.out.print(val + " ");
    }
        System.out.println();


    }
}

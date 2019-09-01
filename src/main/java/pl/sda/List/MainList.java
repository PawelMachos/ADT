package pl.sda.List;

public class MainList {

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        IList list = new LinkedList();
        list.add(5);
        list.add(1);
        list.add(2);
        list = ss.sort(list);


        Object[] tab = list.getHolderView();

        for (Object val : tab){
            System.out.print(val + " ");
    }
        System.out.println();

        
    }
}

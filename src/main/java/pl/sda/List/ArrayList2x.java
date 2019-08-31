package pl.sda.List;

import java.util.Arrays;

public class ArrayList2x implements IList {

    private final long[] holder;
    private int size = 0;
    private final int arraySizeMultipler = 2;

    public ArrayList2x() {
        holder = new long[10];
    }

    // to do
    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public long get(int index) {
        return holder[index];
    }

    //to do
    @Override
    public void set(int index, long value) {

        if (index < holder.length) {
            holder[index] = value;
        }
    }

    //to do
    @Override
    public void remove(int index) {

        for (int i = index; i < holder.length - 1; i++) {
            holder[i] = holder[i - 1];
        }
        size--;
    }

    @Override
    public int firstIndexWith(long value) {
        for (int i = 0; i < size; i++) {
            if (value == holder[i]) {
                return i;
            }
        }
        return -1;
    }

    //to do - increment size of table
    @Override            //   0             2           size= 1
    public void add(int index, long value) {
        for (int i = size; i > index; i--) {
            holder[i] = holder[i - 1];
        }
        holder[index] = value;
        size++;
    }

    //to do - increment size of physical table
    @Override
    public void add(long value) {
        holder[size] = value;
        size++;
    }

    @Override
    //TODO - This should return copy of the filled part of the array
    public long[] getHolderView() {
        return Arrays.copyOfRange(holder, 0, size);
    }

}

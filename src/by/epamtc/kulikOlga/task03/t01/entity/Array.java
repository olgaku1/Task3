package by.epamtc.kulikOlga.task03.t01.entity;

import java.util.Arrays;

public class Array {
    private int[] array;
    private int size;

    public Array() {
    }

    public Array(int[] array) {
        this.array = array;
    }

    public Array(Integer[] array) {
        int sizeArray = array.length;
        int[] newArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            newArray[i] = array[i];
        }
        this.array = newArray;
        this.size = array.length;
    }

    public Array(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
        this.size = array.length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Array arr = (Array) obj;
        if (size != arr.size) {
            return false;
        }
        if (null == array) {
            return (array == arr.array);
        }
        else {
            if (!array.equals(arr.array)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int prime = 17;
        return prime * Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}

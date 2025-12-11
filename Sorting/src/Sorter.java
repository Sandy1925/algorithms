public interface Sorter {

    public void sort(Comparable [] arr);

    default boolean less(Comparable v, Comparable w) {
        return v.compareTo(w)<0;
    }

    default void exchange(Comparable[] arr, int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    default boolean isSorted(Comparable[] arr){
        for (int i=1; i<arr.length;i++){
            if(arr[i].compareTo(arr[i-1])<0) return false;
        }
        return true;
    }

}

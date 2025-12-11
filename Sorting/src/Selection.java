public class Selection implements Sorter{
    @Override
    public void sort(Comparable[] arr) {

        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j= i+1;j<arr.length;j++){
                //checking if the current element is lesser than the curren tminimum and changing accordingly
                if(less(arr[j],arr[min])){
                    min =j;
                }
            }
            //swapping the smallest element to the first of the subsequent sub array
            exchange(arr,i,min);
        }
    }
}

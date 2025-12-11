public class Main {


    public static void main(String[] args){
        Sorter select = new Selection();
        String[] input = new String[]{"S","O","R","T","E","X","A","M","P","L","E"};
        //Integer[] inArr = new Integer[]{10,9,8,7,6,5,4,3,2,1};
        //select.sort(inArr);
        select.sort(input);
        //System.out.println(select.isSorted(inArr));
        System.out.println(select.isSorted(input));
        for(String s: input){
            System.out.print(s+" ");
        }

//        for(Integer i: inArr){
//            System.out.println(i);
//        }
    }
}

package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class IntArrayToArraylist {
    public static void main(String[] args) {
        int num[] ={2,34,5,54,1};
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i: num){
            arrlist.add(i);
        } 
        Collections.sort(arrlist);
        System.out.println(arrlist);
    }
}

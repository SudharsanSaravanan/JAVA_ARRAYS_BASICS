package ARRAYLIST;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayToArraylist {
    String arr[] = {"KAvi","Nish","teeth"};
    ArrayList<String> num = new ArrayList<>(Arrays.asList(arr));
    public static void main(String[] args) {
        StringArrayToArraylist obj = new StringArrayToArraylist();
        System.out.println(obj.num);
    }
}

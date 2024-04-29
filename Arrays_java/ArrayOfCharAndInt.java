package ArrayOfMultipleDatatypes;

import java.util.Arrays;

public class ArrayOfCharAndInt {
    public static void main(String[] args) {
        Object[] CharNumArr = {1,'s',4};
        System.out.println(Arrays.asList(CharNumArr));
        for(Object obj : CharNumArr){
            System.out.println(obj);
        }
    }
}

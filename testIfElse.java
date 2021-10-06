import java.util.*;
public class testIfElse{
    static int ternary(int i){
        return i < 10? i*100:i*10;
    }

    static int standardIfElse(int i){
        if(i<10)
            return i*100;
            else 
            return i*10;
    }

    public static void main(String[] args){
        System.out.println(ternary(9));
        System.out.println(ternary(11));
        System.out.println(standardIfElse(6));
        System.out.println(standardIfElse(11));
    }
}
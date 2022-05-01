package array;

import java.util.Arrays;
import java.util.List;

//array = [2,1,2,2,2,2,4,2]
//toMove = 2
//output = [1,3,4,2,2,2,2]
public class MoveToElementToEnd {
    public static void main(String[] args) {
        List<Integer> result = Arrays.asList(2,3,4,5,6,2,2,3,4);
        int toMove = 3;
        System.out.println(moveElementToEnd(result, toMove ));
    }
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j ){
            while (i < j && array.get(j) == toMove)
                j--;
            if (array.get(i) == toMove)
                swap(i , j, array);
            i++;
        }
        return array;
    }
    public static void swap(int i , int j, List<Integer> array) {
        int temp = array.get(j);
        array.set(j, array.get(i));
        array.set(i, temp);
    }
}


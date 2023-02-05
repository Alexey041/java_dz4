import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * dz4
 */
public class dz4 {

    public static void main(String[] args) {
        
        tasks();
    }

    static void tasks(){
        //Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(7);
        linkedList.add(6);
        

/*         for (int i = linkedList.size()-1; i >= 0; i--) {
            linkedList2.add(linkedList.get(i));
        }

        System.out.println(linkedList2);
 */

        ListIterator<Integer> iterator = linkedList.listIterator();
        int sum = 0;
        Integer integer = 0;
        while (iterator.hasNext()){
            integer = iterator.next();
            sum += integer;       
        }
        while (iterator.hasPrevious()) {
            integer = iterator.previous(); 
            linkedList2.add(integer);
            integer = iterator.previousIndex();
        }

        System.out.println(linkedList2);
        System.out.println(sum);
    }
}
import java.util.LinkedList;

public class linkedLI {
    private LinkedList<Object> list;

    linkedLI(){
        list = new LinkedList<>();
    }

    void queue(Object ob){
        list.addLast(ob);
    }

    Object dequeue(){
        return list.removeFirst();
    }
    Object first(){
        return list.getFirst();
    }

}

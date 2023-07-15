package Java_DZ;
//Разработать программу, имитирующую поведение коллекции HashSet.
// В программе содать метод add добавляющий элемент,
// метод toString возвращающий строку с элементами множества
// *и метод позволяющий читать элементы по индексу.
//*Реализовать все методы из семинара.
//Формат данных Integer.

        import java.util.HashMap;
        import java.util.Iterator;

public class Java_DZ_6 {
    public static void main(String[] args) {
        Set<Integer> mySet = new Set();
        mySet.add(777);
        mySet.add(555);
        mySet.add(333);
        mySet.add(575);
        Iterator<Integer> it = mySet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(mySet.toString());
        System.out.println(mySet.elemByIndex(0));
        System.out.println(mySet.remove(555));
        System.out.println(mySet.size());
        System.out.println(mySet.isEmpty());
    }
}
class Set<E> {
    private HashMap<E, Object> set = new HashMap<>();
    private static final Object VALL = new Object();
    ////метод, который добавляет данные в множество
    public boolean add(E num) {
        return set.put(num, VALL) == null;
    }
    //метод toString возвращающий строку с элементами множества
    public String toString(){
        return set.keySet().toString();
    }
    //метод, который достает данные из множества
    public Iterator<E> iterator() {
        return set.keySet().iterator();
    }
    //метод позволяющий читать элементы по индексу
    int elemByIndex(int index){
        return (Integer)set.keySet().toArray()[index];
    }
    //метод, удалющий ключ значение по ключу из множества
    public boolean remove(E num){
        return set.remove(num) == VALL;
    }
    //метод, который возвращает количество элементов множества
    public int size(){
        return set.size();
    }
    //метод, который взвращает истину, если пустой
    public boolean isEmpty(){
        return set.isEmpty();
    }
}
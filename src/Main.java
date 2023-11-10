import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        List<Integer> linkedList=new LinkedList<>();
        TreeSet<Integer> treeSet=new TreeSet<>();
        HashSet<Integer> hashSet=new HashSet<>();
        System.out.println("Время добавления элементов в List: ");
        System.out.println(add(linkedList));
        System.out.println(add(arrayList));
        System.out.println("Время добавления элементов в Set: ");
        System.out.println(add2(treeSet));
        System.out.println(add2(hashSet));
        System.out.println("Время удаления элементов в List: ");
        System.out.println(remove(arrayList));
        System.out.println(remove(linkedList));
        System.out.println("Время удаления элементов в Set: ");
        System.out.println(remove2(treeSet));
        System.out.println(remove2(hashSet));

    }
    public static long add(List <Integer> list){
        long time=System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            list.add(i);
        }
        time=System.currentTimeMillis()-time;
        return time;
    }
    public static long add2(Set<Integer> set){
        long time=System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            set.add(i);
        }
        time=System.currentTimeMillis()-time;
        return time;
    }
    public static long remove(List<Integer> list){
        long time=System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            list.remove(i);
        }
        time=System.currentTimeMillis()-time;
        return time;
    }
    public static long remove2(Set<Integer> set){
        long time=System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            set.remove(i);
        }
        time=System.currentTimeMillis()-time;
        return time;
    }


}
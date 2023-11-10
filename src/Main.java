import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        List<Integer> linkedList=new LinkedList<>();
        TreeSet<Integer> treeSet=new TreeSet<>();
        HashSet<Integer> hashSet=new HashSet<>();
        System.out.println(add(linkedList));
        System.out.println(add(arrayList));
        System.out.println(add2(treeSet));
        System.out.println(add2(hashSet));

    }
    public static long add(List <Integer> list){
        long time=System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            list.add(i);
        }
        time=System.currentTimeMillis()-time;
        return time;
    }
    public static long add2(Set<Integer> set){
        long time=System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            set.add(i);
        }
        time=System.currentTimeMillis()-time;
        return time;
    }


}
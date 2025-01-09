import java.util.HashSet;

public class HashSetBasics{
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(3);
        set.add(null);
        System.out.println(set.size());
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
    
        System.out.println(set.size());
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        System.out.println(set.size());
        
    }
    
}

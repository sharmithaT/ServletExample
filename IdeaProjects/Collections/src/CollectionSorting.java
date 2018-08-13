import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {


    public static void main(String[] args)
    {
        List<Student> list=new ArrayList<>();

        list.add(new Student(5,"Deepu"));
        list.add(new Student(1,"kitty"));
        list.add(new Student(6,"Ashu"));

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


    }
}

import java.util.Map;
import java.util.TreeMap;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(){}
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return ("id="+this.id+" name="+this.name);
    }
    @Override
    public int compareTo(Student o) {
        if(this.id== o.id)
        {
            return 0;
        }
        else if(this.id>o.id)
        {
            return 1;
        }
        else {
            return -1;
        }
//return this.name.compareTo(o.name);
    }

    public static void main(String[] args)
    {
        Student stu=new Student(1,"kitty");
        Map<Integer,String> tmap=new TreeMap<>();
        tmap.put(stu.id,stu.name);

        System.out.println(tmap);

    }


}

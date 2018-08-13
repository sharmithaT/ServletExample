import java.util.*;
import java.util.function.Predicate;

public class ArrayListExample {

    public static void main1(String[] args)
    {
        //ArrayList
        List<String > list=new ArrayList();

        list.add("Hello");
        //list.add(1000);
        list.add("suki");
        list.add("suki");

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        list.remove("suki");

        Iterator<String> iterator=list.iterator();

        while (iterator.hasNext())
        {
            String a=/*(String)*/iterator.next();
            System.out.println(a);
        }

//LinkedList
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Ball");
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Cat");

        for(int j=0;j<linkedList.size();j++)
        {
            System.out.println(linkedList.get(j));
        }
        linkedList.remove(2);

        Iterator<String> iterator1=linkedList.iterator();

        while(iterator1.hasNext())
        {
            System.out.println(iterator.next());
        }


//Stack
        Stack stack=new Stack();
        stack.push("abcd");//to enter elements into stack
        stack.push(100);
        System.out.println(stack);
        System.out.println(stack.peek()); //to select the top most element in the stack
        System.out.println(stack.search(100)); //to search for a particular element
        System.out.println(stack.pop()); // to select and delete the top most element
        System.out.println(stack);

        Iterator iterator2=stack.iterator(); // iterator object creation

        while (iterator2.hasNext())  //to iterate inside a stack
        {
            System.out.println(iterator2.next());
        }


//Vector
        //vector is a synchronised dataStructure which was used in old versions of java
        Vector<String> vector=new Vector<>();
        vector.addElement("MIS");  //to enter elements into vector
        vector.addElement("CS");
        vector.addElement("CENG");
        vector.addElement("SWEN");
        vector.addElement(null);

        for(int k=0;k<vector.size();k++)
        {
            System.out.println(vector.get(k));
        }
        vector.remove(3); //to delete a particular object by its index value
        Enumeration<String> enumeration=vector.elements(); //Both enumaration and iterator can be used in vector for iterating inside it

        while(enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }

    }
}

class HashSetExample{
    public static void main(String[] args)
    {
        Set set=new HashSet();
        set.add("suki");//here it calculates the hashcode of "suki" ,calculates the index = (hashcode &(hashsetLength-1))and places the element there.
        set.add(123);
        set.add(123);
        set.add(null);

        Iterator iterator=set.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



//LinkedHashSet
        Set set1=new LinkedHashSet();
        set1.add("suki");
        set1.add(123);
        set1.add(123);
        set1.add(null);

        Iterator iterator1=set1.iterator();

        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }


//TreeSet
        Set set2=new TreeSet();
        set2.add("fsd");
        set2.add("sd");
        set2.add("ddsfsdgd");
        set2.add("grdgd");
        set2.add("aer");
        set2.add("sd"); // doesnt accept duplicate values
      // set2.add(null);  //treeSet wont accept null as it cannot compare an element with null

        System.out.println(set2); //it maintains ascending order. so no insertion orders

        Iterator iterator2=set2.iterator();

        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next());
        }





        //Queue

        Queue<String> q =new PriorityQueue<>();
        q.add("suki");
        q.add("Deepu");
        q.add("Maggi");

        System.out.println(q.peek());
        System.out.println(q.poll());









//Maps


        //HashMap

        Map<Integer,String> hashMap=new HashMap<>();


        hashMap.put(1,"sukis");
        hashMap.put(2,"Deepu");
        hashMap.put(1,"suki");
        hashMap.put(null,"hello");//takes null
        hashMap.put(null,"243");//doesn't take duplicate keys


        System.out.println(hashMap);


        //TreeMap
        Map<String ,String> treeMap=new TreeMap<>();

        treeMap.put("one","Apple");
        treeMap.put("Two","Ball");
        treeMap.put("Three","Cat");
        //treeMap.put(null,null); treeMap doesn't take  null values, nor duplicate vales

        System.out.println(treeMap);



        List<String> li=Arrays.asList("a1","a2","c3","d3");

        li.stream()//gives the elements one by one.
                .filter(s->s.startsWith("a"))//filtering the elements
                .forEach(s->System.out.println(s));//printing the resultset.




    }






}
public class Program1 {
    public static void main(String[] args) {
       /* try
        {
            badMethod();
            System.out.println("A");
        }catch (Exception ex)
        {
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void badMethod()
    {
        throw new Error();
    }*/

        String s1 = "abc";
        String s2 = "def";
        String s3 = s2;
        s2 = "ghi";
        System.out.println(s1 + s2 + s3);


        String a="ABCD";
        String b=a.toLowerCase();
        b.replace('a','d');
        b.replace('b','c');
        System.out.println(b);
    }
}

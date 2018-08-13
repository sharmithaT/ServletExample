public class GarbageCollection {

    public static void main(String[] args)
    {
        GarbageCollection g1=new GarbageCollection();
        GarbageCollection g2=new GarbageCollection();

        Engine engine=new Engine();

        engine=null;
        g1=null;
        g2=null;

        System.gc();

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Its Clean");
    }


}

 class Engine {
     @Override
     protected void finalize() throws Throwable {
         System.out.println("Not so clean");

     }
 }

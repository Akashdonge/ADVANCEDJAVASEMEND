// A generic interface with bounded type parameter.
 interface Myinterface<T extends Comparable<T>>
{
   T min();
   T max();
}
// A generic class with bounded type parameter.
 class Myclass<T extends Comparable<T>> implements Myinterface<T>
{
   T[ ] values;
   Myclass(T[] values)
   {
       this.values = values;
   }
   public T min()
   {
      T v = values[0];
      for(int i = 0; i < values.length; i++)
      {
         if(values[i].compareTo(v) < 0)
            v = values[i];
      }
      return v;
   }
   
public T max()
   {
       T v = values[0];
       for(int i = 0; i < values.length; i++)
       {
           if(values[i].compareTo(v) > 0)
            v = values[i];
       }
      return v;
    }
}
public class Test
{
  public static void main(String[] args)
  {
     Integer[ ] inums = {25, 30, 10, 45, 21, 05};
     Character[ ] chars = {'a', 'g', 'w', 'i', 'p'};
     Myclass<Integer> iobj = new Myclass<Integer>(inums);
     Myclass<Character> cobj = new Myclass<Character>(chars);
     System.out.println("Max value in inums: " +iobj.max());
     System.out.println("Min value in inums: " +iobj.min());
     System.out.println("Max value in chars: " +cobj.max());
     System.out.println("Min value in chars: " +cobj.min());
  }
}

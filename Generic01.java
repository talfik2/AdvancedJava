package javadevelopmentDay01;

import java.util.ArrayList;
import java.util.List;

public class Generic01 {
    /*
    1) ıf we create a Generic Method or Class, we can use it with every data type without using explicit narrowing..
    2) Java will improve performance since Java won't work for explicit narrowing in every step.
    3) If you use Generic Concept, you will get Compile Time Error when you make a mistake.
     */
    public static void main(String[] args) {
        NonGenericData obj1 = new NonGenericData("String argument without using generic");
         String obj1Value = (String)obj1.getObj();
         System.out.println("String with Explicit Narrowing "+ obj1Value);

        NonGenericData obj2 = new NonGenericData(122);
        Integer obj2Value = (Integer) obj2.getObj();
        System.out.println("Integer with Explicit Narrowing " + obj2Value);

        NonGenericData obj3 = new NonGenericData(true);
        Boolean obj3Value = (Boolean) obj3.getObj();
        System.out.println("Boolean with Explicit Narrowing " + obj3Value);

        NonGenericData obj4 = new NonGenericData(2.0);
        Double obj4Value = (Double) obj4.getObj();
        System.out.println("Double with Explicit Narrowing " + obj4Value);

        GenericData<String> obj5 = new GenericData<>("String argument with using generic");
        String obj5Value = obj5.getObj();
        System.out.println("String Object with Generic Class: " + obj5Value);

        GenericData<Integer> obj6 = new GenericData<>(100);
        Integer obj6Value = obj6.getObj();
        System.out.println("Integer Object with Generic Class: " + obj6Value);

        GenericData<Double> obj7 = new GenericData<>(100.00);
        Double obj7Value = obj7.getObj();
        System.out.println("Double Object with Generic Class: " + obj7Value);

        GenericData<Boolean> obj8 = new GenericData<>(false);
        Boolean obj8Value = obj8.getObj();
        System.out.println("Boolean Object with Generic Class: " + obj8Value);

        // List
        List<GenericData<Integer>> list1 = new ArrayList<>();
        list1.add(new GenericData<>(11));
    }
}
// default NonGenericData Class
class NonGenericData{
    private Object obj;

    public NonGenericData(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "NonGenericData{" +
                "obj=" + obj +
                '}';
    }
}

class GenericData<T>{ // T = Data Types
    private T obj;

    // Constructor
    public GenericData(T obj) {
        this.obj = obj;
    }

    // Getter
    public T getObj() {
        return obj;
    }

    // toString()

    @Override
    public String toString() {
        return "GenericData{" +
                "obj=" + obj +
                '}';
    }
}
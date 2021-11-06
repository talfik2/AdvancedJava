package javadevelopmentDay01;

public class DataTypeParameters02 {
    public static void main(String[] args) {
        //GenericData02<String> obj1 = new GenericData02<String>("Ali Can");
        //GenericData02<Boolean> obj2 = new GenericData02<Boolean>(true);
        GenericData02<Double> obj3 = new GenericData02<Double>(2.0);
        GenericData02<Integer> obj4 = new GenericData02<Integer>(20);

    }
}
class GenericData02<T extends Number>{
    // Private T object
    private T obj;

    // Constructor
    public GenericData02(T obj) {
        this.obj = obj;
    }

    // Getter
    public T getObj() {
        return obj;
    }
    // toString()

    @Override
    public String toString() {
        return "GenericData02{" +
                "obj=" + obj +
                '}';
    }
}
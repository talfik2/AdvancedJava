package javadevelopmentDay01;
/*
T = Type(Data Type)
K = Key
N = Number
V = Value
E = Element
 */
public class DataTypeParameters01 {
    public static void main(String[] args) {
        // name of the object will be data1
        GenericData01<Integer, String> data1 = new GenericData01<>(11, "Ali Can");
        System.out.println(data1);

        // Trying to just get output of the "Key"
        System.out.println("Output of Key: " + data1.getKey());
        // Trying to just get output of the "Value"
        System.out.println("Output of Value: " + data1.getValue());

        // Using displayNotBounded() with int-str
        data1.displayNotBounded(12, "Barbossa");
        // Using displayNotBounded() with str-int
        data1.displayNotBounded("Jack", 8);
        // Let's use displayNotBounded() with boolean- string
        data1.displayNotBounded(true, "Elizabeth");
        // Let's use displayNotBounded() with char- double
        data1.displayNotBounded("e", 3.0);

        // Restricted Method
        data1.displayBounded("Will", 36);
        data1.displayBounded("Carrot",3.0);
    }
}
class GenericData01<K, V> {
    private K key;
    private V value;
    // Getters
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public GenericData01(K key, V value) {
        this.key = key;
        this.value = value;
    }
    // toString()
    @Override
    public String toString() {
        return "GenericData01{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
    // free usage
    public <E, N> void displayNotBounded(E element, N number) { // E as dtype, "element" is name
        // displayNotBounded method gets E as element and N as argument, then it prints them on the console.
        System.out.println("Element: " + element + ", Number: " + number);
    }
    // restricted usage
    public <E , N extends Number> void displayBounded(E element, N number) { // You can only use Number for N
        System.out.println("Element: " + element + ", Number: " + number);
    }
    /*
    Sometimes, we want to use our method free, without any restriction. In that case, we use the method
  that we created without extends keyword. But sometimes, we may want to use our method with limited or full restrictions.
  In that case, we need to use "extends" inside the diamond.
     */
}
package javadevelopmentDay01;
// Enum is a special class.
// We need Enums because inside the Enums, we can store "Public", "Static" and "Final" variables.
public enum Enum01 {
    // In Enum, all variables should be uppercase.
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    // We don't use ";" at the end of our code in Enum.
}
/*
    Differences Between Enums and Classes
    1) Variables
    2) You cannot create objects by using Enum, but you can create objects from the Classes.
    3) Enums cannot extend to any class, but they can implement interfaces.
    Whereas you can extend to any class from a class and you can implement any interface from a class.

    We use Enum's for the specifying purpose. Enum makes your code "public", "static" and "final" automatically.
 */

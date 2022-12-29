package string;

public interface In {
    int add(int no1,int no2);
    static void sub()
    {
        System.out.println("Hi");
    }

    default void display()
    {
        System.out.println("Hello");

    }
}

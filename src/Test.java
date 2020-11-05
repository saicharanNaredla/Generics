public class Test{
    static <T> void genericDisplay (T element)
    {
        System.out.println(element.getClass().getName() + "=" + element);
    }
    public static void main(String args[])
    {
        genericDisplay(3456);
        genericDisplay("Saicharan naredla");
        genericDisplay(2.0);
    }

}
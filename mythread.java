public class mythread extends Thread {
    String name;
    public mythread(String n)
    {
        name = n;
    }
    public void run()
    {
        System.out.println(name+" is running...");
    }
}

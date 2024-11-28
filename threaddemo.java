public class threaddemo {
    public static void main(String[] args) {
        mythread t1 = new mythread("Thread1");
        mythread t2 = new mythread("Thread2");
        t1.setPriority(2);
        t2.setPriority(10);
        t1.start();
        t2.start();
        System.out.println("Priority of t1: "+t1.getPriority()+"with id and name:"+t1.getName());
    }
    
}

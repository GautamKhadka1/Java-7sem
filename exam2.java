public class exam2 {
    private int feet;
    private float inch;
    public exam2()
    {
        feet = 10;
        inch = 10.5f;
    }
    public void sumandcompare()
    {
        float sum = (float)feet+(inch/12);
        System.out.println(sum);

    }
    public static void main(String[] args) {
        exam2 e = new exam2();
        e.sumandcompare();
    }
}

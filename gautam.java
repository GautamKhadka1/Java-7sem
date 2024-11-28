
public class gautam extends Human{

    String gender;
    gautam(int legs, int eyes, String gender)
    {
        super(legs, eyes);
        this.gender = gender;
    }
@Override public void display()
{
    System.out.print("Gautam ");
    super.display();
    System.out.print(" and is "+gender);
}
}

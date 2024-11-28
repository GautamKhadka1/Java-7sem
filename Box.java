public class Box {
    
        double height;
        double width, length;
        Box(double h, double w, double l)
        {
            height= h;
            width = w;
            length = l;
        }
        public void volume()
        {
            System.out.println("The volume of the box is "+height*width*length);
        }
    
}

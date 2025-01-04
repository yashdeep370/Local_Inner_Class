public class local {
    public static void main(String[] args) {
        outer o = new outer();
        o.display();
    }
}

class outer 
{
    void display()
    {
        class inner
        {
            void innerdisplay()
            {
                System.out.println("hello");
            }
        }
        inner i = new inner();
        i.innerdisplay();
    }
}
import java.util.Scanner;

class reverse {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string ");
        String p= sc.nextLine();
        System.out.println("enter second string ");
        String g=sc.nextLine();
        
        int plen=p.length();
        int glen=p.length();
        int count=0;
        int i;

        if(plen != glen)
        {
            System.out.println("not equal");
        }
        else
        {
            for(i=0;i<plen;i++)
            {
                if(p.charAt(i) != g.charAt(i))
                {
                    count=1;
                    break;
                }
              
            }

        }
        if(count==1)
        {
            System.out.println("not equal");
        }
        else
        {
            System.out.println("equal");
        }

    }
}
import java.util.Scanner;

public class Palidrom {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String p= sc.nextLine();
            int i;
            int count=0;
           
        for(i=0;i<p.length();i++)
        {
            if(p.charAt(i) != p.charAt(p.length()-i-1))
            {
                    count=1;
            }
        }
        if(count==0)
        {
            System.out.println("palidrom");
        }
        else
        {
            System.out.println("not palidrom");
        }
    

    }
}

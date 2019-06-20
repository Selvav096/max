import java.util.*;
import java.util.HashMap;
import java.util.Set;
public class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        String a=s.nextLine().toLowerCase();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        char []  b=a.toCharArray();
        int count=0;
        for (char c : b)
        {
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }
        for (Character ch :b)
        {
            if(hm.get(ch) >1)
            {
                count++;
            }
        }
        int t=a.length()-count/2;
        System.out.print(t);
    }
}

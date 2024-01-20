import java.util.*;
import java.lang.StringBuffer;
public class JavaStringBufferDelete
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String inputString=sc.nextLine();
        System.out.print("start index: ");
        int startIndex=sc.nextInt();
        System.out.print("end index: ");
        int endIndex=sc.nextInt();
        StringBuffer ste=new StringBuffer(inputString);
        ste.delete(startIndex,endIndex);
        System.out.print("Result after delete: "+ste.toString()+"\n");
    }
}
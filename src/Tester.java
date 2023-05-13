import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester 
{

	
	public static void main(String[] args) throws FileNotFoundException 
	{
		File fle = new File("address.txt");
		Scanner scn = new Scanner(fle);
		
		do
        {
            String IP = scn.nextLine();
            System.out.println(IP.matches(new MyRegex().pattern));
    
	
        }while(scn.hasNext());
	}
	
}

class MyRegex 
{
    public String pattern = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
}

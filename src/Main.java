import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arrStr={"manh","tien","nhien","hong"};
        System.out.print("enter what you wanna find: ");
        Scanner sc=new Scanner(System.in);
        String name_toFind= sc.nextLine();
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equalsIgnoreCase(name_toFind)){
                int getIndex= Arrays.asList(arrStr).indexOf(arrStr[i])+1;
                System.out.println("the position of this element in the array is: "+getIndex);
            }
        }

    }
}

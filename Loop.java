import java.util.*;
public class Loop {
    public static void main(String[] args) {
        // for (int i = 0; i <= 10; i++) {
        //     System.out.println(i);
        // }
        // int i=0;
        // while(i<10){
        //     System.out.println("This is a while loop with i = " + i);
        //     i++;
        // }
        // i=0;
        // do { 
        //     System.out.println("This is a do-while loop with i = " + i);
        //     i++;
        // } while (i<11);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
         
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println(sum);


    }
}
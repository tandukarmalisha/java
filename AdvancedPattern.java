public class AdvancedPattern {
    public static void main(String args[]){
        /*
 *                 *
 * *             * *
 * * *         * * *
 * * * *     * * * *
 * * * * * * * * * *
 * * * * * * * * * *
 * * * *     * * * *
 * * *         * * *
 * *             * *
 *                *
 */
int n = 5;
//upper half
for (int i=1; i<=n; i++){
    for (int j=1; j<=i; j++){
        System.out.print("*");
    }
    int spaces = 2*(n-i);
    for (int j=1;j<=spaces; j++){
        System.out.print(" ");
    }
    for (int j=1; j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
//lower half
for (int i=n;i>=1;i--){
    for (int j=1; j<=i; j++){
        System.out.print("*");
    }
    //spaces
    int spaces = 2*(n-i);
    for (int j=1;j<=spaces;j++){
        System.out.print(" ");
    }
    for (int j=1; j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
//Solid Rhombus
/*
 
        * * * * *
      * * * * *
    * * * * *    
  * * * * *
* * * * *
 */

for (int i=1; i<=n; i++){
    for (int j=1; j<=(n-i); j++){
        System.out.print(" ");
    }
    for (int j=1; j<=5; j++){
        System.out.print("*");
    }
    System.out.println();
}
//Pyramid Pattern
/*
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
*/
for (int i=1; i<=n; i++){
    //spaces
    for (int j=1; j<=(n-i); j++){
        System.out.print(" ");
    }
    //numbers
    for (int j=1; j<=i; j++){
        System.out.print(i+" ");
    }
    System.out.println();
} 
System.out.println();
// Palindromic Pattern
/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 */
for (int i=1; i<=n; i++){
    //spaces
    for (int j=1; j<=(n-i); j++){
        System.out.print(" ");
    }
    //numbers
    for (int j=i; j>=1;j--){
        System.out.print(j);
    }
    for (int j=2; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
}
//diamond pattern
/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */
//upper half
for (int i=1; i<=n; i++){
    //spaces
    for (int j=1; j<=(n-i); j++){
        System.out.print(" ");
    }
    //stars
    for (int j=1; j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();

    }
    for (int i=n; i>=1; i--){
        //spaces
        for (int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        //stars
        for (int j=1; j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    
        }

}
}

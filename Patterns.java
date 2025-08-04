public class Patterns{
public static void main(String[] args) {
    int m = 4;
    int n = 5;

    /*
     * * * * * 
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    for (int i=1; i<=m; i++){
        for (int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();

    }

    for (int i=0; i<=m; i++){
        for (int j=0; j<=n; j++){
            if (i == 1 || j == 1 || j == n || i == m){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            
        }
    System.out.println();
    }
    /*
    *
    * *
    * * *
    * * * *
    * * * * *
     */
    for (int i=1; i<=n;i++){
        for (int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();

    /*
     * * * * *
     * * * *
     * * *
     * *
     * 
     */
    for (int i=n; i>=1;i--){
        for (int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
/*
            *
          * *
        * * *
      * * * *
    * * * * *
*/
    for (int i=1; i<=n;i++){
        for (int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
/*
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 */
    for (int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+ " ");
        }
        System.out.println();
    }
    System.out.println();
    /*
     1 2 3 4 5 
     1 2 3 4
     1 2 3
     1 2
     1
     */
    for(int i=1;i<=n;i++){
        for (int j=1; j<=n-i+1; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    /*
     1
     2 3
     4 5 6
     7 8 9 10
     11 12 13 14 15
     */
     int number = 1;
     for (int i=0; i<=n; i++){
        for (int j=1;j<i;j++){
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
     }
    /*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    */
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            if ((i+j)%2 == 0){
            System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
    }
    System.out.println();
}
}
}


package src;

public class Patterns
{
    public static void main(String[] args) {
        patternSeven(4);
    }

    private static void patternOne() {
        //PatternOne
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void patternTwo() {
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    private static void patternThree(int n) {
        for(int i=0;i<n;i++){
            int print=0;
            for(int j=0;j<n-i;j++){
                System.out.print(++print);
            }
            System.out.println();
        }
    }
    private static void patternFour(int n) {
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int l=1;l<=(2*i-1);l++){
                System.out.print("*");
            }
            //space
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void patternFive(int n) {
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int l=1;l<=2*(n-i)+1;l++){
                System.out.print("*");
            }
            //space
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void patternSix() {
        //PatternSix
        int start=1;
        for(int i=0;i<5;i++){
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start; //flipping
            }
            System.out.println();
        }
    }
    private static void patternSeven(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //star
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            //space
            for(int k=1;k<=i;k++){
                System.out.print(i-k+1);
            }
            System.out.println();
        }
    }

    //DO 10 AND THEN START WITH 14-22
}

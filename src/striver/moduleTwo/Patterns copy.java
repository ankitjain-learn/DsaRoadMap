package src.striver.moduleTwo;

public class Patterns
{
    public static void main(String[] args) {
        patternTen(5);
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
    private static void patternEight(int n){
        int i=1;
        for(i=1;i<=n/2+1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=i;k<=n;k++){
            for(int j=1;j<=n-k+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void patternNine(int n) {
        for (int i = 1; i <= n; i++) {
            for(int l=1;l<=n-i;l++){
                System.out.print(" ");
            }

            char ch='A';
            for (int j = 1; j <= (2*i -1); j++) {
                if(j<=((2*i-1)/2)+1) {
                    ch = (char) ('A' + j - 1);
                }else{
                    ch = (char) (ch - 1);
                }
                System.out.print(ch);
            }

            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void patternTen(int n){
        int space=0;
        for(int i=1;i<=2*n-1;i++){
            int stars =i;
            if(i>(((2*n-1)/2)+1)) stars = 2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }


            if(i>(((2*n-1)/2)+1)){
                space = space+2;
            }
            else{
                space=2*n-2*i;
            }
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }

            for(int l=1;l<=stars;l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

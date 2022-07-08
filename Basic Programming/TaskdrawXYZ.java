public class TaskdrawXYZ {
    private static void DrawXYZ (int n){
        //Your code is here
        int height;
        height = n;
        int i, j, k;
        String X, Y, Z;

        for(i = 1; i<= n;i += 1) {
            if (i % 3 != 0) {
                System.out.print("Y");
            }
            for (j = 0; j <= n; j += 2) {
                System.out.print("Z");
                for (k = 0; k <= n; k++) {
                    if (k % 3==0) {
                        System.out.print("X");
                        System.out.print("\n");
                    }
                }
                break;
            }
        }
    }
    public static void main(String[] args){
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
}
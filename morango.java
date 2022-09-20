import java.util.Scanner;

public class morango {
    static int meuMetodo1 (int compriA1, int largA1){
    int z = compriA1 * largA1;
    return z;
    }

    static int meuMetodo2 (int compriA2, int largA2){
        int y = compriA2 * largA2;
        return y;
    }
    public static void main(String[] args){
        Scanner A = new Scanner (System.in);
        int compriA1 = A.nextInt();
        int largA1 = A.nextInt();
        int compriA2 = A.nextInt();
        int largA2 = A.nextInt();
        int z = meuMetodo1 (compriA1, largA1);
        int y = meuMetodo2 (compriA2, largA2);

            if(z>y){
                System.out.println(z);
            }else
                System.out.println(y);
    }
}
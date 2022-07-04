import java.util.Scanner;

public class tek {
    public static void main(String[] args) {
        int k, total=0;

        Scanner in= new Scanner(System.in);

        do {
            System.out.println("Your Number: ");
            k = in.nextInt();
            if (k %2 == 0) {
                if ( k % 4 ==0) {
                    total += k;

                }
            }

        } while(k %2 ==0) ;
        System.out.println("Toplam: "+ total);
    }
}



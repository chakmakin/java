import java.util.Scanner;

public class TwoDMatrix {
    public static void main(String[] args) {
        int arr[][]  = new int [3][4];
        Scanner scanner  = new Scanner(System.in);
        for(int i = 0; i<3; i++) {
            for (int j = 0; j<4; j++) {
                System.out.print("Enter Element for ["+i+"]["+j+"] th element ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("DATA ENTERED ARE");
        for(int i = 0; i<3; i++) {
            for (int j = 0; j<4; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}

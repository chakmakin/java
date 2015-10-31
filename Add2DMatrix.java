import java.util.Scanner;

public class Add2DMatrix {
    public static void main(String[] args) {
        int arr1[][]  = new int [3][4];
        int arr2[][]  = new int [3][4];
        int arr3[][]  = new int [3][4];
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter data for first array");
        for(int i = 0; i<3; i++) {
            for (int j = 0; j<4; j++) {
                System.out.print("Enter Element for arr1["+i+"]["+j+"] th element ");
                arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter data for second array");
        for(int i = 0; i<3; i++) {
            for (int j = 0; j<4; j++) {
                System.out.print("Enter Element for arr2["+i+"]["+j+"] th element ");
                arr2[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i<3; i++) {
            for (int j = 0; j<4; j++) {
                arr3[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("MATRIX AFTER ADDITION");
        for(int i = 0; i<3; i++) {
            for (int j = 0; j<4; j++) {
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}

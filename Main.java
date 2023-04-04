package gl.com.labsessionproblem2;


import java.util.Scanner;

public class Main {

    public void sortDenominations(int[] arr) {  // This method is used for sorting the array

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public void tenderNotes(int[] denoms, int amount, int[] noOfNotes) {

        int i = 0;

        while (amount > 0 && i < denoms.length) {

            noOfNotes[i] = amount / denoms[i];
            amount = amount % denoms[i];
            i++;

        }

        if (amount > 0) {
            System.out.println("Not enough denominations to tender");
        } else {
            System.out.println("Your payment approach in order to give min no of notes will be:");
            for (int j = 0; j < denoms.length; j++) {
                if (noOfNotes[j] > 0) {

                    System.out.println(denoms[j] + " : " + noOfNotes[j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of currency denominations: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size invalid"); // Taking care of edge cases
            sc.close();
            return;
        }

        int[] denoms = new int[n];
        int[] noOfNotes = new int[n];

        System.out.println("Enter the currency denominations value: ");
        for (int i = 0; i < n; i++) {
            denoms[i] = sc.nextInt();
        }

        System.out.println("Enter the amount you want to pay: ");
        int amount = sc.nextInt();

        Main object = new Main();

        object.sortDenominations(denoms);

        object.tenderNotes(denoms, amount, noOfNotes);

        sc.close();

    }

}
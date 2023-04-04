package gl.com.labsession2.problem1;

import java.util.Scanner;

public class Targets {

    public static int checkTargetIsAchieved(int[] arr, int target) {

        int numberOfTransactions = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum >= target) {
                numberOfTransactions = i + 1;
                break;
            }
        }
        return numberOfTransactions;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of transaction array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Size must be atlest 1");
            sc.close();
            return;
        }

        int arr[] = new int[size];
        System.out.println("Enter the values of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the total no of targets that needs to be achieved: ");
        int numberOfTargets = sc.nextInt();

        for (int i = 0; i < numberOfTargets; i++) {

            System.out.println("Enter the value of target " + (i + 1) + " :");
            int target = sc.nextInt();

            int noOfTransactions = checkTargetIsAchieved(arr, target);

            if (noOfTransactions > 0) {
                System.out.println("Target achieved after " + noOfTransactions + " transactions.\n");
            } else {
                System.out.println("Given target is not achieved.\n");
            }

        }

        sc.close();
    }
}
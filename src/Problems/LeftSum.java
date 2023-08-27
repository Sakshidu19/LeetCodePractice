package Problems;

import java.util.Scanner;
import java.util.*;

public class LeftSum {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int s = sc.nextInt();
        System.out.println("Enter the array");
        int [] arr = new int[s];
        for(int i=0; i< arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int [] ls= new int[s];
        ls[0] = arr[0];
        System.out.println("Left sum of array");
        for(int i=1; i<s; i++)
        {
            ls[i]=ls[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(ls));

        System.out.println("Right sum of array");
        int [] rs = new int[s];
        for(int i=s-2; i>=0; i--)
        {
            rs[i]=rs[i+1] + arr[i+1];
        }
        System.out.println(Arrays.toString(rs));
    }
}


import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size array: ");
        int size = input.nextInt();
        int[] num = new  int[size];
        for (int i = 0; i < num.length; i++){
            System.out.println("Enter element " + i + " : ");
            num[i] = input.nextInt();
        }
        int index = minValue(num);
        System.out.println("Array Number is: ");
        for (int element: num) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("The smallest element in the array is: " + num[index]);
    }
    public static int minValue(int[] numbers){
        int min = numbers[0];
        int index = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
                index = i;
            }
        }
        return index;
    }
}

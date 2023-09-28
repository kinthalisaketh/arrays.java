public class arrays {
    public static void main(String[] args){
                // Declare and initialize an integer array
                int[] numbers = {1, 2, 3, 4, 5};
        
                // Access and print array elements
                System.out.println("Array elements:");
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("Element at index " + i + ": " + numbers[i]);
                }
        
                // Calculate the sum of array elements
                int sum = 0;
                for (int num : numbers) {
                    sum += num;
                }
                System.out.println("Sum of array elements: " + sum);
        
                // Find the maximum element in the array
                int max = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
                System.out.println("Maximum element in the array: " + max);
        
                // Initialize and print a 2D array
                int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                System.out.println("2D Array elements:");
                for (int row = 0; row < matrix.length; row++) {
                    for (int col = 0; col < matrix[row].length; col++) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
            }
        }
        

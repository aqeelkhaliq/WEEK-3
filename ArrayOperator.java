package P23;
import java.util.*;

public class ArrayOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[100];
        
        // Input initial array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        while (true) {
            
            System.out.println("ARRAY OPERATION MENU");
            System.out.println("1. USING TRAVERSAL OPERATION");
            System.out.println("2. USING INSERT OPERATION");
            System.out.println("3. USING DELETE OPERATION");
            System.out.println("4. USING SEARCH OPERATION");
            System.out.println("5. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Case 1: Traversal
                    System.out.println("Array elements:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    // Case 2: Insertion
                    System.out.println("Insert Element:");
                    System.out.println("1. At Beginning");
                    System.out.println("2. At Given Position");
                    System.out.println("3. At End");
                    System.out.print("Enter your choice: ");
                    int insertionChoice = sc.nextInt();
                    System.out.print("Enter element to insert: ");
                    int ele = sc.nextInt();

                    if (n >= 100) {
                        System.out.println("Array is full. Cannot insert more elements.");
                        break;
                    }

                    if (insertionChoice == 1) {
                        for (int i = n; i > 0; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[0] = ele;
                        n++;
                        System.out.println("Element inserted at the beginning.");
                    } else if (insertionChoice == 2) {
                        System.out.print("Enter position (1 to " + (n + 1) + "): ");
                        int pos = sc.nextInt();
                        if (pos >= 1 && pos <= n + 1) {
                            for (int i = n; i >= pos; i--) {
                                arr[i] = arr[i - 1];
                            }
                            arr[pos - 1] = ele;
                            n++;
                            System.out.println("Element inserted at position " + pos + ".");
                        } else {
                            System.out.println("Invalid position!");
                        }
                    } else if (insertionChoice == 3) {
                        arr[n] = ele;
                        n++;
                        System.out.println("Element inserted at the end.");
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    
                    // Print the array after  insertion
                    System.out.println("Array after insertion:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    //  Deletion
                    System.out.println("Delete Element:");
                    System.out.println("1. From Beginning");
                    System.out.println("2. From Given Position");
                    System.out.println("3. From End");
                    System.out.print("Enter your choice: ");
                    int deleteChoice = sc.nextInt();

                    if (n == 0) {
                        System.out.println("Array is empty. Nothing to delete!");
                        break;
                    }

                    if (deleteChoice == 1) {
                        for (int i = 0; i < n - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        n--;
                        System.out.println("Element deleted from the beginning.");
                    } else if (deleteChoice == 2) {
                        System.out.print("Enter position (1 to " + n+ "): ");
                        int pos = sc.nextInt();
                        if (pos >= 1 && pos <= n) {
                            for (int i = pos - 1; i < n - 1; i++) {
                                arr[i] = arr[i + 1];
                            }
                            n--;
                            System.out.println("Element deleted from position " + pos + ".");
                        } else {
                            System.out.println("Invalid position!");
                        }
                    } else if (deleteChoice == 3) {
                        n--;
                        System.out.println("Element deleted from the end.");
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    
                    // Print the array after a successful deletion
                    System.out.println("Array after deletion:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    //  Search
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element " + key + " found at position: " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element " + key + " not found in the array.");
                    }
                    break;

                case 5:
                    //  Exit
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

package P1;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Static Array");
            System.out.println("2. Dynamic Array");
            System.out.println("3. Exit Program");
            System.out.print("Enter your choice: ");
            int type = sc.nextInt();

            switch (type) {
                case 1:
                    staticArrayMenu(sc); // ⚡ goes to static array submenu
                    break;

                case 2:
                    dynamicArrayMenu(sc); // ⚡ goes to dynamic array submenu
                    break;

                case 3:
                    System.out.println("Exiting Program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // ===================== STATIC ARRAY =====================
    static void staticArrayMenu(Scanner sc) {
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int count = 0;

        // ⚡ Initial values from user
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            count++;
        }

        int choice;
        while (true) {
            System.out.println("\n--- Static Array Menu ---");
            System.out.println("1. Traversal");
            System.out.println("2. Insertion");
            System.out.println("3. Deletion");
            System.out.println("4. Searching");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Traversal
                    if (count == 0) System.out.println("Array is empty!");
                    else {
                        System.out.print("Array elements: ");
                        for (int i = 0; i < count; i++) System.out.print(arr[i] + " ");
                        System.out.println();
                    }
                    break;

                case 2: // Insertion
                    if (count == size) {
                        System.out.println("Array is full, cannot insert!");
                        break;
                    }
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position (1-" + (count + 1) + "): ");
                    int pos = sc.nextInt();
                    if (pos < 1 || pos > count + 1) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = count; i >= pos; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[pos - 1] = val;
                        count++;
                    }
                    break;

                case 3: // Deletion
                    if (count == 0) {
                        System.out.println("Array is empty!");
                        break;
                    }
                    System.out.print("Enter position to delete (1-" + count + "): ");
                    int dpos = sc.nextInt();
                    if (dpos < 1 || dpos > count) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = dpos - 1; i < count - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        count--;
                    }
                    break;

                case 4: // Searching
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    int flag = -1;
                    for (int i = 0; i < count; i++) {
                        if (arr[i] == key) {
                            flag = i;
                            break;
                        }
                    }
                    if (flag == -1) System.out.println("Element not found!");
                    else System.out.println("Element found at position " + (flag + 1));
                    break;

                case 5:
                    System.out.println("Returning to Main Menu...");
                    return; // ⚡ goes back to MAIN MENU

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ===================== DYNAMIC ARRAY (ArrayList) =====================
    static void dynamicArrayMenu(Scanner sc) {
        ArrayList<Integer> arr = new ArrayList<>();

        // ⚡ Initial values from user
        System.out.print("Enter number of elements to insert initially: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int choice;
        while (true) {
            System.out.println("\n--- Dynamic Array Menu ---");
            System.out.println("1. Traversal");
            System.out.println("2. Insertion");
            System.out.println("3. Deletion");
            System.out.println("4. Searching");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Traversal
                    if (arr.isEmpty()) System.out.println("Array is empty!");
                    else System.out.println("Array elements: " + arr);
                    break;

                case 2: // Insertion
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position (1-" + (arr.size() + 1) + "): ");
                    int pos = sc.nextInt();
                    if (pos < 1 || pos > arr.size() + 1) {
                        System.out.println("Invalid position!");
                    } else {
                        arr.add(pos - 1, val);
                    }
                    break;

                case 3: // Deletion
                    if (arr.isEmpty()) {
                        System.out.println("Array is empty!");
                        break;
                    }
                    System.out.print("Enter position to delete (1-" + arr.size() + "): ");
                    int dpos = sc.nextInt();
                    if (dpos < 1 || dpos > arr.size()) {
                        System.out.println("Invalid position!");
                    } else {
                        arr.remove(dpos - 1);
                    }
                    break;

                case 4: // Searching
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    int idx = arr.indexOf(key);
                    if (idx == -1) System.out.println("Element not found!");
                    else System.out.println("Element found at position " + (idx + 1));
                    break;

                case 5:
                    System.out.println("Returning to Main Menu...");
                    return; // ⚡ goes back to MAIN MENU

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

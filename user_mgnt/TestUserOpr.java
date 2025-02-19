import java.util.Scanner;

public class TestUserOpr {
    public static void main(String[] args) {
        UserOperations uopr = new UserOperations();
        System.out.println("Enter 1 for add");
        System.out.println("Enter 2 for update");
        System.out.println("Enter 3 for delete");
        System.out.println("Enter 4 for list all user");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                uopr.addUser();
                break;
            case 2:
                uopr.updateUser();
                break;
            case 3:
                uopr.deleteUser();
                break;
            case 4:
                User[] users = uopr.listUsers();
                for (User user : users) {
                    System.out.println(user);
                }
                break;
            default:
                System.out.println("Invalid choice");
                ;
                break;
        }

    }
}

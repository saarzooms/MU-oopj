import java.util.Scanner;

public class UserOperations {
    public User users[];
    static int count = 0;

    UserOperations() {
        users = new User[30];
    }

    public void addUser() {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        user.setUsername(sc.nextLine());
        System.out.println("Enter password");
        user.setPassword(sc.nextLine());
        System.out.println("Enter role(admin/user)");
        user.setRole(sc.nextLine());
        users[count++] = user;

    }

    public void updateUser(User user) {

    }

    public void deleteUser(User user) {

    }

    public User validateUser(String username, String password) {
        return new User();
    }

    public User[] listUsers() {
        return users;
    }

    public User findUser(String username) {
        return new User();
    }
}

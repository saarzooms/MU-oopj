import java.util.Scanner;

public class UserOperations {
    public User users[];
    static int count = 0;

    UserOperations() {
        users = new User[30];
    }

    public User readData() {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        user.setUsername(sc.nextLine());
        System.out.println("Enter password");
        user.setPassword(sc.nextLine());
        System.out.println("Enter role(admin/user)");
        user.setRole(sc.nextLine());
        return user;
    }

    public void addUser() {
        User newUser = readData();
        users[count++] = newUser;

    }

    public void updateUser() {
        User user = readData();
        for (int i = 0; i < users.length; i++) {
            if (users[i]
                    .getUsername()
                    .toUpperCase()
                    .equals(
                            user
                                    .getUsername()
                                    .toUpperCase())) {
                users[i] = user;
            }
        }
    }

    public void deleteUser() {
        Scanner sc = new Scanner(System.in);
        String uname = sc.nextLine();
        for (int i = 0; i < users.length; i++) {
            if (users[i]
                    .getUsername()
                    .toUpperCase()
                    .equals(
                            uname
                                    .toUpperCase())) {
                users[i] = null;
            }
        }
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

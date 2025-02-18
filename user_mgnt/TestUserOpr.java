public class TestUserOpr {
    public static void main(String[] args) {
        UserOperations uopr = new UserOperations();
        uopr.addUser();
        User[] users = uopr.listUsers();
        for (User user : users) {
            System.out.println(user);
        }

    }
}

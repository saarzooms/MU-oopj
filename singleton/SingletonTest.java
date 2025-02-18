public class SingletonTest {
    public static void main(String[] args) {
        DBConnect dbObj = DBConnect.getInstance();
        dbObj.setUrlString("a");
        System.out.println(dbObj.getUrlString());
        DBConnect dbObj2 = DBConnect.getInstance();
        dbObj2.setUrlString("b");
        System.out.println(dbObj2.getUrlString());
        DBConnect dbObj3 = DBConnect.getInstance();
        dbObj3.setUrlString("c");
        System.out.println(dbObj3.getUrlString());

        DBConnect dbObj4 = DBConnect.getInstance();
        dbObj4.setUrlString("x");
        System.out.println(dbObj4.getUrlString());

        DBConnect dbObj5 = DBConnect.getInstance();
        dbObj5.setUrlString("bcd");
        System.out.println(dbObj5.getUrlString());
        System.out.println("===================================");
        System.out.println(dbObj.getUrlString());
        System.out.println(dbObj2.getUrlString());
        System.out.println(dbObj3.getUrlString());
        System.out.println(dbObj4.getUrlString());
        System.out.println(dbObj5.getUrlString());
        System.out.println(dbObj);
        System.out.println(dbObj2);
        System.out.println(dbObj3);
        System.out.println(dbObj4);
        System.out.println(dbObj5);

    }
}

class DBConnect {
    private static DBConnect objs[] = new DBConnect[5];
    private String urlString;
    private static int count = 0;

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }

    public String getUrlString() {
        return this.urlString;
    }

    public static DBConnect getInstance() {
        if (objs[count % 5] == null) {
            objs[count % 5] = new DBConnect();
        }
        System.out.println(count);
        count++;
        return objs[(count - 1) % 5];
    }

    private DBConnect() {
        System.out.println("from DBConnect constructor " + count);
    }
}
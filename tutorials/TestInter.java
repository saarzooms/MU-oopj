public class TestInter {
    public static void main(String[] args) {
        MyConn a = new ActualImpl();
        a.connect();
        a.close();
        a.displayDetails();
    }
}

interface MyConn {
    void connect();

    public void displayDetails();

    void close();
}

abstract class ImplConn implements MyConn {
    @Override
    public void displayDetails() {

    }
}

class ActualImpl extends ImplConn {

    @Override
    public void connect() {
    }

    @Override
    public void close() {
    }

}

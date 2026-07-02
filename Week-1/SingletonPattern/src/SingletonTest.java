public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();

        Logger logger2 = Logger.getInstance();

        Logger logger3 = Logger.getInstance();

        logger1.log("Application started");

        logger2.log("User logged in");

        logger3.log("Application ended");

        System.out.println(logger1 == logger2);

        System.out.println(logger2 == logger3);
    }
}
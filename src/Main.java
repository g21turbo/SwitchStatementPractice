public class Main {

    public static void main(String[] args) {

        // The value we will test in the switch statement
        int switchValue = 4;

        // switch statement and the value that will be tested
        switch (switchValue) {

            // The first value we test the switch value against
            case 1:

                // The code that will execute if the value's match
                System.out.println("Value was 1");

                // Prevents any further code from executing if the values above match
                break;
            case 2:
                System.out.println("The value was 2");
                break;
            case 3:
                System.out.println("The value was 3");
                break;
            case 4:
                System.out.println("The value was 4");
                break;
            case 5:
                System.out.println("The value was 5");
                break;
            default:
                System.out.println("The value is not listed");
                break;
        }
    }
}
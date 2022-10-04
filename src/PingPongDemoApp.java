public class PingPongDemoApp {
    public static void main(String[] args) {

        //fori

        for (int number = 1; number < 100; number++) {

            if (number % 6 == 0) {
                System.out.println(number + " ping pong");
            }
            else if (number % 2 == 0) {
                System.out.println(number + " ping");
            }
            else if (number % 3 == 0) {
                System.out.println(number + " pong");
            }
            else {
                System.out.println(number + " -");
            }

        }



    }
}

public class GuessingGame {
    public static void main(String[] args) {
        String p1;
        String p2;


        if(args.length == 2) {
            p1 = args[0];
            p2 = args[1];
        }else{
            p1 = "0";
            p2 = "1000";
        }

        int z = 0;
        try {
            z = Integer.parseInt(p1);
        } catch (NumberFormatException e) {
            System.out.println("You gotta choose an integer as an argument");
            System.out.println("Default values will be used in this game");
        }
        int x = 1000;
        try {
            x = Integer.parseInt(p2);
        } catch (NumberFormatException e) {
            System.out.println("You gotta choose an integer as an argument");
            System.out.println("Default values will be used in this game");
        }

        Guesser guesser = new Guesser(z,x);

        guesser.start();

    }
}

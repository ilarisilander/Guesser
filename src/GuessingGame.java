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

        int z = Integer.parseInt(p1);
        int x = Integer.parseInt(p2);

        Guesser guesser = new Guesser(z,x);

        guesser.start();

    }
}

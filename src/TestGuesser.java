public class TestGuesser {
    public static void main(String[] args) {

        //Correct form
        Guesser guesser = null;
        try {
            guesser = new Guesser(0,1000);
        } catch (Exception e) {
            System.out.println(e + " Your first number is lower");
        }

        //Higher first number
        try {
            Guesser guesser2 = new Guesser(1000,0);
        } catch (Exception e) {
            System.out.println(e + " Your first parameter is higher");
        }

        //Equal numbers
        try {
            Guesser guesser3 = new Guesser(1000,1000);
        } catch (Exception e) {
            System.out.println(e + " Your numbers are equal. ");
        }

        if(guesser.toString().equals("low: 0 high: 1000")){
            System.out.println("Test with 0, 1000 passed!");
        }else{
            System.err.println("Test with 0, 1000 failed!");
        }

    }
}

package LaufzeitProblem;

public class Main {
    public static void main(String[] args){
        int i;
        int j;
        int base = 0;
        String[] numbers = new String[3];
        numbers[0] = "10";
        numbers[1] = "20";
        numbers[2] = "30";

        //Wir gehen die Basen von 10 bis 2 durch
        for (base = 10; base >= 2; --base) {
            //numbers.lenght ist 3, also nicht >=2
            for (j = 0; j < numbers.length; ++j) {

                try {
                    //String wird mit der aktuellen Basis in eine normale Interger umgewandelt
                    i = Integer.parseInt(numbers[j],base);
                    System.out.println(numbers[j]+" base " + base + " = " +i);
                } catch (NumberFormatException e) {
                    //wenn die Zahl in dieser Basis nicht exestiert
                    System.out.println(numbers[j] + " gibt es nicht in Basis " + base + "!");
                }
            }
        }
    }
}

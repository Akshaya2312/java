package One;

import javax.swing.plaf.synth.SynthTextAreaUI;

//Coding children favourite "10 green bottle"

public class BottleSong {
    public static void main (String[] args) {
        int bottlesNum = 10;
        String word = "bottels";

        while (bottlesNum > 0 ) {

            if (bottlesNum ==1 ){
                word = "bottle";
            }
            System.out.println(bottlesNum + " green "  + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green "  + word + ", hanging on the wall");
            System.out.println("And if the green bottle should accidently fall on the wall");
            bottlesNum = bottlesNum-1;

            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottels, hanging on the walls");
            }
        }
    }
}

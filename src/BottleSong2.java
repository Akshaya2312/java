public class BottleSong2 {
    public static void main(String[] args) {
        int bottlesNum = 10;

        while (bottlesNum > 0) {
            String word = (bottlesNum == 1) ? "bottle" : "bottles";
            System.out.println(bottlesNum + " green " + word + " hanging on the wall");
            System.out.println(bottlesNum + " green " + word + " hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall");
            System.out.println("There'll be " + --bottlesNum + " green " + ((bottlesNum == 1) ? "bottle" : "bottles") + " hanging on the wall");

            if (bottlesNum == 0) {
                System.out.println("There'll be no green bottles hanging on the wall");
            }
        }
    }
}


package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <=sideLength; i++) {
            if (i==(sideLength+1)/2) {
                for (int j = 0; j < sideLength; j++) {
                    System.out.print("8");
                }
            } else {
                for (int j = 1; j <= sideLength; j++) {
                    if (j == (sideLength+1)/2){
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}

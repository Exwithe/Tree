public class Main {

    //file formatting
    public static void main(String[] args) {

        int hight = 19;

        int l = 1;
        for (int enter = 0; enter < hight * 2; enter++) {
            for (int space = 0; space < l; space++) {
                for (int star = 1; star != 0; star--) {
                    System.out.print("*");
                }
            }
            System.out.println();
            if (enter + 1 >= hight)
            {
                l--;
            }
                else {
                l++;
            }
        }


    }


}


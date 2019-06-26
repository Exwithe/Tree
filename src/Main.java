public class Main {

    public static void main(String[] args) {

            int l = 1;
            int dir = +1;
            for(int i = 0; i < 6; i++) {


                for(int j = 0; j < l; j++) {
                    System.out.print("***");

                }
                l = l +  dir;
                System.out.println();
            }
            dir = -1;
            for(int i = 0; i < 7; i++) {


                for(int j = 0; j < l; j++) {
                    System.out.print("***");

                }
                l = l +  dir;
                System.out.println();
            }
        }

    }



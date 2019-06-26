public class Main {

    //file formatting
    public static void main(String[] args) {

            int l = 1;
            int dir = 1; //warum das +?
            for(int enter = 0; enter < 6; enter++) { // die beiden fors von line 8, 19 sehen doch gleich aus nicht kann man das nicht noch abändern


                for(int space = 0; space < l; space++) {
                    System.out.print("***");
                }
                l = l +  dir; //man l = l + dir; anders schreiben kann
                System.out.println();
                
            }
            dir = -1; // warum nicht dir 1 lassen und einfach
            for(int i = 0; i < 7; i++) {


                for(int j = 0; j < l; j++) {
                    System.out.print("***");

                }
                l = l +  dir; // wechseln auf sehe 17 line zudem überlege dir wie man l = l + dir; anders schreiben kann
                System.out.println();
            }
        }

    }



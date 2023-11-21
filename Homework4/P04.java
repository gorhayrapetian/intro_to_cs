public class P04 {
    public static void main(String[] args) {
        int nOfDucks = 5;
        char bill;
        char eye;

        for (int i=0; i<1; i++) {
            for (int j=0; j<nOfDucks; j++) {
                if (j%3 == 0) {
                    bill = '<';
                } else if((j+1)%3==0) {
                    bill = '>';
                } else {
                    bill = '=';
                }

                if (j%2==0){
                    eye = '^';
                } else {
                    eye = '-';
                }
                System.out.print("____("+eye+")"+bill+" ");
            }
            System.out.println();
        }

        for (int i=0; i<nOfDucks; i++) {
            System.out.print("\\___/    ");
        }

    }
}

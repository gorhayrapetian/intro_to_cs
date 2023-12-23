public class P03{
    public static void main(String[] args){
        double number = 278.7;

        int integer = (int) number;
        double decimal = number - integer;

        // if-else
        if(decimal>=0.5){
            System.out.println("Round Up");
        } else{
            System.out.println("Round Down");
        }

        // ternary operator
        String result = (decimal>=0.5) ? "Round Up" : "Round Down";
        System.out.println(result);

    }
}

public class Main {
    public static void main(String[] args) {
        String city = "Columbus";
        int zipCode = 43215;
        System.out.println("City: "+city);
        System.out.println("Zip code: "+zipCode);



        double dailyHighs[] = {32, 25, 27,40,45};
        double total = 0;

        for(int i = 0; i<5; i++){
            total = dailyHighs[i] + total;
        }
        System.out.println("Average High Temperature: "+ total/5);

    }
}
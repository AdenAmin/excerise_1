public class Main {
    public static void main(String[] args) {
        String city = "Columbus";
        int zipCode = 43215;
        System.out.println(city);
        System.out.println(zipCode);



        double dailyHighs[] = {32, 25, 27,40,45};
        double total = 0;

        for(int i = 0; i<5; i++){
            total = dailyHighs[i] + total;
        }
        System.out.println(total/5);

    }
}
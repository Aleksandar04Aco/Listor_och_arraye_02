import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
          //uppg1();
          //uppg2();
          //uppg3();
          //uppg4();
          //uppg5();
          //uppg7();
            uppg8();
        }

        public static void uppg1() {
            Scanner myscan= new Scanner(System.in);
            String[] leksaker= {"Lego", "Boll", "Gumianka", "Leksaksbil", "Docka"};

        }


        public static void uppg2(){
            String [] leksaker= {"Lego", "Boll", "Gumianka", "Leksaksbil", "Docka"};

                for (int i = 0; i <= 4; i++){
                    System.out.println(leksaker[i]);
                }
        }

    public static void uppg3() {
            String [] klasskamrater= {"Kaleb", "Viktor", "Kiara", "Nova", "Li"};

            for(int i = 0; i <= 4; i++){
                System.out.println(klasskamrater[i]);
            }
    }
    public static void uppg4(){
        int [] siffror= {5,8,4,3,4};

        for(int i = 0; i <= 4; i++){
            System.out.println(siffror[i]);
        }
    }
     public static void uppg5() {
         String[] klasskamrater = {"Kaleb", "Viktor", "Kiara", "Nova", "Li"};
         String[] leksaker = {"Lego", "Boll", "Gumianka", "Leksaksbil", "Docka"};
         int[] siffror = {5, 8, 4, 3, 4};

         for (int i = 0; i <= 4; i++) {
             System.out.println(klasskamrater[i] +" ger " + leksaker[i] +" betyget " + siffror[i]);
         }
     }
    public static void uppg6() {
            String[] cities = {};
        }


    public static void uppg7() {
        ArrayList<String> cities = new ArrayList<>();
        Scanner myscan= new Scanner(System.in);
        String str;

        do{

            str = myscan.next();
cities.add(str);
            System.out.println("hej");
        }while(!str.equals("exit"));

        System.out.println(cities);
        }

    public static void uppg8(){

        ArrayList<String> cities = new ArrayList<>();
        Scanner myscan= new Scanner(System.in);
        String str;

        do{

            str = myscan.next();
            cities.add(str);
            System.out.println("hej");
        }while(!str.equals("exit"));


        for(int i = 0; i< cities.size(); i++){
            System.out.println(cities.get(i));


        }
    }
}

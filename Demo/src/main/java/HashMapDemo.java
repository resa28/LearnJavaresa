import java.util.HashMap;

public class HashMapDemo {
    public static void main(String [] args) {
        HashMap<Integer, String> days = new HashMap<Integer, String>();

        days.put(1, "Ahad");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");

        Sytem.out.println("Content of days: " + days);
        // Replace data
        days.replace(7, "Sabtu malam minggu");
        System.out.println("Content of days: " + days);

        System.out.println("Second of days: " + days.get(2));

        // Delete some day
        days.remove( key : 1);
        System.out.println("Content of days after deleted some days: " + days);

        // Deleted all days
        days.clear();
        System.out.println("Content of days after deleted all days: " + days);


    }
}
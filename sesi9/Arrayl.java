
package geneticcollection9;

import java.util.ArrayList;

public class Arrayl {
    public static void main(String[] args) {
        
        ArrayList <String> makanan = new ArrayList<>();
        makanan.add("kue kering");
        makanan.add("kue tradisional");
        makanan.add("kue basah");
        makanan.add("gorengan");
        makanan.forEach((m) -> {
            System.out.println(m);
        });
    }
}

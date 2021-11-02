import java.util.*;
import java.lang.Math;

public class airMancur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Deklarasi Variable
        String teks;
        // Input user
        System.out.print("Masukkan teks yang akan Anda ukur\t: "); teks = sc.nextLine();
        System.out.println("Jumlah tiles yang Anda perlukan\t\t: " + jumlahUbin(teks));
        System.out.println("Anda membutuhkan lebar lahan minimum\t: " + lebarTiles(jumlahUbin(teks)));
        sc.close();
    }

    private static int jumlahUbin(String data) {
        int panjang = data.length();
        int count = 0;

        for(int i = 0; i < panjang; i++) 
        {
            if (Character.isUpperCase(data.charAt(i))) {
                count += 3;
        } else if (Character.isLowerCase(data.charAt(i))) {
            count += 1;
        } else {
            count += 2;
        }        
    }
    return count;
}

    private static int lebarTiles(int keliling) {
        double diameter = keliling / 3.14;

        int hasil = (int) Math.round(diameter);
        return hasil;
    }
}
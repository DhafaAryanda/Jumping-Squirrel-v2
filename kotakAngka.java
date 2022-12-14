
/**
 * Write a description of class kotakAngka here.
 *
 * @author Dhafa Aryanda
 * @version 11.0.11
 * link presentasi: https://drive.google.com/file/d/1bIdzvEANWCb82fzKLm9jMggLHwQmsR7l/view?usp=sharing
 */
public class kotakAngka
{
    // instance variables - replace the example below with your own
    public static int[] baris1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
    public static int[] baris2 = {11, 21, 31, 41, 51, 61, 71, 81, 91};
    private static int[][] tabel;

    /**
     * Constructor for objects of class kotakAngka
     */
    public kotakAngka()
    {
        tabel = new int[][]{
                { 1,  2,  3,  4,  5,  6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };    
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void buatKotak() {
        System.out.println("==============================Jump Squirrel, Jump!===============================");
        System.out.print("=================================================================================\n");
        for (int[] baris : tabel) {
            System.out.print("|");
            for (int angka : baris) {
                System.out.print("  " + angka + "\t|");
            }
            System.out.print("\n");
        }
        System.out.println("=================================================================================");
    }
    
    //Method untuk menentukan posisi awal tupai secara random
    public static int tambahSquirrel() {
        int tambahSquirrel, min = 1, max = 99;
        tambahSquirrel = (int) (min + Math.random() * (max - min));
        return tambahSquirrel;
    }
    
    //Method untuk menentukan jumlah kesempatan
    public static int kesempatan(int tambahSquirrel) {
        int kesempatan;
        if (tambahSquirrel > 50)
            kesempatan = 10;
        else {
            kesempatan = 20;
        }
        return kesempatan;
    }
}

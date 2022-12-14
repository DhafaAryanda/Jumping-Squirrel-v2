
/**
 * Write a description of class mainSquirrelJump here.
 *
 * @author Dhafa Aryanda
 * @version 11.0.11
 * link presentasi: https://drive.google.com/file/d/1bIdzvEANWCb82fzKLm9jMggLHwQmsR7l/view?usp=sharing
 */

import java.util.Scanner;

public class mainSquirrelJump
{
    public static void mainMenu() {
        System.out.println("========= MAIN MENU =========");
        System.out.println("\t1. Play");
        System.out.println("\t2. Exit");
        System.out.println("=============================");
        System.out.print("Masukkan pilihan (1/2) : ");
    }
    
    public static void main(String[] args) {
        char restart;
        int jumlahLompat = 0;
        int nol = 0;
        int posisiTupai;
        String inputNama;
        boolean squirrel;

        //looping menggunakan do while
        do {
            int pilih;
            Scanner userInput = new Scanner(System.in);
            kotakAngka tabel1 = new kotakAngka();
            pemain pemain1 = new pemain();
            mainMenu();
            pilih = userInput.nextInt();
            if (pilih == 1) {
                System.out.print("Masukkan nama anda: ");
                inputNama = userInput.next();
                pemain1.setNama(inputNama);
                squirrel = true;
                pemain1.buatSquirrel(squirrel);
                System.out.print("\n~Halo ");
                System.out.print(pemain1.getNama());
                System.out.println(" terimakasih sudah bermain, semoga tupai anda mencapai finish~ \n");
            } else if (pilih == 2) {
                System.out.println("Anda keluar");
                break;
            } else {
                System.out.println("inputan tidak valid");
                break;
            }

            posisiTupai = kotakAngka.tambahSquirrel();

            //total kesempatan yang dimiliki
            int totalKesempatan = kotakAngka.kesempatan(posisiTupai);
            int kesempatan;
            if (posisiTupai > 50)
                kesempatan = 10;
            else {
                kesempatan = 20;
            }

            tabel1.buatKotak();
            System.out.println("\n--== Perhatian ==--");
            System.out.println("Anda diminta untuk menggerakkan tupai hingga finish pada angka 100");
            System.out.println("Tupai dapat melompat ke arah kanan, kiri, atas, dan bawah");
            System.out.println("Jika tupai kehabisan kesempatan melompat maka dinyatakan kalah");
            System.out.println("\n~~~Let's start this game!~~~\n");
            System.out.println("Tupai berada pada angka : " + posisiTupai);
            //looping untuk menampilkan sisa kesempatan melompat, jumlah lompatan,
            //serta meminta input untuk lompatan yang ingin dituju dan mengulang permainan
            for (int nilai = 0; nilai < totalKesempatan; nilai++) {
                System.out.print("\nKesempatan melompat tersisa " + (kesempatan--) + ("\n"));
                System.out.print("Melompat ke angka : ");
                int lompat = userInput.nextInt();
                int j;
                boolean test1 = false;
                boolean test2 = false;
                jumlahLompat++;
                //Aturan untuk melakukan lompatan
                if ((lompat - posisiTupai == 10)                //melompat ke angka yang berada di bawah
                        || (lompat - posisiTupai == 1)          //melompat ke angka yang berada di kenan
                        || (posisiTupai - lompat == 10)         //melompat ke angka yang berada di atas
                        || (posisiTupai - lompat == 1)) {       //melompat ke angka yang berada di kiri
                    for (j = 0; j <= 8; j++) {
                        if (posisiTupai == kotakAngka.baris1[j]) {
                            test1 = true;
                            break;
                        } else if (posisiTupai == kotakAngka.baris2[j]) {
                            test2 = true;
                            break;
                        }
                    }
                    if (test1) {
                        if ((lompat - posisiTupai == 10)
                                || (lompat - posisiTupai == 1)
                                || (posisiTupai - lompat == 10)
                                || (posisiTupai - lompat == 1)) {
                            posisiTupai = lompat;
                            System.out.print("\nTupai pada angka : " + posisiTupai);
                            if (posisiTupai == 100) {
                                System.out.println("\nSelamat! tupai telah berhasil sampai di angka 100");
                                break;
                            }
                        } else {
                            // nilai = nilai - 1;
                            jumlahLompat -= 1;
                            System.out.println("\n~Salah lompat, Coba lagi");
                            System.out.print("\nTupai pada angka : " + posisiTupai);
                        }
                    } else if (test2) {
                        if ((lompat - posisiTupai == 10)
                                || (lompat - posisiTupai == 1)
                                || (posisiTupai - lompat == 10)
                                || (posisiTupai - lompat == 1)) {
                            posisiTupai = lompat;
                            System.out.print("\nTupai pada angka : " + posisiTupai);
                            if (posisiTupai == 100) {
                                System.out.println("\nSelamat! tupai telah berhasil sampai di angka 100");
                                break;
                            }
                        } else {
                            // nilai = nilai - 1;
                            jumlahLompat -= 1;
                            System.out.println("\n~Salah lompat, Coba lagi");
                            System.out.print("\nTupai pada angka : " + posisiTupai);
                        }
                    } else {
                        posisiTupai = lompat;
                        System.out.print("\nTupai pada angka :" + posisiTupai);
                        if (posisiTupai == 100) {
                            System.out.println("\nSelamat! tupai telah berhasil sampai di angka 100");
                            break;
                        }
                    }
                } else {
                    jumlahLompat -= 1;
                    System.out.println("\n~Salah lompat, Coba lagi");
                    System.out.print("\nTupai pada angka :" + posisiTupai);
                }
            }
            if (kesempatan == nol && posisiTupai!=100)
                System.out.println("\n~~ ANDA KALAH ~~");
            pemain1.setNilai(jumlahLompat);
            System.out.println("Jumlah lompatan yaitu : " + pemain1.getNilai());
            System.out.println("\n\nIngin bermain lagi? (y/n)");
            userInput.nextLine();
            restart = userInput.nextLine().charAt(0);
        } while (restart == 'Y' || restart == 'y');

    }
}

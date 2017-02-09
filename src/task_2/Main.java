/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *  NIM = 1301154124
 *  Nama = Muhammad Rakha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa m1 = new Mahasiswa();
        m1.setnim("001");
        m1.setnama("Budi");
        m1.addnilai('C');
        m1.addnilai('D');
        m1.addnilai('B');
        m1.addnilai('D');
        System.out.println(m1);
        // akan mengoutputkan tulisan: 001, Budi, Tidak Lulus, Nilai = C,D,B,D,
        System.out.println(m1.getnilai(2));
        // akan mengoutputkan B

        Mahasiswa m2 = new Mahasiswa("002", "Eka");
        m2.addnilai('A');
        m2.addnilai('B');
        m2.addnilai('E');
        m2.addnilai('C');
        m2.addnilai('B');
        m2.setstatus("Lulus");
        System.out.println(m2);
        // akan mengoutputkan tulisan: 002, Eka, Lulus, Nilai = A,B,E,C,B,

        // output kode berikut harus menghasilkan nilai yang sama yaitu=B
        char h1 = m1.ceknilai(m1);
        char h2 = m2.ceknilai(m2);
        System.out.println("hasil = " + h1 + ", " + h2);

    }

}

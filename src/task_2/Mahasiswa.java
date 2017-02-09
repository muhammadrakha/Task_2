/*
Nama :MUHAMMAD RAKHA
KELAS : IF 39 12
NIM 1301154124
 */
package task_2;

/**
 *
 * @author Muhammad Rakha
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String status;
    private int i;
    private char nilai [];
    
    public Mahasiswa()
    {
        this.status = "Tidak Lulus";
        this.nilai = new char[10];
        this.i=0;
    }
   
    public Mahasiswa(String nim,String nama)
    {
        this.nim = nim;
        this.nama = nama;
        this.status = "Tidak Lulus";
        this.nilai = new char[10];
        this.i = 0;
    }
    
       public String getnim()
       {
        return nim;
       }
       
       public  void  setnim(String nim)
       {
           this.nim = nim;
       }
               
       public String getnama()
       {
           return nama;
       }
       
       public void setnama(String nama)
       {
           this.nama = nama;
       }
       
       public String getstatus()
       {
           return status;
       }
       
       public void setstatus(String status)
       {
           this.status = status;
       }
       
       public char getnilai (int i)
       {
           return nilai [i];
       }
       
       public  void setnilai (char [] nilai)
       {
           this.nilai = nilai;
       }
       
       public  void addnilai (char nilai)
       {
           if (i < 10)
           {
               this.nilai[i] = nilai;
           }
           i++;
       }
       
       public int geti()
       {
           return i;
       }
       
       public void seti ()
       {
           this.i=i;
       }
       
       public String toString()
       {
           String ms = nim + ", " + nama + ", " + status + ", " + "nilai = ";
           for (int a = 0; a<i; a++) {
                ms = ms + nilai[a] + ", "; 
           }
           return ms;
       }
       
       public char ceknilai (Mahasiswa m)
    {
       char z= 0;
       for (char S= 'A'; S < 'E'; S++)
       {
           for (int y = 0; y < i; y++)
           {
               if(nilai[y] == S )
               {
                   for (int n = 0; n<m.i; n++)
                   {
                       if(m.nilai[n] == y)
                       {
                           return S ;
                       }
                   }
               }
           
           }
       }
       return z;
    }                    
}


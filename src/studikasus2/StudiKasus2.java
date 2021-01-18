/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus2;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class StudiKasus2 {
    //Deklarasi
    double r, hasil;
    
    //(void) Inputan User
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola   : ");
        r = input.nextDouble();

    }    
    //(void) Proses   
    void hitung(){
        hasil = Math.PI * r * r * r * 4/3;
    }
    //(non void)
    double hasil(){
        return hasil;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Menghitung Volume Bola\n");
        
        StudiKasus2 Bola = new StudiKasus2();
        Bola.input();
        Bola.hitung();
        
        System.out.println("PI    : "+Math.PI);
        System.out.println("\nVolume  : "+Bola.hasil());
        
    }
    
}
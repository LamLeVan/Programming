/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaphanoi;

/**
 *
 * @author LamLeePC
 * Mota: Cho 3 coc A, B, C. Voi n = 1; Di chuyen truc tiep tu dia A sang C. 
 * Voi n = 2, chuyen dia tu A sang coc trung gian B, sau do chuyen dia tu B sang C
 */
public class ThapHaNoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Cac buoc chuyen nhu sau");
        thapHaNoi(10, 'a', 'c', 'b');
    }
    
    private static void chuyen(int n, char a, char c) {
        System.out.println("Chuyen dia " + n + " tu coc " + a + " sang coc " + c);
    }
    
    private static void thapHaNoi(int n, char a, char c, char b) {
        if (n == 1) {
            chuyen(1, a, c); //Thuc hien chuyen truc tiep tu a sang c
        } else {
            thapHaNoi(n - 1, a, b, c);
           chuyen(n, a, c);
            thapHaNoi(n - 1, b, c, a);
        }
    }
}

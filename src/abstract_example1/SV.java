/*
abtract class
 */
package abstract_example1;

import java.util.Scanner;

public abstract class SV {
    // attributes
    private String hoTen;
    float d1,d2,d3;
    // constructor
    public SV(){    
    }
    public SV(String hoTen, float d1, float d2, float d3){
        this.hoTen = hoTen;
        this.d1= d1;
        this.d2=d2;
        this.d3=d3;
    }
    // set - get (tu viet)
    // nhap
    public void Nhap(){
        System.out.print("\n Nhap thong tin sinh vien: ");
        Scanner inp = new Scanner (System.in);
        System.out.print("\n + Ho ten: ");
        this.hoTen = inp.nextLine();
        System.out.print("\n + Diem nam 1: ");
        this.d1 = inp.nextFloat();
        System.out.print("\n + Diem nam 2: ");
        this.d2 = inp.nextFloat();
        System.out.print("\n + Diem nam 3: ");
        this.d3 = inp.nextFloat();
    }
    // phuong thuc truu tuong Tinh diem
    public abstract float TinhDiem();
    // in thong tin sinh vien
    public void InThongTin(){
        System.out.print("\n In thong tin sinh vien: \n"
                        + " + Ho ten: "+ this.hoTen+"\n"
                        + " + Diem tong ket: "+TinhDiem());
    }
    
}

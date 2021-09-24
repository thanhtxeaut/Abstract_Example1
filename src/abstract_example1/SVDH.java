/*
class: SVDH
 */
package abstract_example1;

import java.util.Scanner;

public class SVDH extends SV{
    // attribute
    float d4;
    // contructor
    public SVDH(){
       System.out.println("\n * SINH VIEN DAI HOC: ");
    }
    public SVDH(String hoTen, float d1, float d2, float d3, float d4){
        super(hoTen,d1,d2,d3);
        this.d4=d4;
    }
    // nhap
    public void Nhap(){
        super.Nhap();
        Scanner inp = new Scanner (System.in);
        System.out.print("\n + Diem nam 4: ");
        this.d4 = inp.nextFloat();
    }
    // tinh diem
    public float TinhDiem(){
        return (d1+d2+d3+d4)/4;
    }
}

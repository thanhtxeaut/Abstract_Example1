/*
Ví dụ: Xây dưng project quản lý điểm
 */
package abstract_example1;


public class Abstract_Example1 {

    public static void main(String[] args) {
        // khai bao doi tuong
        SV cd, dh;
        cd = new SVCD();       
        cd.Nhap();
        cd.InThongTin();
        
        dh=new SVDH();
        dh.Nhap();
        dh.InThongTin();
        
        
    }
    
}

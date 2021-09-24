/*
class: SVCD
 */
package abstract_example1;

public class SVCD extends SV {
    // 
    // constructor
    public SVCD(){
     System.out.println("\n * SINH VIEN CAO DANG: ");
    }
    public SVCD(String hoTen, float d1, float d2, float d3){
        super(hoTen, d1, d2,d3);
    }
    // nhap
    public void Nhap(){
        super.Nhap();
    }
    // Tinh diem
    public float TinhDiem(){
        return (d1+d2+d3)/3;
    }
}

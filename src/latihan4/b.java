/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author USER
 */
public class b extends a{
    private int b;
    public void setB(int nilai){
        b = nilai;
    }
    public int getB(){
        return b;
    }
    
    //melakukan override terhadap method tampilkanNilai() yang terdapat pada kelas A
    
    public void tampilkanNilai (){
        super.tampilkanNilai();//memanggil method dalam kelas A
        System.out.println("Nilai b : "+getB());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author USER
 */
public class truckgunung extends truck{
    public int seatHeight;
    public truckgunung (int startHeight, int startCadence, int startSpeed, int startGear){
        super (startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[] aku) {
        System.out.println("mulai jalan");
        truckgunung MB = new truckgunung(0,0,0,0);
        System.out.println("gear:  "+MB.gear);
        System.out.println("speed:  "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear:  "+ MB.gear);
        System.out.println("speed:  "+ MB.speed);
        MB.speedUp(2);
        System.out.println("gear:  "+ MB.gear);
        System.out.println("speed:  "+ MB.speed);
    }
}

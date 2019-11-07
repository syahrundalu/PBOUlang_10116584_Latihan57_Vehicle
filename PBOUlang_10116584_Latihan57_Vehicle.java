/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan57_vehicle;

/**
 *
 * @author 
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan57_Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle x = new Bicycle();       
        
        x.setMyBrand("Trek Bike");
        x.setMyModel("7.4FX");
        x.setMyGearCount(23);
        
        System.out.println("Brand : "+x.getMyBrand());
        System.out.println("Model : "+x.getMyModel());
        System.out.println("Jumlah Gear : "+x.getMyGearCount());
        System.out.println("");
        
        Skateboard y = new Skateboard();
        
        y.setMyBrand("Ally Skate");
        y.setMyModel("Rocket");
        y.setMyBoardLength(54.5);
        
        System.out.println("Brand : "+y.getMyBrand());
        System.out.println("Model : "+y.getMyModel());
        System.out.println("Jumlah Gear : "+y.getMyBoardLength());
        
    }
    
}

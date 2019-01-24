/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author MochFaisalRasid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person();
        p.setFirstName("Moch. Faisal");
        p.setLastName("Rasid");
        int i = 20;       
        System.out.println(p.getFullName() + " ; " + i);
        i = 42;
        System.out.println(p.getFullName() + " ; " + i);
    }
    
}

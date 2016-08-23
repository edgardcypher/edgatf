/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Instructor
 */
public class testAnimal {
    public static void main(String args[]) {
        /*Cat cat = new Cat();
        cat.beCat();
        Dog dog = new Dog();
        dog.beDog();
        MiniSchnauzer mini = new MiniSchnauzer();
        mini.beDog();*/
        Canines can= new Wolf("blue");
        System.out.println(can.getClass().getName());
        System.out.println(can.toString());
    }
}

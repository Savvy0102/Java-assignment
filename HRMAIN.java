class Animal3 {
     public void eat() {
         System.out.println("Animal is eating");
     }
 }
lass Dog3 extends Animal3 {
     public void bark() {
         System.out.println("Dog is barking");
     }
 }
 
 class Cat extends Animal3 {
     public void meow() {
         System.out.println("Cat is meowing");
     }
 }
 
 class Labrador2 extends Animal3 {
     public void playFetch() {
         System.out.println("Labrador is playing fetch");
     }
 }
 
 public class HRMain {
     public static void main(String[] args) {
         Dog3 myDog = new Dog3();
         myDog.eat();
         myDog.bark();
 
         Cat myCat = new Cat();
         myCat.eat();
         myCat.meow();
 
         Labrador myLab = new Labrador();
         myLab.eat();
         myLab.playFetch();
     }
 }

class Animal2 {
  public void eat() {
     System.out.println("Animal is eating");
        }
 }
 
 public class Dog extends Animal2 {
     public void bark() {
            System.out.println("Dog is barking");
     }
 
     public static void main(String[] args) {
         Dog myDog = new Dog();
         myDog.eat();
         myDog.bark();
     }
 }

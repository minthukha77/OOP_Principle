abstract class Animal{

    abstract void shout();
}


class Duck extends Animal{

     void shout(){

       System.out.println("I am a Duck");

   }
}


class Goat extends Animal{

  void shout(){

       System.out.println("I am a Goat");

   }
}



public class PolyDemo {

   public static void main(String[] args) {

       Animal a = new Duck();
       a.shout();
       a = new Goat();
       a.shout();

       

       
   }
   
}

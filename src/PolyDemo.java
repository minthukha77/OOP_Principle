interface Animal{

     public void shout();
}


class Duck implements Animal{

   public void shout(){

        System.out.println("I am a Duck");

    }
}


class Goat implements Animal{

   public void shout(){

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

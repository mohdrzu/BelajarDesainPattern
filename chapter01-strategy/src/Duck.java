class Duck {
    void quack(){
        System.out.println("Qwek Qwek");
    }

    void swim(){
        System.out.println("Berenang");
    }

    void display(){
        System.out.println("Displaying");
    }

    void fly(){
        System.out.println("Terbang");
    }
}

class MallardDuck extends Duck{
    // Additional method
}

class RedHeadDuck extends Duck{
    // Additional method
}

class RubberDuck extends Duck{
    @Override
    void quack() {
        System.out.println("Bunyinya squeek, bukan qwak");
    }

    @Override
    void fly() {
        System.out.println("Gak bisa terbang");
    }
}

class WoodenDuck extends Duck {
    @Override
    void quack(){
        System.out.println("Gak bisa bersuara");
    }

    @Override
    void swim(){
        System.out.println("Hanya mengambang");
    }

    @Override
    void fly(){
        System.out.println("Gak bisa terbang");
    }
}
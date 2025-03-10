// RestaurantManagement.java
// Problem 10: Restaurant Management System with Hybrid Inheritance
interface Worker {
    void performDuties();
}

class PersonRM {
    String name;
    int id;
    
    public PersonRM(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends PersonRM implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }
    
    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is preparing dishes.");
    }
}

class Waiter extends PersonRM implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }
    
    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving customers.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Worker chef = new Chef("Gordon", 1);
        Worker waiter = new Waiter("James", 2);
        
        chef.performDuties();
        waiter.performDuties();
    }
}

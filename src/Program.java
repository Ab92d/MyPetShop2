public class Program {
    public static void main(String[] args) {
//        Pet obj = new Pet("Fido", 7);
//        Pet obj1 = new Pet("Bob", 8);
//        System.out.println(obj.getName() + " " + obj.getAge());
//        obj.getsOlder();

        Dog d = new Dog("Lollie", 6);
        System.out.println(d.getName());
        d.makeSound();
        d.dig();

        Cat c = new Cat("Simba", 12, "Black Cat");
        System.out.println(c.getName());
        c.makeSound();

//        Pet p = new Pet("Trixy", 2);
//        System.out.println(p.getName);
//        p.makeSound();

        BorderCollie bc = new BorderCollie("Jeff", 4);
        System.out.println(bc.getName());
        bc.makeSound();

        Bird b = new Bird("Sweetie", 6,3.5f);
        System.out.println(b.getName());
        b.makeSound();
    }

}


public class Test {
    public static void main(String[] args){
        //Animal animal=new Dog();
       // animal.eat();
       // animal.bark; нет доступа
        Dog dog=new Dog();
        dog.bark();
        dog.eat();//
System.out.println("-------------");
        Animal animal=new Animal();
        Cat cat=new Cat();

        test(animal);
        test(cat);
        test(dog);
    }


    public static void test(Animal animal){
        animal.eat();
    }
}

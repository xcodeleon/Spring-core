package Education;


/*
* Класс показывающий перегрузку методов
*
*
 */


class Dog {

    Dog(){
        System.out.println("Собака лает");
    }
    Dog(String s){
        System.out.println("собака лает " + s);
    }

    Dog(int age){
        System.out.println("Возраст собаки " + age);
    }

    void bark(){
        System.out.println("Собака лает");
    }

    void bark(String s){
        System.out.println("собака лает " + s);
    }

    void bark(int age){
        System.out.println("Возраст собаки " + age);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++ ){
            Dog dog = new Dog(i);

            dog.bark();
            dog.bark(5);
            dog.bark("Гав-гав!!!");
        }

new Dog();
    }
}

class Animal1 {
    void eat(){
        System.out.println("Dog eating a food");
    }

    class Dog extends Animal1 {
        void bark() {
            System.out.println("Dog barking ");
        }
    }
    class Puppy extends Dog {
        void play() {
            System.out.println("Puppy is playing  ");
        }
    }
    class Main {
        public static void main(String[] args) {

            Puppy p = new Puppy();

            p.eat();
            p.bark();
            p.play();
    }
    }

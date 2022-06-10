public class Person {
    private String name;

    // return the person's name
    public String getName() {
        return name;
    }

    // change the name field to the passed value
    public void setName(String name) {
        this.name = name;
    }

    public Person(String newName) {
        name = newName;
    }

    // print a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello %s!", name);
    }

    public static void main(String[] args) {
//        Person person1 = new Person("Benjamin Buttons");
//        person1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//    }

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//    }
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}


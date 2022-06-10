public class Person {
    private String name;

    // return the person's name
    public String getName(){
        return name;
    }
    // change the name field to the passed value
    public void setName(String name){
        this.name = name;
    }
    // print a message to the console using the person's name
    public void sayHello(){
        System.out.printf("Hello %s %n!", name);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Benjamin Buttons");
        person1.sayHello();
    }

}


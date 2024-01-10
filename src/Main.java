public class Main {
    public static void main(String[] args) {
        Person person1=new Person("John","Doe",20);
        System.out.println("Person class outputs");
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("isTeen: "+person1.isTeen(person1.age));
        System.out.println("----------------------");

        Wall wall=new Wall(5,4);
        System.out.println("Wall class outputs");
        System.out.println("area= "+ wall.getArea());
        System.out.println("width="+wall.getWidth());
        wall.setWidth(10);
        System.out.println("new Width"+wall.getWidth());
        wall.setHeight(-1.5);
        System.out.println("height= "+ wall.getHeight());
        System.out.println("new Area= "+wall.getArea());
    }

}
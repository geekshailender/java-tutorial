public class Dog extends Animal {
    private String name;

    public Dog() {
        super();
    }

    @Override
    public void move(String speed){
        super.move(speed);
        System.out.println("speed");
    }
}


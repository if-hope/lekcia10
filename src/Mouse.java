public class Mouse extends Pet{

    private int speed;

    public Mouse(String name, int id, int age, int speed) {
        super(name, id, age);
        this.speed = speed;
    }

    public Mouse() {
    }

    public String makeHole(){
        return "Ha-ha, hole is there";
    }

    @Override
    public void eat() {
        System.out.println("I am eating cheese");
    }
}

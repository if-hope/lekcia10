public abstract class Pet {
    private String name;

    private int id;

    private int age;

    public Pet(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Pet() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(){
        System.out.println("I am going");
    }

    public abstract void eat();
}

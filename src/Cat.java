public class Cat extends Pet{

    private String favouriteFood;

    public Cat(String name, int id, int age, String favouriteFood) {
        super(name, id, age);
        this.favouriteFood = favouriteFood;
    }

    public Cat() {

    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String spendTime(){
        return "Hunting";

    }

    @Override
    public void move() {
        super.move();
        System.out.println("and hunting");
    }

    @Override
    public void eat() {
        System.out.println("I am eating meet");
    }
}

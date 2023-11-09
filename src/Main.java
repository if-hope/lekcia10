public class Main {
    public static void main(String[] args) {

    Cat cat = new Cat("Tom", 11, 3, "mouse");
    Mouse mouse = new Mouse("Cate", 12, 4, 10);
    cat.eat();
    mouse.eat();

    Breed breed = new Breed(77, "ttest", cat);
    breed.getKity().move();
    Pet cat2 = new Cat();
    Pet mouse2 = new Mouse();

    iCalculatable circle = new Circle();
    iCalculatable square = new Square();

    Figures.print(circle);
    Figures.print(square);

    }
}
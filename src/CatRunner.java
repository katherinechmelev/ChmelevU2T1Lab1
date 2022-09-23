public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat ("Sally", 6, 10);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Maya", 8, 9);
        cat2.introduce();
        cat2.printCatInfo();
    }
}

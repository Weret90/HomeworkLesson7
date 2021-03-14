public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        if (appetite <= 0) {
            System.out.println("Нельзя иметь нулевой или отрицательный аппетит, для кота " + name + " аппетит будет установлен на стандартный в 5 единиц");
            this.appetite = 5;
        } else {
            this.appetite = appetite;
        }
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (appetite > plate.getFood()) {
            System.out.println("кот " + name + " не наестся, не хватает еды");
            satiety = false;
        } else {
            System.out.println("кот " + name + " поел из миски");
            satiety = true;
        }
        plate.decreaseFood(appetite);
    }

    public void info() {
        if (satiety) {
            System.out.println("кот " + name + " сыт");
        } else {
            System.out.println("кот " + name + " голоден");
        }
    }

    public int getAppetite() {
        return appetite;
    }
}

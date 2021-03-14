public class Plate {
    private int food;

    public Plate(int food) {
        if (food < 0) {
            System.out.println("Нельзя иметь в тарелке отрицательное количество еды, значение будет изменено на плюсовое");
            this.food = -food;
        } else {
            this.food = food;
        }
    }

    public void info() {
        System.out.println("В тарелке осталось еды " + food + " единиц");
    }

    public void decreaseFood(int n) {
        if (n > food) {
            // ничего не происходит, еда остается нетронутой согласно задания
        } else {
            food -= n;
        }
    }

    public int getFood() {
        return food;
    }

    public void addFood(int food) { //метод добавляющий еду в тарелку
        if (food <= 0) {
            System.out.println("Нельзя добавить нулевое или отрицательное количество еды");
        } else {
            this.food += food;
            System.out.println("В тарелку добавили еды, теперь в ней еды " + this.food + " единиц");
        }
    }
}

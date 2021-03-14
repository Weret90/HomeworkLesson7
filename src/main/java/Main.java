public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(18);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Васька", 5);
        cats[1] = new Cat("Пушок", 3);
        cats[2] = new Cat("Борис", 6);
        cats[3] = new Cat("Багира", 5); //только этому коту не хватит еды и он останется голодным
        cats[4] = new Cat("Чернушка", 3);

        eatTime(plate, cats);

        plate.addFood(30);
        eatTime(plate, cats); //после добавления еды все коты будут сыты

        Cat errorCat = new Cat("Роджер", -2);
        System.out.println(errorCat.getAppetite()); //если в конструкторе укажут нулевое или отрицательное значение, аппетит будет установлен в 5 стандартных единиц

        Plate errorPlate = new Plate(-20); //отрицательная еда в миске изменит значение на плюсовое
        errorPlate.info();
    }

    public static void eatTime(Plate plate, Cat[] cats) {
        for (Cat cat : cats) {
            cat.info(); // метод покажет что коты изначально голодны согласно задания
            cat.eat(plate);
            cat.info();
            plate.info();
            System.out.println();
        }
    }
}

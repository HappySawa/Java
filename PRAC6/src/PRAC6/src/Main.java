package PRAC6.src;

public class Main {
    public static void main(String[] args) {
        // Посуда
        Dish cup = new Cup("Ceramic", 500, true);
        cup.use();
        cup.wash();

        Dish plate = new Plate("Ceramic", 500, true);
        plate.use();
        plate.wash();

        // Собаки
        Dog Doberman = new Doberman(3);
        Doberman.bark();
        Doberman.eat();

        Dog Corgi = new Corgi(2);
        Corgi.bark();
        Corgi.eat();

        // Тестирование мебели и магазина
        Furniture chair = new Chair("Iron", 2, true);
        chair.sit();
        chair.move();
        Furniture table = new Table("Glass", 10, 4);
        table.sit();
        table.move();

        FurnitureShop furnitureShop = new FurnitureShop("IKEA");
        furnitureShop.sell(chair);
        furnitureShop.sell(table);
    }
}
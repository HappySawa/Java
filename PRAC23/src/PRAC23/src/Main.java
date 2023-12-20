package PRAC23.src;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws OrderAlreadyException {
        ArrayList<String> dish = new ArrayList<>();
        dish.add("Пицца: Пепперони: 590");
        dish.add("Торт: Наполеон: 700");
        ArrayList<String> drink = new ArrayList<>();
        drink.add("Вода: Негазированная, Газированная: 60");
        drink.add("Сок: Апельсиновый, Яблочный: 190");
        System.out.println("Меню: ");
        for (String s: dish)
            System.out.println(s);
        for (String s: drink)
            System.out.println(s);

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addPosition(new Dish("Пицаа", "Пепперони", 590));
        restaurantOrder.addPosition(new Drink("Сок", "Апельсиновый", 190));
        System.out.println("\n Позиций в заказе: " + restaurantOrder.count());
        System.out.println(Arrays.toString(restaurantOrder.getDishes()));

        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        restaurantOrder1.addPosition(new Dish("Торт", "Наполеон", 700));
        restaurantOrder1.addPosition(new Drink("Вода", "Негазированная, Газированная", 160));
        System.out.println("\n Позиций в заказе: " + restaurantOrder1.count());
        System.out.println(Arrays.toString(restaurantOrder1.getDishes()));

        System.out.println("\n" + "Заказы в ресторане: ");
        OrderManager orderManager = new OrderManager();
        orderManager.add(restaurantOrder, 1);
        orderManager.add(restaurantOrder1, 2);
        System.out.println(orderManager.orders());

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addPosition(new Dish("Торт", "Наполеон", 700));
        internetOrder.addPosition(new Drink("Вода", "Негазированная, Газированная", 160));

        System.out.println("Интернет-заказ: ");
        orderManager.add(internetOrder, "тест ");
        System.out.println(orderManager.getInternetOrder());

    }
}
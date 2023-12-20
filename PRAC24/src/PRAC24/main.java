package PRAC24;

public class main {
    public static void main(String[] args) {

        Dish dish1 = new Dish("Паста", "Макароны с соусом", 500);
        Drink drink1 = new Drink("Кола", "Газированный напиток", 69);
        Dish dish2 = new Dish("Салат", "Свежий овощной салат", 300);
        Drink drink2 = new Drink("Чай", "Черный чай", 100);
        
        
 
        InternetOrder internetOrder1 = new InternetOrder();
        internetOrder1.addPosition(dish1);
        internetOrder1.addPosition(drink1);

        InternetOrder internetOrder2 = new InternetOrder();
        internetOrder2.addPosition(dish2);
        internetOrder2.addPosition(drink2);

     
        System.out.println("Заказ через интернет 1:");
        String[] dishes1 = internetOrder1.getDishes();
        for (String dish : dishes1) {
        System.out.println(dish);
        }
        System.out.println("Общая стоимость: " + internetOrder1.costAll());

        System.out.println("\nЗаказ через интернет 2:");
        String[] dishes2 = internetOrder2.getDishes();
        for (String dish : dishes2) {
        System.out.println(dish);
        }
        System.out.println("Общая стоимость: " + internetOrder2.costAll());
        
        
        
        
        RestaurantOrder order1 = new RestaurantOrder();
        order1.addPosition(dish1);
        order1.addPosition(drink1);

        RestaurantOrder order2 = new RestaurantOrder();
        order2.addPosition(dish2);
        order2.addPosition(drink2);

        OrderManager orderManager = new OrderManager();

        try {

            orderManager.add(order1, 1); 
        } catch (OrderAlreadyException e) {
 
            System.out.println("Стол уже занят! " + e.getMessage());
        }


  
        System.out.println("Заказ для стола 1:");
        System.out.println(orderManager.getOrder(1)); 
    }
}

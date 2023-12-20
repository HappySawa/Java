package PRAC24;

import java.util.ArrayList;
import java.util.List;

// Класс InternetOrder реализует интерфейс Order и представляет заказ, сделанный через интернет
public class InternetOrder implements Order {
    // Список пунктов заказа (блюд и напитков)
    List<Item> list = new ArrayList<>();

    // Метод для добавления пункта заказа
    public void addPosition(Item item){
        list.add(item);
    }

    // Метод для подсчета количества пунктов заказа
    public int count(){
        return list.size();
    }

    // Методы интерфейса Order

    // Метод для удаления пункта заказа по названию (блюда или напитка)
    @Override
    public boolean remove(String food) {
        return list.remove(food);
    }

    // Метод для удаления всех пунктов с определенным именем (блюда или напитка)
    @Override
    public void deleteAll(String name) {
        list.clear();
    }

    // Метод для получения информации о пунктах заказа (блюдах и напитках)
    @Override
    public String[] getDishes() {
        String[] str = new String[list.size()];
        for (int i = 0; i < list.size(); i++)
            str[i] = list.get(i).getName() + " " + list.get(i).getDescription() + " " + list.get(i).getCost();
        return str;
    }

    // Метод для подсчета общей стоимости всех пунктов заказа
    @Override
    public int costAll() {
        int sum = 0;
        for (Item item : list) sum += item.getCost();
        return sum;
    }

    // Метод для подсчета количества пунктов с заданным именем (блюда или напитка)
    @Override
    public int orderName(String p) {
        int k = 0;
        while (list.contains(p)) k++;
        return k;
    }
}

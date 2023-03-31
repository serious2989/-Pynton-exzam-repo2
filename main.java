import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Toys<Toy> toys = new Toys<>();
        Queue<Toy> queue = new PriorityQueue<>(Collections.reverseOrder());
        Save save = new Save();
        RandomDropRateNumber random = new RandomDropRateNumber();
        Toy toy1 = new Toy(1, "Robot", 2, random.rnd());
        Toy toy2 = new Toy(2, "Goblin", 3, random.rnd());
        Toy toy3 = new Toy(3, "Loli", 2, random.rnd());
        Toy toy4 = new Toy(3, "Fury", 2, random.rnd());
        toys.addToy(toy1);
        toys.addToy(toy2);
        toys.addToy(toy3);
        toys.addToy(toy4);
        System.out.println("List of Toys to order: \n" + toys.print());
        toys.sortByDroprate();
        System.out.println("List of Toys to get: \n" + toys.print());
        for (Toy toy : toys) {
            queue.add(toy);
        }
        save.saveResult(queue);
    }
}

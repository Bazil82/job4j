package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item.getId() + " : " + item.getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println("Please enter yours ID");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println("Please enter yours next name");
                String nextName = scanner.nextLine();
                Item newItem = new Item(nextName);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Replace is validate");
                } else {
                    System.out.println("Replace isn't validate");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.println("Please enter yours ID");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Delete is validate");
                } else {
                    System.out.println("Delete isn't validate");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by id ===");
                System.out.println("Please enter your ID");
                int id = Integer.valueOf(scanner.nextLine());
                Item resItem = tracker.findById(id);
                if (resItem != null) {
                    System.out.println(resItem.getId() + " : " + resItem.getName());
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find item by name ===");
                System.out.println("Please enter your name");
                String name = scanner.nextLine();
                Item[] res = tracker.findByName(name);
                if (res.length > 0) {
                    for (int i = 0; i < res.length; i++) {
                        System.out.println(res[i].getId() + " : " + res[i].getName());
                    }
                } else {
                    System.out.println("Items not found");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
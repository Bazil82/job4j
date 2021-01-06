package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsFindByName = new Item[this.size];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            Item elem = items[i];
            if (elem.getName().equals(key)) {
                itemsFindByName[size] = elem;
                size++;
            }
        }
        return Arrays.copyOf(itemsFindByName, size);
    }

    public boolean replace(int id, Item item) {
        boolean res = false;
        for (int i = 0; i < this.size; i++) {
            if (items[i].getId() == id) {
                items[i].setName(item.getName());
                res =  true;
            }
        }
        return res;
    }

    public boolean delete(int id) {
        boolean res = false;
        for (int i = 0; i < this.size; i++) {
            if (items[i].getId() == id) {
                items[i] = null;
                res = true;
                defrag(items);
                ids--;
                size--;
            }
        }
        return res;
    }

    public Item[] defrag(Item[] items) {
        Item temp;
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                temp = items[count];
                items[count] = items[i];
                items[i] = temp;
                count++;
            }
        }
        return items;
    }
}

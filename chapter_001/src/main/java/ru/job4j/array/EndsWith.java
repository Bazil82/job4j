package ru.job4j.array;

public class EndsWith {
    public static boolean endsW(char[] world, char[] post) {
        boolean res = true;
        for (int i = 0; i < post.length; i++) {
            if (world[world.length - i - 1] != post[post.length - i - 1]) {
                res = false;
                break;
            }
        }
        return res;
    }
}

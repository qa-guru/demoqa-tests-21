package com.demoqa.utils;

import java.security.SecureRandom;

public class RandomUtils {

    public static void main(String[] args) {
        System.out.println(getRandomString(10));
        System.out.println(getRandomString(10));
        System.out.println(getRandomEmail());
    }

    public static String getRandomString(int len) {
//        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));

        return sb.toString();
    }

    public static String getRandomEmail() {
        return getRandomString(15) + "@qa.guru";
//        return getRandomString(15) + "@" + getRandomString(5) + "." + getRandomString(5);
//        return String.format("%s@%s.%s", getRandomString(15),
//                getRandomString(5), getRandomString(5));
    }
}
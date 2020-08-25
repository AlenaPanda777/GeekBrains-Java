package ru.geekbrains.java1.lesson6.HW6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class HW6 {

    private static void method1() throws IOException {
        throw new IOException("Hello from method1");
    }

    private static void method2() {
        try {
            throw new IOException("Hello from method2");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream in;
        OutputStream out;
//Создать 2 текстовых файла, примерно по 50-100 символов в каждом
// (особого значения не имеет);
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("If1.txt", true));
            ps.printf("%s\n", "If\n" + "If you can keep your head when all about you\n" +
                    "Are losing theirs and blaming it on you,\n" +
                    "If you can trust yourself when all men doubt you,\n" +
                    "But make allowance for their doubting too;\n" +
                    "If you can wait and not be tired by waiting,\n" +
                    "Or being lied about, don’t deal in lies,\n" +
                    "Or being hated, don’t give way to hating,\n" +
                    "And yet don’t look too good, nor talk too wise:");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            PrintStream ps1 = new PrintStream(new FileOutputStream("If2.txt", true));
            ps1.println("If you can dream — and not make dreams your master;\n" +
                    "If you can think — and not make thoughts your aim;\n" +
                    "If you can meet with Triumph and Disaster\n" +
                    "And treat those two impostors just the same;\n" +
                    "If you can bear to hear the truth you’ve spoken\n" +
                    "Twisted by knaves to make a trap for fools,\n" +
                    "Or watch the things you gave your life to, broken,\n" +
                    "And stoop and build’em up with worn-out tools:");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Написать программу, «склеивающую» эти файлы,
        // то есть вначале идет текст из первого файла, потом текст из второго.
        Scanner scanner1 = new Scanner(new FileInputStream("If1.txt"));
        while (scanner1.hasNext()) {
            System.out.println(scanner1.nextLine());
        }
        Scanner scanner2 = new Scanner(new FileInputStream("If2.txt"));
        while (scanner2.hasNext()) {
            System.out.println(scanner2.nextLine());
        }
    }
}


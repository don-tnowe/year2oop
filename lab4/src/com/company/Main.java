package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Введите параметры шара!");

	    System.out.println("x: ");
        float orb_x = input.nextFloat();
        System.out.println("y: ");
        float orb_y = input.nextFloat();
        System.out.println("z: ");
        float orb_z = input.nextFloat();
        System.out.println("Радиус: ");
        float orb_rad = input.nextFloat();

        SpatialOrb orb = new SpatialOrb(orb_x, orb_y, orb_z,orb_rad);

        System.out.println("Какую точку проверить?");

        while (true) {
            System.out.println("x: ");
            float point_x = input.nextFloat();
            System.out.println("y: ");
            float point_y = input.nextFloat();
            System.out.println("z: ");
            float point_z = input.nextFloat();

            SpatialPoint point = new SpatialPoint(point_x, point_y, point_z);
            if (orb.contains(point))
                System.out.println("Да, точка внутри шара.");
            else
                System.out.println("Точка не находится внутри шара.");
        }
    }
}

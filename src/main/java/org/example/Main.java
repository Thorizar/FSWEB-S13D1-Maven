package org.example;

public class Main {
    public static void main(String[] args) {
        // ✅ shouldWakeUp Testleri
        System.out.println("shouldWakeUp:");
        System.out.println(shouldWakeUp(true, 1));    // true
        System.out.println(shouldWakeUp(false, 2));   // false
        System.out.println(shouldWakeUp(true, 8));    // false
        System.out.println(shouldWakeUp(true, -1));   // false

        // ✅ hasTeen Testleri
        System.out.println("\nhasTeen:");
        System.out.println(hasTeen(9, 99, 19));      // true
        System.out.println(hasTeen(23, 15, 42));     // true
        System.out.println(hasTeen(22, 23, 34));     // false

        // ✅ isCatPlaying Testleri
        System.out.println("\nisCatPlaying:");
        System.out.println(isCatPlaying(true, 10));   // false
        System.out.println(isCatPlaying(false, 36));  // false
        System.out.println(isCatPlaying(false, 35));  // true
        System.out.println(isCatPlaying(true, 40));   // true

        // ✅ area (Dikdörtgen) Testleri
        System.out.println("\narea (Rectangle):");
        System.out.println(area(5.0, 4.0));          // 20.0
        System.out.println(area(-1.0, 4.0));         // -1

        // ✅ area (Daire) Testleri
        System.out.println("\narea (Circle):");
        System.out.println(area(5.0));               // 78.53981633974483
        System.out.println(area(-1));                // -1
    }

    // 🐶 Köpek Havlama Kontrolü
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (!isBarking || clock < 0 || clock > 23) {
            return false;
        }
        return clock < 8 || clock > 20; // Gece 8 - Sabah 8 arası
    }

    // 👶 Teen Yaş Kontrolü
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    // 🐱 Kedi Oyun Kontrolü
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upperLimit;
    }

    // 📏 Dikdörtgen Alanı
    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1;
        return width * height;
    }

    // ⚪ Daire Alanı
    public static double area(double radius) {
        if (radius < 0) return -1;
        return Math.PI * radius * radius;
    }
}

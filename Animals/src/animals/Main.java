/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animals;

/**
 *
 * @author sabas
 */
import java.util.Scanner;

class Animal {
    int IDtag;
    String species;

    Animal(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID tag: ");
        IDtag = scanner.nextInt();
        System.out.print("Enter species: ");
        species = scanner.next();
    }

    void output() {
        System.out.println("ID Tag: " + IDtag);
        System.out.println("Species: " + species);
    }
}

class Bird extends Animal {
    int colour;

    Bird(int IDtag, String species, int colour) {
        super(IDtag, species);
        this.colour = colour;
    }

    void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather colour (1 = grey, 2 = white, 3 = black): ");
        colour = scanner.nextInt();
    }

    void output() {
        super.output();
        String[] colours = {"", "grey", "white", "black"};
        System.out.println("Feather Colour: " + colours[colour]);
    }
}

class Reptile extends Animal {
    double bloodTemp;

    Reptile(int IDtag, String species, double bloodTemp) {
        super(IDtag, species);
        this.bloodTemp = bloodTemp;
    }

    void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bloodTemp = scanner.nextDouble();
    }

    void output() {
        super.output();
        System.out.println("Blood Temperature: " + bloodTemp);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Bird Details:");
        Bird brd = new Bird(0, "", 0);
        brd.input();

        System.out.println("\nEnter Reptile Details:");
        Reptile rept = new Reptile(0, "", 0.0);
        rept.input();

        System.out.println("\nBird Details:");
        brd.output();

        System.out.println("\nReptile Details:");
        rept.output();
    }
}

    


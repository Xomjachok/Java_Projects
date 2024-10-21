package com.Rudeichuk.Objekty;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Vypis_Spotrebu {
    public static void vypisSpotrebu(String nazovSuboru) {
        vypocitajSpotrebu(nazovSuboru);
    }

    private static void vypocitajSpotrebu(String nazovSuboru) {
        try (BufferedReader citac = new BufferedReader(new FileReader(nazovSuboru))) {
            String riadok;
            while ((riadok = citac.readLine()) != null) {
                System.out.println(riadok);
            }
        } catch (IOException e) {
            System.out.println("Chyba pri čítaní zo súboru.");
        }
    }
}

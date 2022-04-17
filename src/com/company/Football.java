package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Football {
    private String Surname = " ";
    private LocalDate DateOfBirth = LocalDate.now();
    private String PlaceOfBirth;
    private String Role;
    private int NumGames;
    private int YellowCards;
    Random rand = new Random();
    LocalDate actualDate = LocalDate.now();

    public void setSurname(String surname) {
        if (surname.matches("[a-z,A-Z]+") && Character.isUpperCase(surname.charAt(0))) {
            Surname = surname;
        } else {
            Surname = " ";
        }
    }

    public String getSurname() {
        if (Surname.charAt(0) != 32) {
            return Surname;
        } else {
            System.out.println("Фамилия введена некоректно");
            System.exit(0);
            return " ";
        }
    }

    public void setDateOfBirth() {
        this.DateOfBirth = LocalDate.now().minusYears((int) (Math.random() * 18 + 18));

    }

    public void setPlaceOfBirth(String PlaceOfBirth) {
        this.PlaceOfBirth = PlaceOfBirth;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public void setNumGames() {
        this.NumGames = Math.round(rand.nextInt(20));
    }

    public void setYellowCards() {
        this.YellowCards = Math.round(rand.nextInt(3));
    }

    public void getFootballerInfo() {
        if (ChronoUnit.YEARS.between(DateOfBirth, actualDate) > 20 && YellowCards <= 1) {
            System.out.println("Surname : " + Surname);
            System.out.println("Date of birth : " + DateOfBirth);
            System.out.println("Place of birth : " + PlaceOfBirth);
            System.out.println("Role : " + Role);
            System.out.println("Number of games : " + NumGames);
            System.out.println("Yellow cards : " + YellowCards);
            System.out.println();
        }

    }
}

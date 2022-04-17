package com.company;

class Worker {
    private String Surname = " ";
    private byte Age;
    private String Education = " ";
    private String Position = " ";

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

    public void setAge(byte age) {
        if (age > 19 && age < 71) {
            Age = age;
        } else {
            Age = 0;
        }
    }

    public byte getAge() {
        if (Age != 0) {
            return Age;
        } else {
            System.out.println("Не подходящий возраст");
            System.exit(0);
            return 0;
        }
    }

    public void setEducation(String Edu) {
        if (Edu.equals("Without education") || Edu.equals("Higher education")) {
            Education = Edu;
        } else {
            Education = " ";

        }
    }

    public String getEducation() {
        if (Education.charAt(0) != 32) {
            return Education;
        } else {
            System.out.println("Образование введено некоректно");
            System.exit(0);
            return " ";
        }
    }

    public void setPosition(String position) {
        char P = position.charAt(0);
        if (position.matches("[a-z,A-Z]+") && Character.isUpperCase(position.charAt(0))) {
            Position = position;
        } else {
            Position = " ";
        }
    }

    public String getPosition() {
        if (Position.charAt(0) != 32) {
            return Position;
        } else {
            System.out.println("Должность введена некоректно");
            System.exit(0);
            return " ";
        }
    }

    public void getInfo() {
        System.out.println("[Surname : " + getSurname() + ", Age : " + getAge() + ", Education : " + getEducation() + " , Position : " + getPosition() + "]");
    }
}
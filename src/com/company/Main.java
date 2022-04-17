package com.company;


public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
    }

    /**
     * Вывести данные о работниках старших 30-ти лет, не
     * имеющих высшего образования.
     * Фамилия
     * Возраст
     * Образование
     * Должность
     */
    public static void task1() {
        Worker[] workers = new Worker[20];
        String Sur[] = {"Ivanov", "Alexeev", "Paseka", "Semenev"};
        String Edu[] = {"Without education", "Higher education"};
        String Pos[] = {"Manager", "Accountant", "Doctor"};
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
            workers[i].setSurname(Sur[(int) (Math.random() * 4)]);
            workers[i].setAge((byte) (Math.random() * 50 + 20));
            workers[i].setEducation(Edu[(int) (Math.random() * 2)]);
            workers[i].setPosition(Pos[(int) (Math.random() * 3)]);

            if (workers[i].getAge() > 30 && workers[i].getEducation().equals("Without education")) {
                workers[i].getInfo();
            }
        }
    }

    /**
     * Вывести сведения о футболистах, старших 20- лет и
     * получающих не более 1 карточки за 10 игр.
     *
     * Фамилия
     * Дата и место рождения
     * Амплуа
     * Количество игр
     * Количество жёлтых карточек
     */


    public static void task2() {
        Football Footballer1 = new Football();
        Football Footballer2 = new Football();
        Football Footballer3 = new Football();
        Football Footballer4 = new Football();
        Football Footballer5 = new Football();
        Football[] Footballers = new Football[] {Footballer1, Footballer2, Footballer3, Footballer4, Footballer5};
        String Surname[] = {"Ivanov", "Alexeev", "Paseka", "Semenev"};
        String Roles[] = {"Goalkeeper", "Defender", "Midfielder", "Forward"};
        String Place[] = {"Odessa","Kyiv", "Kharkiv", "Lviv", "Mykolaiv"};
        for (int i = 0; i < Footballers.length; i++) {
            Footballers[i].setSurname(Surname[(int)(Math.random() * Surname.length)]);
            Footballers[i].setRole(Roles[(int)(Math.random() * Roles.length)]);
            Footballers[i].setPlaceOfBirth(Place[(int)(Math.random() * Place.length)]);
            Footballers[i].setDateOfBirth();
            Footballers[i].setNumGames();
            Footballers[i].setYellowCards();
        }
        for (int i = 0; i < Footballers.length; i++) {
            Footballers[i].getFootballerInfo();
        }
    }
}


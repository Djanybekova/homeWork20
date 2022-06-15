package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Апта кунун жазыныз: ");
        switch (scanner.nextLine()){
            case "Дуйшомбу":
                Days monday = Days.MONDAY;
               monday.method();
                break;
            case "Шейшемби":
                Days tuesday = Days.TUESDAY;
                tuesday.method();
                break;
            case "Шаршемби":
                Days wednesday = Days.WEDNESDAY;
                wednesday.method();

                break;
            case "Бейшемби":
                Days thursday = Days.THURSDAY;
                thursday.method();
                break;
            case "Жума" :
                Days friday = Days.FRIDAY;
                friday.method();
            case "Ишемби":
                Days saturday =Days.SATURDAY;
                saturday.method();
                break;
            case "Жекшемби":
                Days sunday = Days.SUNDAY;
                sunday.method();
                break;
            default:
                System.out.println("Сиз туура эмес жаздыныз ");
        }
    }
}

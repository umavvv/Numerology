package com.example.boot.model;

import com.example.boot.SectorFunction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/*
Данный класс должен получать дату рождения от пользователя из класса TelegramConnect
и выполнять определенную логику, путем которого делит на сектора
!!!!! Класс на этапе доработки
 */

public class Calculate implements SectorFunction {

    private String calculate() {
        // Логика для корректной работы с полученными данными
        LocalDate localDate = LocalDate.of(1984, 8, 18);
        String replace = String.valueOf(localDate).replace("-", "");
        int num1 = Integer.parseInt(replace);;
        int sum;
        for (sum = 0; num1 > 0; num1 /= 10) {
            sum += num1 % 10;
        }
        int num2 = sum;
        int sum2;
        for (sum2 = 0; num2 > 0; num2 /= 10) {
            sum2 += num2 % 10;
        }
        String replace2 = String.valueOf(localDate.getDayOfMonth()).replace("0", "");
        String replaceResult = String.valueOf(replace2.charAt(0));
        int re = Integer.parseInt(replaceResult);
        int sum3 = sum - 2 * re;
        int num = sum3;

        int sum4;
        for (sum4 = 0; num > 0; num /= 10) {
            sum4 += num % 10;
        }
        List<Integer> list = new ArrayList();
        list.add(Integer.valueOf(replace));
        list.add(sum);
        list.add(sum2);
        list.add(sum3);
        list.add(sum4);
        String sector = list.toString().replace(",", "")
                .replace(" ", "").replace("[", "")
                .replace("]", "").replace("0", "");
        System.out.println(sector);
        return sector;
    }
    // Получен сектор Personality
    public void getPersonality(){
        String w = calculate();
        String x = w.replace("2","")
                .replace("3","")
                .replace("4","")
                .replace("5","")
                .replace("6","")
                .replace("7","")
                .replace("8","")
                .replace("9","");
        System.out.println(x);

    }
    // Получен сектор Energy
    public void getEnergy(){
        String w = calculate();
        String x = w.replace("1","")
                .replace("3","")
                .replace("4","")
                .replace("5","")
                .replace("6","")
                .replace("7","")
                .replace("8","")
                .replace("9","");
        System.out.println(x);
    }
    // Получен сектор Interest
    public void getInterest(){
        String w = calculate();
        String x = w.replace("1","")
                .replace("2","")
                .replace("4","")
                .replace("5","")
                .replace("6","")
                .replace("7","")
                .replace("8","")
                .replace("9","");
        System.out.println(x);
    }
    //Получен сектор Health
    public void getHealth(){
        String w = calculate();
        String x = w.replace("1","")
                .replace("2","")
                .replace("3","")
                .replace("5","")
                .replace("6","")
                .replace("7","")
                .replace("8","")
                .replace("9","");
        System.out.println(x);
    }
    // Получен сектор Logic
    public void getLogic(){
        String w = calculate();
        String x = w.replace("1","")
                .replace("2","")
                .replace("3","")
                .replace("4","")
                .replace("6","")
                .replace("7","")
                .replace("8","")
                .replace("9","");
        System.out.println(x);
    }
    // Получен сектор Labour
    public void getLabour(){
        String w = calculate();
        String x = w.replace("1","")
                .replace("2","")
                .replace("3","")
                .replace("4","")
                .replace("5","")
                .replace("7","")
                .replace("8","")
                .replace("9","");
        System.out.println(x);

    }
    // Получен сектор Luck
    public void getLuck(){
        String w = calculate();
        String x = w.replace("1","")
                .replace("2","")
                .replace("3","")
                .replace("4","")
                .replace("5","")
                .replace("6","")
                .replace("8","")
                .replace("9","");
        System.out.println(x);


    }
    // Получен сектор Debt
    public void getDebt(){
        String w = calculate();
        String x = w.replace("1","")
                .replace("2","")
                .replace("3","")
                .replace("4","")
                .replace("5","")
                .replace("6","")
                .replace("7","")
                .replace("9","");
        System.out.println(x);

    }
    // Получен сектор Memory
    public void getMemory(){
        String w = calculate();
        String x = w.replace("1","")
                .replace("2","")
                .replace("3","")
                .replace("4","")
                .replace("5","")
                .replace("6","")
                .replace("7","")
                .replace("8","");
        System.out.println(x);

    }
}
package com.reveta.tarasHelp;

public class Main {
    public static void main(String[] args) {
        //Ініцілізація
        StringCase strCase = new StrіngCase("TestString");
        StringChanger strChanger = new StringChanger();

        // Гетер
        System.out.println(strCase.getMainString());
        // Сетер
        strCase.setMainString("Taras, you can do it!");
        System.out.println(strCase.getMainString());

        //StringChanger.reversString(String) - метод який приймає
        // стрічку і повертає її у реверсному вигляді
        String reversString = strChanger.reversString(strCase.getMainString());
        System.out.println(reversString.equals("!ti od nac uoy ,saraT")); //Має повернути True

        //StringChanger.getStringArray(String) - метод який приймає
        // стрічку і повертає масив де в кожній комірці є одна буква стрічки
        String[] arrayString = StringChanger.getStringArray(strCase.getMainString());
        System.out.println(arrayString[0].equals("T"));
        System.out.println(arrayString[arrayString.length -1].equals("!"));


    }


}

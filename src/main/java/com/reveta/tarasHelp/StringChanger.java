package com.reveta.tarasHelp;

public class StringChanger {

/**
 * public - метод публічний - можна викликати у будь якому іншому класі
 * String[] - повертає масив стрічок - тут вказується що повертає метод (або void якщшо нічого не повертає)
 * getStringArray - назва метода, за якою ми потім зможемо його викликати
 * (String mainString) :
 * () - в круглих дужках, ми вкахуємо, що при виклику цього метода ми маємо дати йому яке значення
 * String mainString - вказуємо тип змінної і даємо їй локальну назву,
 * яку ми зможемо викорисолвувати в алгоритмі метода(логіці метода)
 * */
    public String[] getStringArray(String mainString) {
        // Створюємо масив який матисе стільки комірок скільки є символів у стрічці
        String[] strArr = new String[mainString.length()];

        //Створили цикл який матиме стільки ітерацій, скільки символів у стрічці
        for (int i = 0; i < mainString.length(); i++) {

            char getOneChar = mainString.charAt(i); //взяти букву з стрічки за її індексом
            String castToString = String.valueOf(getOneChar); //перетворити в стрічку
            strArr[i] = castToString; // помістити в масив
        }

        return strArr; //Сказали методу повернути масив із стрічками
    }

    public String reversString(String mainString) {
        StringBuilder stringBuilder = new StringBuilder(mainString); //Стоврюємо об'єкт для роботи із стрічкою
        StringBuilder reverse = stringBuilder.reverse(); //викликаємо до цього об'єкта метод який розвертає стрічку
        String toString = reverse.toString();
        return toString; //виводимо цей обєкт як стрічку
    }
}

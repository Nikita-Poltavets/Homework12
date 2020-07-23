package com.homework.nix;

import com.homework.nix.task.service.GroupByDateAndTime;
import com.homework.nix.task.service.MaxDurationDate;
import com.homework.nix.task.service.impl.GroupByDateAndTimeImpl;
import com.homework.nix.task.service.impl.MaxDurationDateImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Zaporozhye");
        LocalDateTime dateTime = LocalDateTime.now(zoneId);

        LocalDate localDate2 = LocalDate.of(2020, 7, 20);
        LocalTime localTime2 = LocalTime.of(12, 12 ,13);
        LocalDate localDate3 = LocalDate.of(2020, 7, 21);
        LocalTime localTime3 = LocalTime.of(12, 12 ,12);
        LocalDate localDate4 = LocalDate.of(2024, 7, 20);
        LocalTime localTime4 = LocalTime.of(1, 1 ,1);
        LocalDateTime dateTime2 = LocalDateTime.of(localDate2.plusDays(3), localTime2);
        LocalDateTime dateTime3 = LocalDateTime.of(localDate3.plusDays(3), localTime3);
        LocalDateTime dateTime4 = LocalDateTime.of(localDate4.plusDays(3), localTime4);



        List<LocalDateTime> list = new ArrayList<>();
        list.add(dateTime);
        list.add(dateTime3);
        list.add(dateTime2);
        list.add(dateTime4);

        System.out.println("1. Для списка объектов типа LocalDateTime вернуть ассоциативный массив (Map) LocalDate -> Set<LocalTime>, \n" +
                "\tсгруппировав дату/время по дате. Записи в map отсортировать по порядку дат.");
        GroupByDateAndTime group = new GroupByDateAndTimeImpl();
        System.out.println(group.groupByTime(list) + "\n");


        System.out.println("2. Дан список дат (LocalDateTime). \n" +
                "\tНайти наибольшее расстояние (Duration) между двумя датами.");
        MaxDurationDate maxDurationDate = new MaxDurationDateImpl();
        maxDurationDate.findMaxDuration(list);
    }
}

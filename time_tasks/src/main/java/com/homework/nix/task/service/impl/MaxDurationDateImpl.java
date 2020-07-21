package com.homework.nix.task.service.impl;

import com.homework.nix.task.service.MaxDurationDate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxDurationDateImpl implements MaxDurationDate {

    @Override
    public void findMaxDuration(List<LocalDateTime> list) {

        Duration duration = list
                .stream()
                .sorted()
                .map(l -> Duration.between((list.get(0)), (list.get(list.size() - 1))))
                .findAny()
                .get();
        Period period = list
                        .stream()
                        .sorted()
                        .map(p -> Period.between((list.get(0)).toLocalDate(), (list.get(list.size() - 1)).toLocalDate()))
                        .findAny()
                        .get();



        System.out.printf("%d - Years, %d - Months, %d - Days, %d - Hours, %d - Minutes, %d - Seconds",
                period.getYears(), period.getMonths(), period.getDays(), duration.toHoursPart(),
                duration.toMinutesPart(), duration.toSecondsPart());
    }
}

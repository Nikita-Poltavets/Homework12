package com.homework.nix.task.service.impl;

import com.homework.nix.task.service.GroupByDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByDateAndTimeImpl implements GroupByDateAndTime {

    @Override
    public Map<LocalDate, Set<LocalTime>> groupByTime(List<LocalDateTime> localDateTimes) {

        return localDateTimes
                .stream()
                .sorted(Comparator.comparing(LocalDateTime::toLocalDate))
                .collect(Collectors.toMap(LocalDateTime::toLocalDate, t -> getSetLocalTime(t.toLocalTime()), (v1, v2) -> v1, TreeMap::new));
    }

    private Set<LocalTime> getSetLocalTime(LocalTime localTime){
        Set<LocalTime> setLocalTimes = new HashSet<>();
        setLocalTimes.add(localTime);

        return setLocalTimes;
    }
}

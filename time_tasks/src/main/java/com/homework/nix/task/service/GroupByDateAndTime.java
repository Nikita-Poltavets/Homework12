package com.homework.nix.task.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface GroupByDateAndTime {

    Map<LocalDate, Set<LocalTime>> groupByTime(List<LocalDateTime>localDateTimes);
}

package ru.javawebinar.topjava.service;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDate;
import java.util.List;

public interface MealService {
    Meal get(int id, int userId);

    void delete(int id, int userId);

    List<Meal> getAll(int userId);

    void deleteAll(int userId);

    void update(Meal meal, int userId);

    Meal save(Meal meal, int userId);

    List<Meal> getBetween(LocalDate startDate, LocalDate endDate, int userId);

}
package ru.javawebinar.topjava.service;

import org.springframework.stereotype.Service;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.repository.MealRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class MealServiceImpl implements MealService {

    private MealRepository repository;

    public Meal get(int id, int userId) {
        return null;
    }

    public void delete(int id, int userId) {

    }

    public List<Meal> getAll(int userId) {
        return null;

    }

    public void deleteAll(int userId) {

    }

    public void update(Meal meal, int userId) {

    }

    public Meal save(Meal meal, int userId) {
        return null;
    }

    public List<Meal> getBetween(LocalDate startDate, LocalDate endDate, int userId) {
        return null;

    }
}
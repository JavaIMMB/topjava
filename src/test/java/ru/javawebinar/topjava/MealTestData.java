package ru.javawebinar.topjava;

import org.springframework.test.web.servlet.result.ModelResultMatchers;
import ru.javawebinar.topjava.model.AbstractBaseEntity;
import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.time.Month;

public class MealTestData {
    public static final int MEAL_ID = AbstractBaseEntity.START_SEQ + 2;

    public static final Meal MEAL1 = new Meal(MEAL_ID, LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500);
    public static final Meal MEAL2 = new Meal(MEAL_ID + 1, LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Обед", 1000);
    public static final Meal MEAL3 = new Meal(MEAL_ID + 2, LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Ужин", 500);
    public static final Meal MEAL4 = new Meal(MEAL_ID + 3, LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Завтрак", 1000);
    public static final Meal ADMIN_MEAL = new Meal(MEAL_ID + 4, LocalDateTime.of(2015, Month.JUNE, 1, 14, 0), "Админ ланч", 510);

    public static Meal getCreated() {
        return new Meal(null, LocalDateTime.of(2015, 1, 8, 18, 0), "created", 300);
    }






}

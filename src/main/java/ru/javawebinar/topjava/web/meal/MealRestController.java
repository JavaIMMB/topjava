package ru.javawebinar.topjava.web.meal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.service.MealService;
import ru.javawebinar.topjava.service.MealServiceImpl;
import ru.javawebinar.topjava.to.MealWithExceed;
import ru.javawebinar.topjava.util.MealsUtil;
import ru.javawebinar.topjava.web.SecurityUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
public class MealRestController {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private MealService service;

    public Meal get(int id) {
        int userId = SecurityUtil.authUserId();
        log.info("get meal {} for User{}", id, userId);
        return service.get(id, userId);
    }

    public void delete(int id) {
        int userId = SecurityUtil.authUserId();
        log.info("delete meal {} for User{}", id, userId);
        service.delete(id, userId);
    }

    public List<MealWithExceed> getAll() {
        int userId = SecurityUtil.authUserId();
        log.info("get all for User{}", userId);
        return MealsUtil.getFilteredWithExceeded(service.getAll(userId), SecurityUtil.authUserCaloriesPerDay(),LocalTime.MIN, LocalTime.MAX);
    }

    public void deleteAll() {
        int userId = SecurityUtil.authUserId();
        log.info("delete all for User{}", userId);
        service.deleteAll(userId);
    }

    public void update(Meal meal) {
        int userId = SecurityUtil.authUserId();
        log.info("update {} for User{}", meal, userId);
        service.update(meal, userId);
    }

    public Meal create(Meal meal) {
        int userId = SecurityUtil.authUserId();
        log.info("create {} for User{}", meal, userId);
        return service.save(meal, userId);
    }

    public List<Meal> getBetween(LocalDate startDate, LocalDate endDate) {
        int userId = SecurityUtil.authUserId();
        log.info("getBetween {} and {} for User{}", startDate, endDate, userId);
        return service.getBetween(startDate, endDate, userId);
    }


}
package ru.javawebinar.topjava.service;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Exchanger;

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringRunner.class)
abstract public class DbTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private DbPopulator dbPopulator;

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        dbPopulator.execute();
        userService.evictCache();
    }
}

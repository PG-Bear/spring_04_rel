package icu.insomniac.service;

import icu.insomniac.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testSave(){
        userService.save();
    }

    @Test
    public void testUpdate(){
        userService.update();
    }

    @Test
    public void testDelete(){
        userService.delete();
    }
}

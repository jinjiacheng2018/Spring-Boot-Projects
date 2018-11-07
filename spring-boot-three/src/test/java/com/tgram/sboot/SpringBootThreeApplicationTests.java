package com.tgram.sboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootThreeApplicationTests
{
    @Autowired
    private FilterRegistrationBean filterRegistrationBean;

    @Test
    public void contextLoads()
    {
        System.out.println("*******^_^*******");
        filterRegistrationBean.getFilter().destroy();
    }
    
}

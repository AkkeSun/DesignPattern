package com.example.designpattern.factoryBean;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BeanFactoryTest {

    @Autowired
    BeanFactory beanFactory;

    @Test
    void test(){
        BaseBean bean = beanFactory.getBean(1);
        log.info(bean.getData());

        BaseBean bean2 = beanFactory.getBean(2);
        log.info(bean2.getData());

        BaseBean bean3 = beanFactory.getBean(3);
        log.info(bean3.getData());
    }

}

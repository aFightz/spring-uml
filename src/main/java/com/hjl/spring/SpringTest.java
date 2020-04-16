package com.hjl.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringTest {
    /**
     *
     */
    public void test(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("xxx.xml"));
    }
}

package com.springinaction.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;


public class KnightMain {

   public static void main(String[] args) throws Exception {
      //loads the beans from a config file and wires them together
      AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(com.springinaction.knights.config.KnightBeans.class);
      Knight knight = context.getBean(Knight.class);
      knight.embarkOnQuest();
      context.close();
   }

}
package com.springinaction.knights;

import org.springframework.context.support.
      ClassPathXmlApplicationContext;


public class KnightMain {

   public static void main(String[] args) throws Exception {
      //loads the beans from a config file and wires them together
      ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext(
                  "META-INF/spring/knightbeans.xml");
      Knight knight = context.getBean(Knight.class);
      knight.embarkOnQuest();
      context.close();
   }

}
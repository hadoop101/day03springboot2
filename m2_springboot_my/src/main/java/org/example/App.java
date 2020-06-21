package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //启动tomcat
        SpringApplication.run(App.class,args) ;//参1：当前main所在的类的字节 参2：main的参数
    }
}

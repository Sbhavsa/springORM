package com.com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
       Dao dao =(Dao)con.getBean("dao");
      // model m1= new model(2,"sena","maninagar");
     //  dao.insertuser(m1);
       
      // model m = dao.getmodelbyid(1);
      //  System.out.println(m);
       
      // List<model> list = dao.grtallmodel();
       //  System.out.println(list);
       
    //   model m1 = new model(2, "java", "ahrhhgd"); 
    //   dao.updatemodel(m1);
       
    //   model m= dao.getmodelbyid(2);
    //   dao.deletemodel(m);
       model m = dao.getmodelbyid(1);
       System.out.println(m);
    }
}
							
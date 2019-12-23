package com.qf.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.qf.entity.Score;
import com.qf.entity.Student;
import org.junit.Test;

import java.util.ArrayList;

public class GsonDemo1 {

    /**
     * 解析简单的json数据
     */
    @Test
    public void test1() {
        //前端传递过来一个字符串
        String str = "{\"name\":\"张三\",\"age\":23,\"gender\":\"男\"}";
        Gson gson = new Gson();

        Student student = gson.fromJson(str, Student.class);

        System.out.println(student);


    }



    /**
     * 解析复杂的json格式数据
     */

    @Test
    public void test2() {
        //json字符串
        String json = "{name:'张三',age:23,gender:'男',score:{englishScore:88,mathScore:66}}";


        Gson gson = new Gson();

        Student student = gson.fromJson(json, Student.class);

        System.out.println(student);

    }



    @Test
    public void test3() {
        String json = "[{englishScore:23,mathScore:34},{englishScore:45,mathScore:66}]";




        Gson gson =new Gson();

//        ArrayList<Score> arrayList = gson.fromJson(json, ArrayList<Score>.class);
//
//        for (Object o : arrayList) {
//            System.out.println(o);
//        }


        //解析成有具体的类型的集合
        //实例化TypeToken,TypeToken的泛型为fromJson返回的对象类型
        //构造方法的访问修饰符为protected,需要new 类名<泛型>(){}
        //这里的空参构造方法权限修饰符是protected,那木只有其子类可访问，预示着要使用子类构造。
        //new TypeToken<List<Score>>(){}是一个匿名内部类，其等价MyTypeToken<List<Score>> extends TypeToken(){}

        TypeToken<ArrayList<Score>> arrayListTypeToken = new TypeToken<ArrayList<Score>>(){};
        ArrayList<Score> list = gson.fromJson(json, arrayListTypeToken.getType());
        for(Score score: list){
            System.out.println(score);
        }


    }


}

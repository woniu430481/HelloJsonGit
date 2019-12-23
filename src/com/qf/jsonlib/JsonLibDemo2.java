package com.qf.jsonlib;

import com.qf.entity.Score;
import com.qf.entity.Student;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JsonLibDemo2 {


    @Test
    public void testDemo1(){

        Score score = new Score(34.0,23.0);

        JSONObject jsonObject = new JSONObject(score);
        String json = jsonObject.toString();

        System.out.println("json:"+json);


    }

    @Test
    public void testDemo2(){
        Score score = new Score(34,78);
        //2,复杂的对象
        Student stu = new Student("woow",23,"女",score);
        JSONObject jsonObject = new JSONObject(stu);
        System.out.println(jsonObject.toString());


    }


    @Test
    public void testDemo3(){
        //3,将集合转换成json字符串
        List<Score> list = new ArrayList<>();
        Score score1 = new Score(34,65);
        Score score2 = new Score(34,65);
        list.add(score1);
        list.add(score2);
        JSONArray jsonArray = new JSONArray(list);
        System.out.println(jsonArray.toString());


    }




}

package com.qf.fastjson;

import com.alibaba.fastjson.JSON;
import com.qf.entity.Score;
import com.qf.entity.Student;
import org.junit.Test;

import java.util.List;

public class FastJsonDemo1 {

    /**
     * 简单的json格式解析成对象
     */
    @Test
    public void test1() {
        String str = "{\"name\":\"张三\",\"age\":23,\"gender\":\"男\"}";


        Student student = JSON.parseObject(str, Student.class);

        System.out.println(student);

    }


    /**
     * 复杂的json格式解析成对象
     */
    @Test
    public void test2(){
        String json = "{name:'张三',age:23,gender:'男',score:{englishScore:88,mathScore:66}}";
        Student student = JSON.parseObject(json, Student.class);
        System.out.println(student);
    }


    /**
     * 数组形式的json字符串
     */
    @Test
    public void test3() {
        String json = "[{englishScore:23,mathScore:34},{englishScore:45,mathScore:66}]";

        List<Score> scores = JSON.parseArray(json, Score.class);

        for (Score score : scores) {
            System.out.println(score);
        }

    }



}

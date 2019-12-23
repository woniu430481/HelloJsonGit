package com.qf.fastjson;

import com.alibaba.fastjson.JSON;
import com.qf.entity.Score;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FastJsonDemo2 {


    @Test
    public void test(){
        //1，普通的对象转成字符串
        Score score = new Score(23,45);
        String str = JSON.toJSONString(score);
        System.out.println(str);

        //3,将集合转换成json字符串
        List<Score> list = new ArrayList<>();
        Score score1 = new Score(34,65);
        Score score2 = new Score(34,65);
        list.add(score1);
        list.add(score2);
        String str2 = JSON.toJSONString(list);
        System.out.println(str2);
    }


}

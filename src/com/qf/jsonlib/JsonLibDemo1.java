package com.qf.jsonlib;

import com.qf.entity.Score;
import com.qf.entity.Student;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class JsonLibDemo1 {


    /**
     * 简单格式的json字符串
     * @throws JSONException
     */

    @Test
    public void testDemo1() throws JSONException {

        //前端传递过来一个字符串
        String str = "{\"name\":\"张三\",\"age\":23,\"gender\":\"男\"}";

        JSONObject jsonObject = new JSONObject(str);

        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");
        String gender = jsonObject.getString("gender");

        //

        //封装对象
//        Student stu = new Student();
//        stu.setName(name);


        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("gender:"+gender);


    }

    /**
     * 解析对象里面嵌套对象的json字符串
     * @throws JSONException
     */
    @Test
    public void testDemo2() throws JSONException {
        //json字符串
        String json = "{name:'张三',age:23,gender:'男',score:{englishScore:88,mathScore:66}}";

        JSONObject jsonObject = new JSONObject(json);

        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");
        String gender = jsonObject.getString("gender");

        //嵌套的json对象
        JSONObject score = jsonObject.getJSONObject("score");
        double englishScore = score.getDouble("englishScore");
        double mathScore = score.getDouble("mathScore");

        Score score1 = new Score();

        score1.setEnglishScore(englishScore);

        Student stu = new Student();
        stu.setScore(score1);

        System.out.println("englishScore:"+englishScore);
        System.out.println("mathScore:"+mathScore);


    }


    /**
     * 解析数组形式的json格式
     * @throws JSONException
     */
    @Test
    public void testDemo3() throws JSONException {
        String json = "[{englishScore:23,mathScore:34},{englishScore:45,mathScore:66}]";

        //
        JSONArray array = new JSONArray(json);




        for (int i = 0; i < array.length(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);

            double englishScore = jsonObject.getDouble("englishScore");
            double mathScore = jsonObject.getDouble("mathScore");

            System.out.println("englishScore:"+englishScore);
            System.out.println("mathScore:"+mathScore);

        }


    }



}

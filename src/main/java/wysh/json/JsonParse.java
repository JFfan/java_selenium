package wysh.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class JsonParse {

    public static void main(String[] args) {
        parseJson();
    }

    public static void parseJson() {
        String json =
                "{" +
                    "\"code\":200," +
                    "\"data\":{" +
                        "\"pageVo\":" +
                            "{\"pageViewCount\":15,\"likeCount\":100}," +
                        "\"result\":" +
                            "[" +
                            "{\"name\":\"fjf\",\"age\":23,\"sex\":\"m\"}," +
                            "{\"name\":\"wyb\",\"age\":22,\"sex\":\"w\"}" +
                            "]" +
                    "}" +
                "}";

        JSONObject jojoba = JSONObject.parseObject(json);

        String data = jojoba.getString("data");

        /*JSONObject dataJson = JSONObject.parseObject(data);

        Page page = dataJson.getObject("pageVo", Page.class);
        String count5 = page.getTotal();
        System.out.println("total --> " + page);
        String total = page.getTotal();
        System.out.println("total --> " + total);

        // 方法1 ：result是数组类型的多个结果列表
        JSONArray result = dataJson.getJSONArray("result");
        List<Person> persons = result.toJavaList(Person.class);
        System.out.println("total2 --> " + persons);
        int total2 = persons.size();
        System.out.println("total2 --> " + total2);

        // 方法2 ：result是数组类型的多个结果列表
        // String result2 = dataJson.getString("result");
        List<Person> personList = JSONArray.parseArray(dataJson.getString("result"), Person.class);
        System.out.println("total3 --> " + personList);
        int total3 = personList.size();
        System.out.println("total3 --> " + total3);*/

        // 方法3 ：result是数组类型的多个结果列表
        Data data1 = JSONObject.parseObject(data, Data.class);
        int pageViewCount = data1.getPageVo().getPageViewCount();
        int likeCount = data1.getPageVo().getLikeCount();
        System.out.println("data1 --> " + data1);
        System.out.println("pageViewCount --> " + pageViewCount);
        System.out.println("likeCount --> " + likeCount);
        int countTrue = 89;

        if (pageViewCount != countTrue) {
            System.out.println("条数不对,返回条数不为 -->  " + countTrue);
        }

        List<Person> list = data1.getResult();
        for (int i =0; i<list.size(); i++) {
            Person person = list.get(i);
            System.out.println(person.getName());
        }

        for (Person person : list) {
            System.out.println(person.getName());
        }

        list.forEach(person -> {
            System.out.println(person.getName());
        });

    }
}

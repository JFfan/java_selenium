package wysh.json2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sun.xml.internal.ws.util.StringUtils;
import wysh.json.Page;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Json {
    public static void main(String[] args) {
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
        jsonParse(json);
        massageParse("String message");
    }

    public static void jsonParse(String json) {
        /*JSONObject jobj = JSON.parseObject(json);
        String data = jobj.getString("data");
        Data lc = JSONObject.parseObject(data,Data.class);
        System.out.println(lc);*/

        Response response = JSONObject.parseObject(json,Response.class);
        Person[] result = response.getData().getResult();

        System.out.println(response);
        System.out.println(result[0].getName());

    }

    public static void massageParse(String message) {
        String str = "用户：654321，的验证码是：【123456】";
        getyzm(str,6);
    }
    /**
     * 从短信字符窜提取验证码
     * @param body 短信内容
     * @param YZMLENGTH  验证码的长度 一般6位或者4位
     * @return 接取出来的验证码
     */
    public static String getyzm(String body,int YZMLENGTH) {
        // 首先([a-zA-Z0-9]{YZMLENGTH})是得到一个连续的六位数字字母组合
        // (?<![a-zA-Z0-9])负向断言([0-9]{YZMLENGTH})前面不能有数字
        // (?![a-zA-Z0-9])断言([0-9]{YZMLENGTH})后面不能有数字出现


//	获得数字字母组合
//    Pattern p = Pattern   .compile("(?<![a-zA-Z0-9])([a-zA-Z0-9]{" + YZMLENGTH + "})(?![a-zA-Z0-9])");

//	获得纯数字
        Pattern p = Pattern.compile("(?<![0-9])([0-9]{" + YZMLENGTH+ "})(?![0-9])");

        Matcher m = p.matcher(body);
        if (m.find()) {
            System.out.println(m.group());
            return m.group(0);
        }
        return null;
    }
}

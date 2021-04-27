package wysh.json3;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import javafx.scene.control.Skin;
import org.openqa.selenium.json.Json;
import wysh.json.JsonParse;

import java.awt.*;
import java.util.Date;
import java.util.List;

public class ResPonse {
    private static boolean Failure;

    public static void main(String[] args){
        messageResponse();
    }

    /*public static void responseJson() {
        String resPose = "{\"code\":0,\"msg\":\"操作成功！\",\"data\":[{\"skuNo\":\"SK000025\",\"sid\":\"300502517\",\"skuType\":1,\"skuFrom\":\"B2B\",\"skuModel\":\"12mm/30-40米/700线/1/3\\\" DIS/PAL制/DC12V/ICR/塑料外壳\",\"skuName\":\"DS-2CE16A2P-IT3P(12mm)(国内标配)\",\"skuDesc\":\"陈鹏测试添加\",\"referPrice\":133.0,\"retailPrice\":146.3,\"retailPriceCoefficient\":1.1,\"wholesalePrice\":120.0,\"wholesalePriceCoefficient\":0.9,\"referWeight\":\"0.680\",\"weight\":\"0.68\",\"sales\":0,\"b2bSkuStatus\":0,\"b2bType\":1,\"catagoryId\":70,\"skuStatus\":0,\"syncTime\":\"2021-04-15 16:36:29\",\"updatedBy\":\"chenpeng56\",\"updatedTime\":\"2021-04-15 16:36:28\"},{\"skuNo\":\"SK000025\",\"sid\":\"300502517\",\"skuType\":1,\"skuFrom\":\"B2B\",\"skuModel\":\"12mm/30-40米/700线/1/3\\\" DIS/PAL制/DC12V/ICR/塑料外壳\",\"skuName\":\"DS-2CE16A2P-IT3P(12mm)(国内标配)\",\"skuDesc\":\"陈鹏测试添加\",\"referPrice\":133.0,\"retailPrice\":146.3,\"retailPriceCoefficient\":1.1,\"wholesalePrice\":120.0,\"wholesalePriceCoefficient\":0.9,\"referWeight\":\"0.680\",\"weight\":\"0.68\",\"sales\":0,\"b2bSkuStatus\":0,\"b2bType\":1,\"catagoryId\":70,\"skuStatus\":0,\"syncTime\":\"2021-04-15 16:36:29\",\"updatedBy\":\"chenpeng56\",\"updatedTime\":\"2021-04-15 16:36:28\"}],\"count\":2}";
        //JSONObject res = JSON.parseObject(resPose);
        //System.out.println(res);
        //获取返回值code
        ResPonseAll re = JSONObject.parseObject(resPose,ResPonseAll.class);
        int code = re.getCode();
        System.out.println(re+">>>>>>>>>>");
        System.out.println(code);

        int contentId = re.getData().getContentId();
        System.out.println(contentId);

        Industry ins = JSONObject.parseObject(resPose,Industry.class);
        System.out.println(ins+">>>>>>>>>>");

        int[] scopeCollection = re.getData().getScopeCollection();
        System.out.println(scopeCollection[0]+""+scopeCollection[1]);
    }*/

    public static void messageResponse(){
        String reMessage1 = "{\"code\":0,\"msg\":\"操作成功！\",\"data\":[{\"skuNo\":\"SK000025\",\"sid\":\"300502517\",\"skuType\":1,\"skuFrom\":\"B2B\",\"skuModel\":\"12mm/30-40米/700线/1/3\\\" DIS/PAL制/DC12V/ICR/塑料外壳\",\"skuName\":\"DS-2CE16A2P-IT3P(12mm)(国内标配)\",\"skuDesc\":\"陈鹏测试添加\",\"referPrice\":133.0,\"retailPrice\":146.3,\"retailPriceCoefficient\":1.1,\"wholesalePrice\":120.0,\"wholesalePriceCoefficient\":0.9,\"referWeight\":\"0.680\",\"weight\":\"0.68\",\"sales\":0,\"b2bSkuStatus\":0,\"b2bType\":1,\"catagoryId\":70,\"skuStatus\":0,\"syncTime\":\"2021-04-15 16:36:29\",\"updatedBy\":\"chenpeng56\",\"updatedTime\":\"2021-04-15 16:36:28\"},{\"skuNo\":\"SK000026\",\"sid\":\"300502517\",\"skuType\":1,\"skuFrom\":\"B2B\",\"skuModel\":\"12mm/30-40米/700线/1/3\\\" DIS/PAL制/DC12V/ICR/塑料外壳\",\"skuName\":\"DS-2CE16A2P-IT3P(12mm)(国内标配)\",\"skuDesc\":\"陈鹏测试添加\",\"referPrice\":133.0,\"retailPrice\":146.3,\"retailPriceCoefficient\":1.1,\"wholesalePrice\":120.0,\"wholesalePriceCoefficient\":0.9,\"referWeight\":\"0.680\",\"weight\":\"0.68\",\"sales\":0,\"b2bSkuStatus\":0,\"b2bType\":1,\"catagoryId\":70,\"skuStatus\":0,\"syncTime\":\"2021-04-15 16:36:29\",\"updatedBy\":\"chenpeng56\",\"updatedTime\":\"2021-04-15 16:36:28\"}],\"count\":2}";
        String reMessage2 = "{\"code\":0,\"msg\":\"操作成功！\",\"data\":{\"accountNo\":\"ZH20201012101816267498\",\"merchantNo\":\"hik0005301\",\"merchantName\":\"HKws\",\"merchantType\":3,\"depositStatus\":10,\"auditStatus\":20,\"merchantStatus\":0,\"auditTime\":\"2020-11-16 16:18:53\",\"reason\":\"\"}}";
        JSONObject re1 = JSON.parseObject(reMessage1);
        JSONArray dataList = re1.getJSONArray("data");

        if(dataList.toJSONString().contains("SK000025")){
            Failure = false;
            System.out.println("测试通过");
           }else{
             Failure = true;
                System.out.println("失败！");
            }
        }

//        for(int i=0;i<dataList.size();i++){
//            JSONObject jsonObject1 = dataList.getJSONObject(i);
//            String skuNo = jsonObject1.getString("skuNo");
//            System.out.println(skuNo);
//            if(skuNo.contains("SK000025")){
//                Failure = false;
//                System.out.println("测试通过");
//            }else{
//                Failure = true;
//                System.out.println("失败！");
//            }
//        }




//        JSONObject re2 = JSON.parseObject(reMessage2);
//        Integer code = re2.getInteger("code");
//        System.out.println(code+">>>>>>>>>>>>>>>>>");
//
//        String dd =re2.getString("data");
//        System.out.println(dd+">>>>>>>>>>>>>>>>>>>");
//
//        JSONObject dd1 =JSON.parseObject(dd);
//        String accountNo = dd1.getString("accountNo");
//        System.out.println(accountNo+">>>>>>>>>>>>>>");
//
//        //ResPonseAll rr = JSONObject.parseObject(reMessage,ResPonseAll.class);
//        JSONObject jsonObject = JSON.parseObject(reMessage1);
//        JSONArray data = jsonObject.getJSONArray("data");
//
//        //List<Sku> skuList = rr.getData();
//        //System.out.println(JSON.toJSONString(skuList));
//        System.out.println(data.toJSONString());
//        data.forEach(x->{
//            JSONObject x1 = (JSONObject) x;
//            Integer sid = x1.getInteger("sid");
//            System.out.println(sid);
//        });
//        int count = data.size();
//        System.out.println(count+">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<");
//        for(int i=0;i<data.size();i++){
//            JSONObject jsonObject1 = data.getJSONObject(i);
//            Date syncTime = jsonObject1.getDate("syncTime");
//            Integer sid = jsonObject1.getInteger("sid");
//            System.out.println(sid);
//            System.out.println(syncTime.toString());
//
//        }
    }



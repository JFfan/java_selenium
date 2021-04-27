package wysh.json3;

import java.util.List;

public class ResPonseAll {
    private int code;
    private String msg;
    //private Data data;
    private List<Sku> data;

    public ResPonseAll() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Sku> getData() {
        return data;
    }

    public void setData(List<Sku> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResPonseAll{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

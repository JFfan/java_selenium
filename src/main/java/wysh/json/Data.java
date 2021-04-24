package wysh.json;

import java.util.List;

public class Data {
    private Page pageVo;

    private List<Person> result;

    public Data() {
    }

    public Page getPageVo() {
        return pageVo;
    }

    public void setPageVo(Page pageVo) {
        this.pageVo = pageVo;
    }

    public List<Person> getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Data{" +
                "pageVo=" + pageVo +
                ", result=" + result +
                '}';
    }

    public void setResult(List<Person> result) {
        this.result = result;
    }

}
